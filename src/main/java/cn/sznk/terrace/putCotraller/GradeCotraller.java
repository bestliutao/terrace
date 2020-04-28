package cn.sznk.terrace.putCotraller;

import cn.sznk.terrace.bean.*;
import cn.sznk.terrace.putService.GradeService;
import cn.sznk.terrace.utils.E3Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class GradeCotraller {
    @Autowired
    private GradeService gradeService;

    //戒治分数统计详细页 平均分接口
    @ResponseBody
    @RequestMapping(value = "/grade/allAvg")
    public E3Result allAvg(String type, String year, HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        List<TitileNumBean> titileNumBeans=new ArrayList<>();
        switch (type){
            case "全部":
                titileNumBeans = gradeService.avgGradeAll(year,dept);
                break;
            case "一年期":
                titileNumBeans = gradeService.avgGradeOtherYear(type, year,dept);
                break;
            case "生理脱毒期":
                titileNumBeans = gradeService.avgGradeOtherAbs(type, year,dept);
                break;
            case "期满":
                titileNumBeans = gradeService.avgGradeOtherAll(type, year,dept);
                break;
        }

        return E3Result.ok(titileNumBeans);
    }

    //戒治效能统计（人数/分数）
    @ResponseBody
    @RequestMapping(value = "/grade/gradeShow")
    public E3Result gradeShow(String date, HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        List<AbstinenceGradeBean> gradeBeans = gradeService.abstinenceGrade(date,dept);
        return E3Result.ok(gradeBeans);
    }

    //戒治统计 6个月 平均分统计
    @ResponseBody
    @RequestMapping(value = "/grade/sixMonthGrade")
    public E3Result sixMonthGrade(String date, HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        List<AbstinenceGradeBean> gradeBeans = new ArrayList<>();
        AbstinenceGradeBean gradeBean=new AbstinenceGradeBean();
        List<TitileNumBean> year = gradeService.sixMonthsYear(date,dept);
        gradeBean.setType("一年期");
        gradeBean.setNumber(year);
        gradeBeans.add(gradeBean);

        AbstinenceGradeBean gradeBean1=new AbstinenceGradeBean();
        List<TitileNumBean> allYear = gradeService.sixMonthsAll(date,dept);
        gradeBean1.setType("期满");
        gradeBean1.setNumber(allYear);
        gradeBeans.add(gradeBean1);

        AbstinenceGradeBean gradeBean2=new AbstinenceGradeBean();
        List<TitileNumBean> absYear = gradeService.sixMonthsAbs(date,dept);
        gradeBean2.setType("生理脱毒期");
        gradeBean2.setNumber(absYear);
        gradeBeans.add(gradeBean2);

        AbstinenceGradeBean gradeBean3=new AbstinenceGradeBean();
        List<TitileNumBean> all = gradeService.sixMonths(date,dept);
        gradeBean3.setType("全部");
        gradeBean3.setNumber(all);
        gradeBeans.add(gradeBean3);

        return E3Result.ok(gradeBeans);
    }


    //人员6大类分数
    @ResponseBody
    @RequestMapping(value = "/grade/sixManMonthShow")
    public E3Result sixManMonthShow(String id,String date, HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        List<TbGrademonth> tbGrademonths = gradeService.manSixMonth(id, date,dept);
        return E3Result.ok(tbGrademonths);
    }

    //全部人员分数
    @ResponseBody
    @RequestMapping(value = "/grade/detils/allStudentGrade")
    public E3Result allStudentGradeDetils(String type,String statge,String time,String pageNo,String pageSize, HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        UserTable userTable = gradeService.statgeStudentGrade(type, statge, time, pageNo, pageSize,dept);
        return E3Result.ok(userTable);
    }

    //扣分最多
    @ResponseBody
    @RequestMapping(value = "/grade/detils/deductPoints")
    public E3Result deductPointsShow(String type,String statge,String time,String pageNo,String pageSize, HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        UserTable userTable = gradeService.deductPoints(type, statge, time, pageNo, pageSize,dept);
        return E3Result.ok(userTable);
    }

    //加分最多
    @ResponseBody
    @RequestMapping(value = "/grade/detils/bonusPoints")
    public E3Result bonusPointsShow(String type,String statge,String time,String pageNo,String pageSize, HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        UserTable userTable = gradeService.bonusPoints(type, statge, time, pageNo, pageSize,dept);
        return E3Result.ok(userTable);
    }
}
