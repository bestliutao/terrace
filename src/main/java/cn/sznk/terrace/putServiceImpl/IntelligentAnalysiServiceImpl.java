package cn.sznk.terrace.putServiceImpl;

import cn.sznk.terrace.bean.*;
import cn.sznk.terrace.mapper.TbDynamicalarmMapper;
import cn.sznk.terrace.mapper.TbInsidenumberMapper;
import cn.sznk.terrace.putService.IntelligentAnalysiService;
import cn.sznk.terrace.putService.SafeRiskService;
import cn.sznk.terrace.utils.E3Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class IntelligentAnalysiServiceImpl implements IntelligentAnalysiService {
    @Autowired
    private TbDynamicalarmMapper tbDynamicalarmMapper;
    @Autowired
    private TbInsidenumberMapper tbInsidenumberMapper;

    //当天警情数量
    public int todayPoliceNum(String date){
        int todayPoliceNum = tbDynamicalarmMapper.findTodayPoliceNum(date);
        return todayPoliceNum;
    }
    //当天未处理的设备警情数量
    public int todayEquipmentPoliceNum(String date){
        int i = tbDynamicalarmMapper.equipmentPolice(date);
        return i;
    }
    //当天未处理的设备警情数量
    public int todayPeoplePoliceNum(String date){
        int i = tbDynamicalarmMapper.peoplePolice(date);
        return i;
    }

    //当天未处理的警情
    public UserTable todayUntreatedPolice(String pageNo,String pageSize,String date){
        List<TbDynamicalarm> untreatedPolice = tbDynamicalarmMapper.findUntreatedPolice(date);

        List<Object> list = new ArrayList<>();
        UserTable userTable = new UserTable();
        userTable.setTotal(untreatedPolice.size());
        userTable.setLast((int)Math.round(untreatedPolice.size()/4+0.5));
        //添加三个对应数据
        if(Integer.valueOf(pageNo)<(int)Math.round(untreatedPolice.size()/4+0.5)){
            for (int i=0;i<4;i++){
                int num  =(Integer.valueOf(pageNo)*4-4+i);
                list.add(untreatedPolice.get(num));
            }
        }else {
            for (int i=Integer.valueOf(pageNo)*4-4;i<untreatedPolice.size();i++){
                list.add(untreatedPolice.get(i));
            }
        }
        userTable.setData(list);

        return userTable;
    }
    //7天警情分布
    public List<TitileNumBean> policeDistribution(String date){
        List<TitileNumBean> titileNumBeans = new ArrayList<>();
        String[] dd=date.split("-");
        String ltTime=date;
        String gtTime;
        if(Integer.valueOf(dd[2])>=6){
            gtTime=dd[0]+"-"+dd[1]+"-"+(Integer.valueOf(dd[2])-6);
        }else {
            gtTime=dd[0]+"-"+(Integer.valueOf(dd[1])-1)+"-"+(24+Integer.valueOf(dd[2]));
        }
//        System.out.println(gtTime+"  "+date);
        TitileNumBean titileNumBean = new TitileNumBean();
        titileNumBean.setTitle("一大队");
        titileNumBean.setNumber(String.valueOf(tbDynamicalarmMapper.findPoliceDistribution(ltTime,gtTime,"一大队")));
        titileNumBeans.add(titileNumBean);

        TitileNumBean titileNumBean1 = new TitileNumBean();
        titileNumBean1.setTitle("二大队");
        titileNumBean1.setNumber(String.valueOf(tbDynamicalarmMapper.findPoliceDistribution(ltTime,gtTime,"二大队")));
        titileNumBeans.add(titileNumBean1);

        TitileNumBean titileNumBean2 = new TitileNumBean();
        titileNumBean2.setTitle("三大队");
        titileNumBean2.setNumber(String.valueOf(tbDynamicalarmMapper.findPoliceDistribution(ltTime,gtTime,"三大队")));
        titileNumBeans.add(titileNumBean2);

        TitileNumBean titileNumBean3 = new TitileNumBean();
        titileNumBean3.setTitle("四大队");
        titileNumBean3.setNumber(String.valueOf(tbDynamicalarmMapper.findPoliceDistribution(ltTime,gtTime,"四大队")));
        titileNumBeans.add(titileNumBean3);

        TitileNumBean titileNumBean4 = new TitileNumBean();
        titileNumBean4.setTitle("五大队");
        titileNumBean4.setNumber(String.valueOf(tbDynamicalarmMapper.findPoliceDistribution(ltTime,gtTime,"五大队")));
        titileNumBeans.add(titileNumBean4);
        return titileNumBeans;
    }

    //警情细节页
    public UserTable policeDetils(String pageNo, String pageSize, String group){
       TbDynamicalarmExample example = new TbDynamicalarmExample();
       example.createCriteria().andAlarmGroupEqualTo(group);
        List<TbDynamicalarm> tbDynamicalarms = tbDynamicalarmMapper.selectByExample(example);

        List<Object> list = new ArrayList<>();
        UserTable userTable = new UserTable();
        userTable.setTotal(tbDynamicalarms.size());
        userTable.setLast((int)Math.round(tbDynamicalarms.size()/20+0.5));
        //添加三个对应数据
        if(Integer.valueOf(pageNo)<(int)Math.round(tbDynamicalarms.size()/20+0.5)){
            for (int i=0;i<20;i++){
                int num  =(Integer.valueOf(pageNo)*20-20+i);
                list.add(tbDynamicalarms.get(num));
            }
        }else {
            for (int i=Integer.valueOf(pageNo)*20-20;i<tbDynamicalarms.size();i++){
                list.add(tbDynamicalarms.get(i));
            }
        }
        userTable.setData(list);
        return userTable;
    }

    //所内人数接口
    public E3Result inSideChange(){
        TbInsidenumber tbInsidenumber = tbInsidenumberMapper.selectByPrimaryKey(1);
        return E3Result.ok(tbInsidenumber);
    }
}
