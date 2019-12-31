package cn.sznk.terrace.putService;

import cn.sznk.terrace.bean.TbDynamicalarm;
import cn.sznk.terrace.bean.TitileNumBean;
import cn.sznk.terrace.bean.UserTable;
import cn.sznk.terrace.utils.E3Result;

import java.util.List;

public interface IntelligentAnalysiService {
    //当天警情数量
    public int todayPoliceNum(String date);
    //当天未处理的警情数量
    public int todayEquipmentPoliceNum(String date);
    //当天未处理的警情数量
    public int todayPeoplePoliceNum(String date);
    //当天未处理的警情
    public UserTable todayUntreatedPolice(String pageNo,String pageSize,String date);
    //7天警情分布
    public List<TitileNumBean> policeDistribution(String date);

    //警情细节页
    public UserTable policeDetils(String pageNo, String pageSize,String group);

    //所内人数接口
    public E3Result inSideChange();
}
