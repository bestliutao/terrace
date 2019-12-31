package cn.sznk.terrace.mapper;

import cn.sznk.terrace.bean.EnvirOid;
import cn.sznk.terrace.bean.EnvirOidExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EnvirOidMapper {
    int countByExample(EnvirOidExample example);

    int deleteByExample(EnvirOidExample example);

    int deleteByPrimaryKey(String oid);

    int insert(EnvirOid record);

    int insertSelective(EnvirOid record);

    List<EnvirOid> selectByExample(EnvirOidExample example);

    EnvirOid selectByPrimaryKey(String oid);

    int updateByExampleSelective(@Param("record") EnvirOid record, @Param("example") EnvirOidExample example);

    int updateByExample(@Param("record") EnvirOid record, @Param("example") EnvirOidExample example);

    int updateByPrimaryKeySelective(EnvirOid record);

    int updateByPrimaryKey(EnvirOid record);
}