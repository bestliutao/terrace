package cn.sznk.terrace.mapper;

import cn.sznk.terrace.bean.TbEnvirmsg;
import cn.sznk.terrace.bean.TbEnvirmsgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbEnvirmsgMapper {
    List<TbEnvirmsg> todayBadEnvir(String date);

    int todayBadEnvirNum(String time);

    int countByExample(TbEnvirmsgExample example);

    int deleteByExample(TbEnvirmsgExample example);

    int deleteByPrimaryKey(String envirOid);

    int insert(TbEnvirmsg record);

    int insertSelective(TbEnvirmsg record);

    List<TbEnvirmsg> selectByExample(TbEnvirmsgExample example);

    TbEnvirmsg selectByPrimaryKey(String envirOid);

    int updateByExampleSelective(@Param("record") TbEnvirmsg record, @Param("example") TbEnvirmsgExample example);

    int updateByExample(@Param("record") TbEnvirmsg record, @Param("example") TbEnvirmsgExample example);

    int updateByPrimaryKeySelective(TbEnvirmsg record);

    int updateByPrimaryKey(TbEnvirmsg record);
}