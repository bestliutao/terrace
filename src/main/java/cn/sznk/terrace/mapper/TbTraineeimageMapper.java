package cn.sznk.terrace.mapper;

import cn.sznk.terrace.bean.TbTraineeimage;
import cn.sznk.terrace.bean.TbTraineeimageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbTraineeimageMapper {
    String traineePhoto(String traineeCode);
    int countByExample(TbTraineeimageExample example);

    int deleteByExample(TbTraineeimageExample example);

    int deleteByPrimaryKey(String traineecode);

    int insert(TbTraineeimage record);

    int insertSelective(TbTraineeimage record);

    List<TbTraineeimage> selectByExampleWithBLOBs(TbTraineeimageExample example);

    List<TbTraineeimage> selectByExample(TbTraineeimageExample example);

    TbTraineeimage selectByPrimaryKey(String traineecode);

    int updateByExampleSelective(@Param("record") TbTraineeimage record, @Param("example") TbTraineeimageExample example);

    int updateByExampleWithBLOBs(@Param("record") TbTraineeimage record, @Param("example") TbTraineeimageExample example);

    int updateByExample(@Param("record") TbTraineeimage record, @Param("example") TbTraineeimageExample example);

    int updateByPrimaryKeySelective(TbTraineeimage record);

    int updateByPrimaryKeyWithBLOBs(TbTraineeimage record);
}