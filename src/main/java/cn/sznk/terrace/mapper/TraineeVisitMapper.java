package cn.sznk.terrace.mapper;

import cn.sznk.terrace.bean.TraineeVisit;
import cn.sznk.terrace.bean.TraineeVisitExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TraineeVisitMapper {
    List<String> visitNumber(@Param("number")Integer number);
    int countByExample(TraineeVisitExample example);

    int deleteByExample(TraineeVisitExample example);

    int deleteByPrimaryKey(String visitno);

    int insert(TraineeVisit record);

    int insertSelective(TraineeVisit record);

    List<TraineeVisit> selectByExample(TraineeVisitExample example);

    TraineeVisit selectByPrimaryKey(String visitno);

    int updateByExampleSelective(@Param("record") TraineeVisit record, @Param("example") TraineeVisitExample example);

    int updateByExample(@Param("record") TraineeVisit record, @Param("example") TraineeVisitExample example);

    int updateByPrimaryKeySelective(TraineeVisit record);

    int updateByPrimaryKey(TraineeVisit record);
}