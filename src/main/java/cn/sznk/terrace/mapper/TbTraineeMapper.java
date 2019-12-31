package cn.sznk.terrace.mapper;


import cn.sznk.terrace.bean.TbTrainee;
import cn.sznk.terrace.bean.TbTraineeExample;
import cn.sznk.terrace.bean.TitileNumBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbTraineeMapper {
    List<TitileNumBean> stageDistribution();
    List<TbTrainee> findHazardMan(@Param("user_idioctonia") String user_idioctonia, @Param("user_getaway") String user_getaway, @Param("user_suddendeath") String user_suddendeath, @Param("user_wound") String user_wound);

    List<TbTrainee> findUserByUsername(String traineename);
    List<TbTrainee> findUserByUserId(String traineecode);


    int countByExample(TbTraineeExample example);

    int deleteByExample(TbTraineeExample example);

    int deleteByPrimaryKey(String traineecode);

    int insert(TbTrainee record);

    int insertSelective(TbTrainee record);

    List<TbTrainee> selectByExampleWithBLOBs(TbTraineeExample example);

    List<TbTrainee> selectByExample(TbTraineeExample example);

    TbTrainee selectByPrimaryKey(String traineecode);

    int updateByExampleSelective(@Param("record") TbTrainee record, @Param("example") TbTraineeExample example);

    int updateByExampleWithBLOBs(@Param("record") TbTrainee record, @Param("example") TbTraineeExample example);

    int updateByExample(@Param("record") TbTrainee record, @Param("example") TbTraineeExample example);

    int updateByPrimaryKeySelective(TbTrainee record);

    int updateByPrimaryKeyWithBLOBs(TbTrainee record);

    int updateByPrimaryKey(TbTrainee record);
}