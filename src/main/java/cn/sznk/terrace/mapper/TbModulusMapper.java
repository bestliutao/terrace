package cn.sznk.terrace.mapper;

import cn.sznk.terrace.bean.TbModulus;
import cn.sznk.terrace.bean.TbModulusExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbModulusMapper {
    int countByExample(TbModulusExample example);

    int deleteByExample(TbModulusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbModulus record);

    int insertSelective(TbModulus record);

    List<TbModulus> selectByExample(TbModulusExample example);

    TbModulus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbModulus record, @Param("example") TbModulusExample example);

    int updateByExample(@Param("record") TbModulus record, @Param("example") TbModulusExample example);

    int updateByPrimaryKeySelective(TbModulus record);

    int updateByPrimaryKey(TbModulus record);
}