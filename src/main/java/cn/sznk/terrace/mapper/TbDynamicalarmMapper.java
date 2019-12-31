package cn.sznk.terrace.mapper;

import cn.sznk.terrace.bean.TbDynamicalarm;
import cn.sznk.terrace.bean.TbDynamicalarmExample;
import cn.sznk.terrace.bean.TitileNumBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbDynamicalarmMapper {
    int findTodayPoliceNum(String date);
    List<TitileNumBean> findPoliceDistribution(@Param("ltTime")String ltTime,@Param("gtTime")String gtTime,@Param("alarm_group")String group);
    List<TbDynamicalarm> findUntreatedPolice(String date);
    int equipmentPolice(String date);
    int peoplePolice(String date);

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