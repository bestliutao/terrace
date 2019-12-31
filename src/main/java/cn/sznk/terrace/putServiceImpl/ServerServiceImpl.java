package cn.sznk.terrace.putServiceImpl;

import cn.sznk.terrace.putService.ServerServices;
import cn.sznk.terrace.utils.E3Result;
import cn.sznk.terrace.utils.SnmpTest;
import com.sun.org.apache.bcel.internal.generic.LNEG;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServerServiceImpl implements ServerServices {
    private String ip="localhost";
    private String community="public";
    private SnmpTest snmpTest = new SnmpTest();
    private String upInSd,upOutSd;
    //获取CPU使用率
    public E3Result getCpu(){
        List<String> oidList=new ArrayList<String>();
		//原始用户cpu时间
		oidList.add(".1.3.6.1.4.1.2021.11.50.0");
		//原始nice cpu时间
		oidList.add(".1.3.6.1.4.1.2021.11.51.0");
		//原始系统cpu时间
		oidList.add(".1.3.6.1.4.1.2021.11.52.0");
		//原始空闲cpu时间
		oidList.add(".1.3.6.1.4.1.2021.11.53.0");
		//ssCpuRawWait
		oidList.add(".1.3.6.1.4.1.2021.11.54.0");
		//ssCpuRawInterrupt
		oidList.add(".1.3.6.1.4.1.2021.11.56.0");
		//ssCpuRawSoftIRQ
		oidList.add("1.3.6.1.4.1.2021.11.61.0");
        List<String> strings = snmpTest.testGetList(ip, community, oidList);
        double cpuRatio=0;
        if (strings!=null){
            if (strings.get(0)==null||strings.get(1)==null||strings.get(2)==null||strings.get(3)==null||strings.get(4)==null||
                    strings.get(5)==null||strings.get(6)==null){
                return E3Result.ok();
            }
            double ssCpuRawUser =Double.parseDouble(strings.get(0));
            double ssCpuRawNice =Double.parseDouble(strings.get(1));
            double ssCpuRawSystem = Double.parseDouble(strings.get(2));
            double ssCpuRawIdle =Double.parseDouble(strings.get(3));
            double ssCpuRawWait =Double.parseDouble(strings.get(4));
            double ssCpuRawInterrupt =Double.parseDouble(strings.get(5));
            double ssCpuRawSoftIRQ = Double.parseDouble(strings.get(6));
            cpuRatio = 100*(ssCpuRawUser+ssCpuRawNice+ssCpuRawSystem+
                    ssCpuRawWait+ssCpuRawInterrupt+ssCpuRawSoftIRQ)/(ssCpuRawUser+ssCpuRawNice
                    +ssCpuRawSystem+ssCpuRawIdle+ssCpuRawWait+ssCpuRawInterrupt+ssCpuRawSoftIRQ);
        }
		return E3Result.ok(cpuRatio);
    }
    //获取内存使用率
    public E3Result getMemory(){
        List<String> oidList=new ArrayList<String>();
        //机器中的总RAM
        oidList.add(".1.3.6.1.2.1.25.2.3.1.5.1");
        //已使用的总RAM
        oidList.add(".1.3.6.1.2.1.25.2.3.1.6.1");
        List<String> strings = snmpTest.testGetList(ip, community, oidList);
        double memoryRatio = 0;
        if (strings!=null){
            if (strings.get(0)==null||strings.get(1)==null){
                return E3Result.ok();
            }
            double allMemory =Double.parseDouble(strings.get(0));
            double useMemory =Double.parseDouble(strings.get(1));
//        System.out.println(allMemory+"    "+useMemory);
            memoryRatio= 100*(useMemory)/(allMemory);
        }
       
        return E3Result.ok(memoryRatio);
    }
    //获取磁盘使用率
    public E3Result getDisk(){
        List<String> oidList=new ArrayList<String>();
        //磁盘上已使用的空间百分比
        oidList.add(".1.3.6.1.4.1.2021.9.1.9.1");
        List<String> strings = snmpTest.testGetList(ip, community, oidList);
        double diskRatio = 0;
        if(strings!=null){
            if (strings.get(0)==null){
                return E3Result.ok();
            }
            diskRatio=Double.parseDouble(strings.get(0));
        }
        
        return E3Result.ok(diskRatio);
    }

    //获取网络速率
    public E3Result getIntent(){
        List<String> oidList=new ArrayList<String>();
        //机器中的总RAM
        oidList.add(".1.3.6.1.2.1.31.1.1.1.6.2");
        //已使用的总RAM
        oidList.add(".1.3.6.1.2.1.31.1.1.1.10.2");
        List<String> strings = snmpTest.testGetList(ip, community, oidList);
        long in = 0,out = 0;
        if (strings!=null){
            if (strings.get(0)==null||strings.get(1)==null){
                return E3Result.ok();
            }
            if(upOutSd==null&&upInSd==null){
                upInSd=strings.get(0);
                upOutSd=strings.get(1);
                return E3Result.ok();
            }
            in = (Long.valueOf(strings.get(0)) - Long.valueOf(upInSd)) / 5;
            out=(Long.valueOf(strings.get(1)) - Long.valueOf(upOutSd)) / 5;

            upInSd=strings.get(0);
            upOutSd=strings.get(1);
            System.out.println(upInSd+""+upOutSd);
        }
        
        return E3Result.ok(in+"+"+out);
    }

    //服务运行状态监测
    public E3Result getStatus(){
        Process p;
        String cmd="lsof -i:8081";
        String result=null;
        try
        {
            p = Runtime.getRuntime().exec(cmd);
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            result = sb.toString();
            try {
                p.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            br.close();
            p.destroy();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        if(result==null||result.equals("")){
            return E3Result.ok(0);
        }else{
            return E3Result.ok(1);
        }

    }

    //服务 start
    public E3Result serviceStart(){
        Process p;
        String cmd="/home/colins/project/start.sh";
        String result=null;
        try
        {
            p = Runtime.getRuntime().exec(cmd);
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            result = sb.toString();
            System.out.println(result);
            try {
                p.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            br.close();
            p.destroy();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return E3Result.ok();
    }
    //服务stop
    public E3Result serivceStop(){
        Process p;
        String cmd="/home/colins/project/stop.sh";
        String result=null;
        try
        {
            p = Runtime.getRuntime().exec(cmd);
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            result = sb.toString();
            System.out.println(result);
            try {
                p.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            br.close();
            p.destroy();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        if(result==null||result.equals("")){
            return E3Result.ok(0);
        }else{
            return E3Result.ok(1);
        }
    }
}
