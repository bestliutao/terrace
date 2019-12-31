package cn.sznk.terrace.putCotraller;

import cn.sznk.terrace.bean.TbGrademonth;
import cn.sznk.terrace.bean.TbTrainee;
import cn.sznk.terrace.bean.TitileNumBean;
import cn.sznk.terrace.bean.UserTable;
import cn.sznk.terrace.mapper.TbTraineeMapper;
import cn.sznk.terrace.putService.AbstinenceEfficacyService;
import cn.sznk.terrace.utils.E3Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AbstinenceEfficacyCotraller {

    @Autowired
    private AbstinenceEfficacyService abstinenceEfficacyService;
    @Autowired
    private TbTraineeMapper tbTraineeMapper;


    //戒治人员详细档案页
    @ResponseBody
    @GetMapping("/absDetils")
    public E3Result absDetils(String id,HttpSession session){
        TbTrainee tbTrainee = tbTraineeMapper.selectByPrimaryKey(id);
        session.setAttribute("absFile",tbTrainee);
        return E3Result.ok();
    }

    //重点人员展示
    @ResponseBody
    @GetMapping("/abstinence/keyStudentShow")
    public E3Result keyStudentShow(String pageNo, String pageSize){
        UserTable userTable = abstinenceEfficacyService.keyStudent(pageNo,pageSize);
        return E3Result.ok(userTable);
    }

    //奖惩人员统计
    @ResponseBody
    @GetMapping("/abstinence/performenceNum")
    public E3Result performenceNumShow(String date){
        List<TitileNumBean> titileNumBeans = abstinenceEfficacyService.performanceManNum(date);
        return E3Result.ok(titileNumBeans);
    }
    //奖惩细节页
    @ResponseBody
    @GetMapping("/abstinence/performenceDetil")
    public E3Result performenceDetilShow(String pageNo, String pageSize,String pageType){
        UserTable userTable = abstinenceEfficacyService.performanDetil(pageNo, pageSize, pageType);
        return E3Result.ok(userTable);
    }

    //人员6大类分数显示
    @ResponseBody
    @GetMapping("/abstinence/menGrade")
    public E3Result menGrade(String id,String date){
        List<TbGrademonth> tbGrademonths = abstinenceEfficacyService.sixGrade(id, date);
        if(tbGrademonths.size()<=0){
            TbGrademonth tbGrademonth = new TbGrademonth();
            tbGrademonth.setUserId(id);
            tbGrademonth.setTime(date);
            return E3Result.ok(tbGrademonth);
        }
        return E3Result.ok(tbGrademonths);
    }

    //戒治阶段分布（人数）
    @ResponseBody
    @GetMapping("/abstinence/stageDistribution")
    public E3Result stageDistribution(){
        return abstinenceEfficacyService.stageDistribution();
    }
}
