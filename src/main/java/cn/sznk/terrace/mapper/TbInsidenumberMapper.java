package cn.sznk.terrace.mapper;

import cn.sznk.terrace.bean.TbInsidenumber;
import cn.sznk.terrace.bean.TbInsidenumberExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbInsidenumberMapper {
    int countByExample(TbInsidenumberExample example);

    int deleteByExample(TbInsidenumberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbInsidenumber record);

    int insertSelective(TbInsidenumber record);

    List<TbInsidenumber> selectByExample(TbInsidenumberExample example);

    TbInsidenumber selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbInsidenumber record, @Param("example") TbInsidenumberExample example);

    int updateByExample(@Param("record") TbInsidenumber record, @Param("example") TbInsidenumberExample example);

    int updateByPrimaryKeySelective(TbInsidenumber record);

    int updateByPrimaryKey(TbInsidenumber record);
}