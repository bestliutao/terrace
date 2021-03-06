package cn.sznk.terrace.putCotraller;

import cn.sznk.terrace.bean.*;
import cn.sznk.terrace.mapper.TbModulusMapper;
import cn.sznk.terrace.mapper.TbTraineeMapper;
import cn.sznk.terrace.putService.HazardAnalysiService;
import cn.sznk.terrace.utils.E3Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class HazardAnalysisCotraller {
    @Autowired
    private HazardAnalysiService hazardAnalysiService;
    @Autowired
    private TbTraineeMapper tbTraineeMapper;
    @Autowired
    private TbModulusMapper tbModulusMapper;
    //危险性学员展示
    @ResponseBody
    @GetMapping("/hazard/studentShow")
    public E3Result studentShow(String pageNo,String pageSize,HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        UserTable userTable = hazardAnalysiService.hazardStudentShow(pageNo, pageSize,dept);
        return E3Result.ok(userTable);
    }
//    全部学员搜索
    @ResponseBody
    @GetMapping("/hazard/allStudentShow")
    public E3Result allStudentShow(String pageNo,String pageSize,String value,HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        UserTable userTable = hazardAnalysiService.allStudentShow(pageNo, pageSize, value,dept);
        return E3Result.ok(userTable);
    }
//    外出人数统计
    @ResponseBody
    @GetMapping("/hazard/outTypeNum")
    public E3Result outTypeNum(String date,HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        List<TitileNumBean> titileNumBeans = hazardAnalysiService.outNumStatistics(date,dept);
        return E3Result.ok(titileNumBeans);
    }
//    消费金额统计
    @ResponseBody
    @GetMapping("/hazard/moneyNum")
    public E3Result moneyNum(String date,HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        List<TitileNumBean> titileNumBeans = hazardAnalysiService.consumeMoneyNum(date,dept);
        return E3Result.ok(titileNumBeans);
    }

    //人员危险性分析人数统计
    @ResponseBody
    @GetMapping("/hazard/peopleNum")
    public E3Result peopleNum(String date,HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        List<TitileNumBean> titileNumBeans = hazardAnalysiService.hazardPeopleNum(dept);
        return E3Result.ok(titileNumBeans);
    }

    //人员危险性细节页
    @ResponseBody
    @GetMapping("/hazard/detilsMan")
    public E3Result detilsMan(String pageNo,String pageSize,String type,HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        UserTable userTable = hazardAnalysiService.hazardDetilsMan(pageNo, pageSize, type,dept);
        return E3Result.ok(userTable);
    }

    //外出申请细节页
    @ResponseBody
    @GetMapping("/hazard/outDetilsMan")
    public E3Result outDetilsMan(String pageNo,String pageSize,String pageType,HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        UserTable userTable = hazardAnalysiService.outDetilsMan(pageNo, pageSize, pageType,dept);
        return E3Result.ok(userTable);
    }

    //人员消费细节页
    @ResponseBody
    @GetMapping("/hazard/consumeDetilsMan")
    public E3Result consumeDetilsMan(String pageNo,String pageSize,String pageType,HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        UserTable userTable = hazardAnalysiService.consumeMoneyDetils(pageNo, pageSize, pageType,dept);
        return E3Result.ok(userTable);
    }

    //危险性人员详细档案页
    @ResponseBody
    @GetMapping("/hazardDetils")
    public E3Result hazardDetils(String id,HttpSession session){
        TbTrainee tbTrainee = tbTraineeMapper.selectByPrimaryKey(id);
        session.setAttribute("file",tbTrainee);
        return E3Result.ok();
    }

    //风险系数回显
    @ResponseBody
    @GetMapping("/hazard/modulus")
    public E3Result modulus(String date,HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        TbModulusExample example = new TbModulusExample();
        example.createCriteria().andDeptCodeEqualTo(dept);
        List<TbModulus> tbModuluses = tbModulusMapper.selectByExample(example);
        for (TbModulus tbModulus:tbModuluses){
            return E3Result.ok(tbModulus);
        }
        return E3Result.build(400,"");
    }

    //风险系数更改
    @ResponseBody
    @GetMapping("/hazard/updateModulus")
    public E3Result updateModulus(String zs,String tt,String xx,String cs,HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        TbModulusExample example = new TbModulusExample();
        example.createCriteria().andDeptCodeEqualTo(dept);
        TbModulus tbModulus = new TbModulus();
        tbModulus.setGetaway(Integer.valueOf(tt));
        tbModulus.setCommitmurder(Integer.valueOf(xx));
        tbModulus.setIdioctonia(Integer.valueOf(zs));
        tbModulus.setSuddendeath(Integer.valueOf(cs));
        tbModulusMapper.updateByExampleSelective(tbModulus,example);

//        TbModulus tbModulu = tbModulusMapper.selectByPrimaryKey(1);
//        session.setAttribute("modulus",tbModulu);
        return E3Result.ok();
    }

    //人员详细档案标签展示
    @ResponseBody
    @GetMapping("/hazard/detile/manLabelShow")
    public E3Result manLabelShow(String id){
        List<TbManlablel> tbManlablels = hazardAnalysiService.hazardManLabel(id);
        TitileNumBean titileNumBean = new TitileNumBean();
        String label="";
        String proposal="";
        for(TbManlablel tbManlablel:tbManlablels){
            label=label+tbManlablel.getLabelName()+"、";
            proposal=proposal+tbManlablel.getProposal()+"、";
        }
        titileNumBean.setNumber(proposal);
        titileNumBean.setTitle(label);
        return E3Result.ok(titileNumBean);
    }

    //探访次数统计
    @ResponseBody
    @GetMapping("/hazard/visitNumber")
    public E3Result visitNumber(HttpSession session){
        String dept=(String)session.getAttribute("deptCode");
        return hazardAnalysiService.visitNumber(dept);
    }

    //人员头像
    @ResponseBody
    @GetMapping("/hazard/manPhoto")
    public E3Result manPhoto(String id){
        if (id==null){
            return E3Result.ok();
        }
        return hazardAnalysiService.manPhoto(id);
    }
}
