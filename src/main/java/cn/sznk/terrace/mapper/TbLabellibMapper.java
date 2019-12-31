package cn.sznk.terrace.mapper;

import cn.sznk.terrace.bean.TbLabellib;
import cn.sznk.terrace.bean.TbLabellibExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbLabellibMapper {
    int countByExample(TbLabellibExample example);

    int deleteByExample(TbLabellibExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbLabellib record);

    int insertSelective(TbLabellib record);

    List<TbLabellib> selectByExample(TbLabellibExample example);

    TbLabellib selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbLabellib record, @Param("example") TbLabellibExample example);

    int updateByExample(@Param("record") TbLabellib record, @Param("example") TbLabellibExample example);

    int updateByPrimaryKeySelective(TbLabellib record);

    int updateByPrimaryKey(TbLabellib record);
}