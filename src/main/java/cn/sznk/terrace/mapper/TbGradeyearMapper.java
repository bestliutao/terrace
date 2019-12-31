package cn.sznk.terrace.mapper;

import cn.sznk.terrace.bean.AvgGrade;
import cn.sznk.terrace.bean.TbGradeyear;
import cn.sznk.terrace.bean.TbGradeyearExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbGradeyearMapper {
    AvgGrade avgGradeOtherYear(@Param("statge") String statge,@Param("year") String year);
    AvgGrade avgGradeYear(@Param("year") String  year);

    int countByExample(TbGradeyearExample example);

    int deleteByExample(TbGradeyearExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbGradeyear record);

    int insertSelective(TbGradeyear record);

    List<TbGradeyear> selectByExample(TbGradeyearExample example);

    TbGradeyear selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbGradeyear record, @Param("example") TbGradeyearExample example);

    int updateByExample(@Param("record") TbGradeyear record, @Param("example") TbGradeyearExample example);

    int updateByPrimaryKeySelective(TbGradeyear record);

    int updateByPrimaryKey(TbGradeyear record);
}