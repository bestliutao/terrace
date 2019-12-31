package cn.sznk.terrace.mapper;

import cn.sznk.terrace.bean.TbManlablel;
import cn.sznk.terrace.bean.TbManlablelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbManlablelMapper {
    int countByExample(TbManlablelExample example);

    int deleteByExample(TbManlablelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbManlablel record);

    int insertSelective(TbManlablel record);

    List<TbManlablel> selectByExample(TbManlablelExample example);

    TbManlablel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbManlablel record, @Param("example") TbManlablelExample example);

    int updateByExample(@Param("record") TbManlablel record, @Param("example") TbManlablelExample example);

    int updateByPrimaryKeySelective(TbManlablel record);

    int updateByPrimaryKey(TbManlablel record);
}