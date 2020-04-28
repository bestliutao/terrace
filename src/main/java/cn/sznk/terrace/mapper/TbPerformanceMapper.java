package cn.sznk.terrace.mapper;

import cn.sznk.terrace.bean.TbPerformance;
import cn.sznk.terrace.bean.TbPerformanceExample;
import cn.sznk.terrace.bean.TitileNumBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPerformanceMapper {
    List<TitileNumBean> performanceNum(@Param("date")String date,@Param("code")String code);

    int countByExample(TbPerformanceExample example);

    int deleteByExample(TbPerformanceExample example);

    int deleteByPrimaryKey(Integer performanceId);

    int insert(TbPerformance record);

    int insertSelective(TbPerformance record);

    List<TbPerformance> selectByExample(TbPerformanceExample example);

    TbPerformance selectByPrimaryKey(Integer performanceId);

    int updateByExampleSelective(@Param("record") TbPerformance record, @Param("example") TbPerformanceExample example);

    int updateByExample(@Param("record") TbPerformance record, @Param("example") TbPerformanceExample example);

    int updateByPrimaryKeySelective(TbPerformance record);

    int updateByPrimaryKey(TbPerformance record);
}