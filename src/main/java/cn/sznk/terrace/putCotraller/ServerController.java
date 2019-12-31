package cn.sznk.terrace.putCotraller;

import cn.sznk.terrace.putService.ServerServices;
import cn.sznk.terrace.utils.E3Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Controller
public class ServerController {
    @Autowired
    private ServerServices serverServices;
    //获取CPU使用率
    @ResponseBody
    @RequestMapping(value = "/server/getCpu")
    public E3Result getCpu(String date,String token){
        return serverServices.getCpu();
    }
    //获取内存使用率
    @ResponseBody
    @RequestMapping(value = "/server/getMemory")
    public E3Result getMemory(String date,String token){
        return serverServices.getMemory();
    }
    //获取磁盘使用率
    @ResponseBody
    @RequestMapping(value = "/server/getDisk")
    public E3Result getDisk(String date,String token){
        return serverServices.getDisk();
    }

    //获取网络速率
    @ResponseBody
    @RequestMapping(value = "/server/getIntent")
    public E3Result getIntent(String date,String token){
        return serverServices.getIntent();
    }
    //服务运行状态监测
    @ResponseBody
    @RequestMapping(value = "/server/getStatus")
    public E3Result getStatus(String date,String token){
        return serverServices.getStatus();
    }

    //服务 start
    @ResponseBody
    @RequestMapping(value = "/server/serviceStart")
    public E3Result serviceStart(){
        return serverServices.serviceStart();
    }
    //服务stop
    @ResponseBody
    @RequestMapping(value = "/server/serviceStop")
    public E3Result serivceStop(){
        return serverServices.serivceStop();
    }
}

