package cn.sznk.terrace.mapper;

import cn.sznk.terrace.bean.TbConsumption;
import cn.sznk.terrace.bean.TbConsumptionExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TbConsumptionMapper {

    int consumptionNumber(@Param("ltMoney") String ltMoney,@Param("gtMoney") String gtMoney,@Param("date") String date);
    int consumptionNumberTwo(@Param("ltMoney") String ltMoney,@Param("date") String date);
    int countByExample(TbConsumptionExample example);

    int deleteByExample(TbConsumptionExample example);

    int deleteByPrimaryKey(Integer consumptionId);

    int insert(TbConsumption record);

    int insertSelective(TbConsumption record);

    List<TbConsumption> selectByExample(TbConsumptionExample example);

    TbConsumption selectByPrimaryKey(Integer consumptionId);

    int updateByExampleSelective(@Param("record") TbConsumption record, @Param("example") TbConsumptionExample example);

    int updateByExample(@Param("record") TbConsumption record, @Param("example") TbConsumptionExample example);

    int updateByPrimaryKeySelective(TbConsumption record);

    int updateByPrimaryKey(TbConsumption record);
}