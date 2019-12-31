package cn.sznk.terrace.putCotraller;

import cn.sznk.terrace.bean.PoliceBean;
import cn.sznk.terrace.bean.TbDynamicalarm;
import cn.sznk.terrace.bean.TitileNumBean;
import cn.sznk.terrace.bean.UserTable;
import cn.sznk.terrace.putService.IntelligentAnalysiService;
import cn.sznk.terrace.utils.E3Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IntelligentAnalysCotraller {
    @Autowired
    private IntelligentAnalysiService intelligentAnalysiService;

    //当天警情数量
    @ResponseBody
    @GetMapping("/police/todayNum")
    public E3Result todayNum(String date){
        int i = intelligentAnalysiService.todayPoliceNum(date);
        return E3Result.ok(i);
    }

    //近7天警情分布
    @ResponseBody
    @GetMapping("/police/distributionNum")
    public E3Result distributionNum(String date){
        List<TitileNumBean> titileNumBeans = intelligentAnalysiService.policeDistribution(date);
        return E3Result.ok(titileNumBeans);
    }

    //当天未处理的警情
    @ResponseBody
    @GetMapping("/police/untreatedPolice")
    public E3Result untreatedPolice(String pageNo,String pageSize,String date){
        UserTable userTable = intelligentAnalysiService.todayUntreatedPolice(pageNo, pageSize, date);
        return E3Result.ok(userTable);
    }

    //当天未处理的警情数量
    @ResponseBody
    @GetMapping("/police/untreatedPoliceNum")
    public E3Result untreatedPoliceNum(String date){
        PoliceBean p = new PoliceBean();
        p.setEquipment(intelligentAnalysiService.todayEquipmentPoliceNum(date));
        p.setPeople(intelligentAnalysiService.todayPeoplePoliceNum(date));
        return E3Result.ok(p);
    }

    //警情细节页
    @ResponseBody
    @GetMapping("/police/groupDetils")
    public E3Result groupDetilsShow(String pageNo, String pageSize, String pageName){
        UserTable userTable = intelligentAnalysiService.policeDetils(pageNo, pageSize, pageName);
        return E3Result.ok(userTable);
    }

    //所内人数接口
    @ResponseBody
    @GetMapping("/police/inSideChange")
    public E3Result inSideChange(){
        return intelligentAnalysiService.inSideChange();
    }
}
