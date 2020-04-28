package cn.sznk.terrace.mapper;

import cn.sznk.terrace.bean.TbDynamicalarm;
import cn.sznk.terrace.bean.TbDynamicalarmExample;
import cn.sznk.terrace.bean.TitileNumBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbDynamicalarmMapper {
    int findTodayPoliceNum(@Param("date")String date,@Param("code")String code);
    List<TitileNumBean> findPoliceDistribution(@Param("ltTime") String ltTime, @Param("gtTime") String gtTime,@Param("alarm_group") String group,@Param("code") String code);
    List<TbDynamicalarm> findUntreatedPolice(@Param("date")String date,@Param("code") String code);
    int equipmentPolice(@Param("date")String date,@Param("code") String code);
    int peoplePolice(@Param("date")String date,@Param("code") String code);

    int countByExample(TbDynamicalarmExample example);

    int deleteByExample(TbDynamicalarmExample example);

    int deleteByPrimaryKey(Integer alarmId);

    int insert(TbDynamicalarm record);

    int insertSelective(TbDynamicalarm record);

    List<TbDynamicalarm> selectByExample(TbDynamicalarmExample example);

    TbDynamicalarm selectByPrimaryKey(Integer alarmId);

    int updateByExampleSelective(@Param("record") TbDynamicalarm record, @Param("example") TbDynamicalarmExample example);

    int updateByExample(@Param("record") TbDynamicalarm record, @Param("example") TbDynamicalarmExample example);

    int updateByPrimaryKeySelective(TbDynamicalarm record);

    int updateByPrimaryKey(TbDynamicalarm record);
}