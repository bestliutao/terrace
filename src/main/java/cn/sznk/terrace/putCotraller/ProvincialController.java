package cn.sznk.terrace.putCotraller;

import cn.sznk.terrace.bean.TbTraineeExample;
import cn.sznk.terrace.bean.TitileNumBean;
import cn.sznk.terrace.mapper.TbTraineeMapper;
import cn.sznk.terrace.utils.E3Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProvincialController {
    @Autowired
    TbTraineeMapper tbTraineeMapper;

    @ResponseBody
    @RequestMapping(value = "/provincial/enterSubsystem")
    public E3Result EnterSubsystem(String place, HttpSession session){
        String dept=null;
        switch (place.trim()){
            case "松洲所":
                dept="0006";
                break;
            case "潭岗所":
                dept="0005";
                break;
            case "女子所":
                dept="0007";
                break;
            case "同和所":
                dept="0010";
                break;
            case "岑村所":
                dept="0011";
                break;
            default:
                dept="";
                break;
        }
        if (dept==null||dept==""){
            return E3Result.build(400,"");
        }else {
            session.setAttribute("deptCode",dept);
            return E3Result.ok();
        }
    }

    @ResponseBody
    @RequestMapping(value = "/provincial/stageDistribution")
    public E3Result stageDistribution(String date){
        List<TitileNumBean> titileNumBeans = tbTraineeMapper.stageDistributionAll();
        return E3Result.ok(titileNumBeans);
    }
    @ResponseBody
    @RequestMapping(value = "/provincial/equip")
    public E3Result equip(String date){
        return E3Result.ok();
    }

    @ResponseBody
    @RequestMapping(value = "/provincial/people")
    public E3Result people(String date){
        TbTraineeExample example = new TbTraineeExample();

        int i = tbTraineeMapper.countByExample(example);
        return E3Result.ok(i);
    }
}
