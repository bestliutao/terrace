package cn.sznk.terrace.mapper;

import cn.sznk.terrace.bean.TbMonitorabnormal;
import cn.sznk.terrace.bean.TbMonitorabnormalExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbMonitorabnormalMapper {
    List<TbMonitorabnormal> todayBadMonitorMsg(@Param("monitor_group") String monitor_group, @Param("date") String monitor_time,@Param("code")String code);
    int todayBadMonitorNum(@Param("date")String date,@Param("code")String code);
    List<TbMonitorabnormal> todayBadMonitor(@Param("date")String date,@Param("code")String code);

    int countByExample(TbMonitorabnormalExample example);

    int deleteByExample(TbMonitorabnormalExample example);

    int deleteByPrimaryKey(String monitorIp);

    int insert(TbMonitorabnormal record);

    int insertSelective(TbMonitorabnormal record);

    List<TbMonitorabnormal> selectByExample(TbMonitorabnormalExample example);

    TbMonitorabnormal selectByPrimaryKey(String monitorIp);

    int updateByExampleSelective(@Param("record") TbMonitorabnormal record, @Param("example") TbMonitorabnormalExample example);

    int updateByExample(@Param("record") TbMonitorabnormal record, @Param("example") TbMonitorabnormalExample example);

    int updateByPrimaryKeySelective(TbMonitorabnormal record);

    int updateByPrimaryKey(TbMonitorabnormal record);
}