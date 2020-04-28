package cn.sznk.terrace.putService;

import cn.sznk.terrace.bean.TbGrademonth;
import cn.sznk.terrace.bean.TitileNumBean;
import cn.sznk.terrace.bean.UserTable;
import cn.sznk.terrace.utils.E3Result;

import java.util.List;

public interface AbstinenceEfficacyService {

    //重点戒治人员
    public UserTable keyStudent(String pageNo, String pageSize,String dept);
    //奖惩情况人数统计
    public List<TitileNumBean> performanceManNum(String date,String dept);
    //戒治下 奖惩详情页显示接口
    public UserTable performanDetil(String pageNo, String pageSize,String type,String dept);
    //人员6大类分数显示
    public  List<TbGrademonth> sixGrade(String id,String date);
    //戒治阶段分布（人数）
    public E3Result stageDistribution(String dept);
}
