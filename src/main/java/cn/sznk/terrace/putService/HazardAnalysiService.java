package cn.sznk.terrace.putService;

import cn.sznk.terrace.bean.TbManlablel;
import cn.sznk.terrace.bean.TbTrainee;
import cn.sznk.terrace.bean.TitileNumBean;
import cn.sznk.terrace.bean.UserTable;
import cn.sznk.terrace.utils.E3Result;

import java.util.List;

public interface HazardAnalysiService {

    //危险性学员展示
    public UserTable hazardStudentShow(String pageNo, String pageSize,String dept);

    //全部人员搜索
    public UserTable allStudentShow(String pageNo,String pageSize,String value,String dept);

    //三类外出申请人数统计
    public List<TitileNumBean> outNumStatistics(String date,String dept);

    //学员消费金额人数统计
    public List<TitileNumBean> consumeMoneyNum(String date,String dept);

    //人员危险性分析人数统计
    public List<TitileNumBean> hazardPeopleNum(String dept);

    //人员危险性细节页
    public UserTable hazardDetilsMan(String pageNo,String pageSize,String type,String dept);

    //外出申请细节页
    public UserTable outDetilsMan(String pageNo,String pageSize,String type,String dept);

    //人员消费细节页
    public UserTable consumeMoneyDetils(String pageNo,String pageSize,String type,String dept);

    //人员详细档案标签展示
    public List<TbManlablel> hazardManLabel(String id);

    //探访次数统计
    public E3Result visitNumber(String dept);

    //人员头像
    public E3Result manPhoto(String id);
}
