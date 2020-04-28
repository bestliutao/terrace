package cn.sznk.terrace.mapper;

import cn.sznk.terrace.bean.TbGrademonth;
import cn.sznk.terrace.bean.TbGrademonthExample;
import cn.sznk.terrace.bean.TitileNumBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbGrademonthMapper {
    //扣分最多
    List<TbGrademonth> deductPointsMore(@Param("statge") String statge, @Param("time") String time, @Param("gtGrade") String gtGrade, @Param("ltGrade") String ltGrade,@Param("code") String code);
    List<TbGrademonth> deductPointsMoreOne(@Param("statge") String statge, @Param("time") String time,@Param("code") String code);
    List<TbGrademonth> deductPointsMoreTwo(@Param("time") String time, @Param("gtGrade") String gtGrade, @Param("ltGrade") String ltGrade,@Param("code") String code);
    List<TbGrademonth> deductPointsMoreThree(@Param("time") String time,@Param("code") String code);


    //加分最多
    List<TbGrademonth> bonusPointsMore(@Param("statge") String statge, @Param("time") String time, @Param("gtGrade") String gtGrade, @Param("ltGrade") String ltGrade,@Param("code") String code);
    List<TbGrademonth> bonusPointsMoreTwo(@Param("time") String time, @Param("gtGrade") String gtGrade, @Param("ltGrade") String ltGrade,@Param("code") String code);
    List<TbGrademonth> bonusPointsMoreOne(@Param("statge") String statge, @Param("time") String time,@Param("code") String code);
    List<TbGrademonth> bonusPointsMoreThree(@Param("time") String time,@Param("code") String code);


    String sixMonthOther(@Param("time") String time, @Param("statge") String statge,@Param("code") String code);
    String sixMonth(@Param("time")String time,@Param("code") String code);

    //分段人数
    List<TitileNumBean> gradeMonthOne(@Param("time")String time,@Param("code") String code);
    List<TitileNumBean> gradeMonthTwo(@Param("ltGrade") String ltGrade, @Param("gtGrade") String gtGrade, @Param("time") String time,@Param("code") String code);



    int countByExample(TbGrademonthExample example);

    int deleteByExample(TbGrademonthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbGrademonth record);

    int insertSelective(TbGrademonth record);

    List<TbGrademonth> selectByExample(TbGrademonthExample example);

    TbGrademonth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbGrademonth record, @Param("example") TbGrademonthExample example);

    int updateByExample(@Param("record") TbGrademonth record, @Param("example") TbGrademonthExample example);

    int updateByPrimaryKeySelective(TbGrademonth record);

    int updateByPrimaryKey(TbGrademonth record);
}