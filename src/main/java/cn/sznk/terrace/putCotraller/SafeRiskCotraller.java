package cn.sznk.terrace.putCotraller;

import cn.sznk.terrace.bean.*;
import cn.sznk.terrace.putService.SafeRiskService;
import cn.sznk.terrace.utils.E3Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SafeRiskCotraller {
    @Autowired
    private SafeRiskService safeRiskService;

    //7天异常设备数量接口
    @ResponseBody
    @GetMapping("/safe/safeRiskMonitorNum")
    public E3Result safeRiskMonitorNumShow(String date){
        //监控
        List<TitileNumBean> titileNumBeans = safeRiskService.safeRiskMonitorNum(date);
        List<AbstinenceGradeBean> gradeBeans = new ArrayList<>();
        AbstinenceGradeBean gradeBean=new AbstinenceGradeBean();
        gradeBean.setType("监控设备");
        gradeBean.setNumber(titileNumBeans);
        gradeBeans.add(gradeBean);

        List<TitileNumBean> envirNum = safeRiskService.safeRiskEnvirNum(date);
        AbstinenceGradeBean gradeBean1=new AbstinenceGradeBean();
        gradeBean1.setType("环控设备");
        gradeBean1.setNumber(envirNum);
        gradeBeans.add(gradeBean1);


        return E3Result.ok(gradeBeans);
    }

    //设备异常详细页 线性图表接口
    @ResponseBody
    @GetMapping("/safe/monthBadMonitorNum")
    public E3Result monthBadMonitorNum(String type,String date){
//        System.out.println(type+" "+date);
        List<TitileNumBean> titileNumBeans=new ArrayList<>();
        if (type.equals("监控")){
            titileNumBeans = safeRiskService.safeRiskDetilsNum(date);
        }
        if (type.equals("环控")){
            titileNumBeans=safeRiskService.safeRiskEnvir(date);
        }
        return E3Result.ok(titileNumBeans);
    }

    //设备异常详细页 说明图表接口
    @ResponseBody
    @GetMapping("/safe/todayBadMonitor")
    public E3Result todayBadMonitorShow(String page, String limit,String type, String date){
        UserTable userTable = new UserTable();
        if (type.equals("监控")){
            userTable = safeRiskService.safeRiskDetilsData(page, limit, date);
        }
        if (type.equals("环控")){
            userTable = safeRiskService.safeRiskEnvirData(page, limit, date);
        }
        return E3Result.ok(userTable);
    }

    //当天设备异常个数接口
    @ResponseBody
    @GetMapping("/safe/todayBadMonitorNum")
    public E3Result todayBadMonitorNum(String date){
        BadEuiqment euiqment = safeRiskService.safeRiskTodayBadNum(date);
        return E3Result.ok(euiqment);
    }

    //当天监控设备状态接口
    @ResponseBody
    @GetMapping("/safe/todatBadMsg")
    public E3Result todatBadMsg(String date,String group,String page,String limit){
        UserTable userTable = safeRiskService.todayMonitorStatus(page, limit, date, group);
        return E3Result.ok(userTable);
    }
    //当天环控设备状态接口
    @ResponseBody
    @GetMapping("/safe/todayEnvirStatus")
    public E3Result todayEnvirStatus(String date,String page,String limit){
        UserTable userTable = safeRiskService.todayEnvirStatus(page, limit, date);
        return E3Result.ok(userTable);
    }
    //视频监控
    @ResponseBody
    @GetMapping("/safe/videoFour")
    public E3Result videoFour(Integer id){
        return safeRiskService.videoSurveillance(id);
    }

    //全部视频接口
    @ResponseBody
    @GetMapping("/safe/allVideo")
    public E3Result allVideo(){
        return safeRiskService.allVideoSurveillance();
    }

    //重点危险性人员
    @ResponseBody
    @GetMapping("/safe/keyManShow")
    public E3Result keyManShow(String date){
        List<TbKeyman> tbKeymen = safeRiskService.safeRiskKeyMan();
        return E3Result.ok(tbKeymen);
    }
}
