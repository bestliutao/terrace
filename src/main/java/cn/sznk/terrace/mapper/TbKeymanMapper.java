package cn.sznk.terrace.mapper;

import cn.sznk.terrace.bean.TbKeyman;
import cn.sznk.terrace.bean.TbKeymanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbKeymanMapper {
    int countByExample(TbKeymanExample example);

    int deleteByExample(TbKeymanExample example);

    int insert(TbKeyman record);

    int insertSelective(TbKeyman record);

    List<TbKeyman> selectByExample(TbKeymanExample example);

    int updateByExampleSelective(@Param("record") TbKeyman record, @Param("example") TbKeymanExample example);

    int updateByExample(@Param("record") TbKeyman record, @Param("example") TbKeymanExample example);
}