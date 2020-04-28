package cn.sznk.terrace.putCotraller;

import cn.sznk.terrace.bean.*;
import cn.sznk.terrace.putService.SafeRiskService;
import cn.sznk.terrace.utils.E3Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SafeRiskCotraller {
    @Autowired
    private SafeRiskService safeRiskService;

    //7天异常设备数量接口
    @ResponseBody
    @GetMapping("/safe/safeRiskMonitorNum")
    public E3Result safeRiskMonitorNumShow(String date, HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        //监控
        List<TitileNumBean> titileNumBeans = safeRiskService.safeRiskMonitorNum(date,dept);
        List<AbstinenceGradeBean> gradeBeans = new ArrayList<>();
        AbstinenceGradeBean gradeBean=new AbstinenceGradeBean();
        gradeBean.setType("监控设备");
        gradeBean.setNumber(titileNumBeans);
        gradeBeans.add(gradeBean);

        List<TitileNumBean> envirNum = safeRiskService.safeRiskEnvirNum(date,dept);
        AbstinenceGradeBean gradeBean1=new AbstinenceGradeBean();
        gradeBean1.setType("环控设备");
        gradeBean1.setNumber(envirNum);
        gradeBeans.add(gradeBean1);


        return E3Result.ok(gradeBeans);
    }

    //设备异常详细页 线性图表接口
    @ResponseBody
    @GetMapping("/safe/monthBadMonitorNum")
    public E3Result monthBadMonitorNum(String type,String date, HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
//        System.out.println(type+" "+date);
        List<TitileNumBean> titileNumBeans=new ArrayList<>();
        if (type.equals("监控")){
            titileNumBeans = safeRiskService.safeRiskDetilsNum(date,dept);
        }
        if (type.equals("环控")){
            titileNumBeans=safeRiskService.safeRiskEnvir(date,dept);
        }
        return E3Result.ok(titileNumBeans);
    }

    //设备异常详细页 说明图表接口
    @ResponseBody
    @GetMapping("/safe/todayBadMonitor")
    public E3Result todayBadMonitorShow(String page, String limit,String type, String date, HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        UserTable userTable = new UserTable();
        if (type.equals("监控")){
            userTable = safeRiskService.safeRiskDetilsData(page, limit, date,dept);
        }
        if (type.equals("环控")){
            userTable = safeRiskService.safeRiskEnvirData(page, limit, date,dept);
        }
        return E3Result.ok(userTable);
    }

    //当天设备异常个数接口
    @ResponseBody
    @GetMapping("/safe/todayBadMonitorNum")
    public E3Result todayBadMonitorNum(String date, HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        BadEuiqment euiqment = safeRiskService.safeRiskTodayBadNum(date,dept);
        return E3Result.ok(euiqment);
    }

    //当天监控设备状态接口
    @ResponseBody
    @GetMapping("/safe/todatBadMsg")
    public E3Result todatBadMsg(String date,String group,String page,String limit, HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        UserTable userTable = safeRiskService.todayMonitorStatus(page, limit, date, group,dept);
        return E3Result.ok(userTable);
    }
    //当天环控设备状态接口
    @ResponseBody
    @GetMapping("/safe/todayEnvirStatus")
    public E3Result todayEnvirStatus(String date,String page,String limit, HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        UserTable userTable = safeRiskService.todayEnvirStatus(page, limit, date,dept);
        return E3Result.ok(userTable);
    }
    //视频监控
    @ResponseBody
    @GetMapping("/safe/videoFour")
    public E3Result videoFour(Integer id, HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        return safeRiskService.videoSurveillance(id,dept);
    }

    //全部视频接口
    @ResponseBody
    @GetMapping("/safe/allVideo")
    public E3Result allVideo(HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        return safeRiskService.allVideoSurveillance(dept);
    }

    //重点危险性人员
    @ResponseBody
    @GetMapping("/safe/keyManShow")
    public E3Result keyManShow(String date, HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        List<TbKeyman> tbKeymen = safeRiskService.safeRiskKeyMan(dept);
        return E3Result.ok(tbKeymen);
    }
}
