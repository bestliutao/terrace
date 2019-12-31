package cn.sznk.terrace.putService;

import cn.sznk.terrace.bean.*;

import java.util.List;

public interface GradeService {
    //全部 一年 平均分接口
    public List<TitileNumBean> avgGradeAll(String year);
    //一年期 一年 平均分接口
    public List<TitileNumBean> avgGradeOtherYear(String statge,String year);
    //期满 一年 平均分接口
    public List<TitileNumBean> avgGradeOtherAll(String statge,String year);
    //生理戒毒期 一年 平均分接口
    public List<TitileNumBean> avgGradeOtherAbs(String statge,String year);


    //戒治效能统计（人数/分数）
    public List<AbstinenceGradeBean> abstinenceGrade(String date);
    //全部 6个月 平均分统计
    public List<TitileNumBean> sixMonths(String date);
    //一年期 6个月 平均分
    public List<TitileNumBean> sixMonthsYear(String date);
    //期满 6个月 平均分
    public List<TitileNumBean> sixMonthsAll(String date);
    //生理戒毒期 6个月 平均分
    public List<TitileNumBean> sixMonthsAbs(String date);

    //人员6大类分数
    public List<TbGrademonth> manSixMonth(String id,String date);

    //分段人员分数
    public UserTable statgeStudentGrade(String type, String statge, String time, String pageNo, String pageSize);

    //扣分最多
    public UserTable deductPoints(String type, String statge, String time, String pageNo, String pageSize);

    //加分最多
    public UserTable bonusPoints(String type, String statge, String time, String pageNo, String pageSize);
}
