package cn.sznk.terrace.putService;

import cn.sznk.terrace.bean.TbManlablel;
import cn.sznk.terrace.bean.TbTrainee;
import cn.sznk.terrace.bean.TitileNumBean;
import cn.sznk.terrace.bean.UserTable;
import cn.sznk.terrace.utils.E3Result;

import java.util.List;

public interface HazardAnalysiService {

    //危险性学员展示
    public UserTable hazardStudentShow(String pageNo, String pageSize);

    //全部人员搜索
    public UserTable allStudentShow(String pageNo,String pageSize,String value);

    //三类外出申请人数统计
    public List<TitileNumBean> outNumStatistics(String date);

    //学员消费金额人数统计
    public List<TitileNumBean> consumeMoneyNum(String date);

    //人员危险性分析人数统计
    public List<TitileNumBean> hazardPeopleNum();

    //人员危险性细节页
    public UserTable hazardDetilsMan(String pageNo,String pageSize,String type);

    //外出申请细节页
    public UserTable outDetilsMan(String pageNo,String pageSize,String type);

    //人员消费细节页
    public UserTable consumeMoneyDetils(String pageNo,String pageSize,String type);

    //人员详细档案标签展示
    public List<TbManlablel> hazardManLabel(String id);

    //探访次数统计
    public E3Result visitNumber();

    //人员头像
    public E3Result manPhoto(String id);
}
