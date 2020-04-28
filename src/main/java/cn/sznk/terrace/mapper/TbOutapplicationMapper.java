package cn.sznk.terrace.mapper;

import cn.sznk.terrace.bean.TbOutapplication;
import cn.sznk.terrace.bean.TbOutapplicationExample;
import cn.sznk.terrace.bean.TitileNumBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOutapplicationMapper {
    List<TitileNumBean> outTypeNumberCensus(@Param("date")String date,@Param("code")String code);

    int countByExample(TbOutapplicationExample example);

    int deleteByExample(TbOutapplicationExample example);

    int deleteByPrimaryKey(Integer outId);

    int insert(TbOutapplication record);

    int insertSelective(TbOutapplication record);

    List<TbOutapplication> selectByExample(TbOutapplicationExample example);

    TbOutapplication selectByPrimaryKey(Integer outId);

    int updateByExampleSelective(@Param("record") TbOutapplication record, @Param("example") TbOutapplicationExample example);

    int updateByExample(@Param("record") TbOutapplication record, @Param("example") TbOutapplicationExample example);

    int updateByPrimaryKeySelective(TbOutapplication record);

    int updateByPrimaryKey(TbOutapplication record);
}