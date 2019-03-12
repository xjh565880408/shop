package com.woniu.dao;

import com.woniu.domain.Inspectrecord;
import com.woniu.domain.InspectrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectrecordMapper {
    long countByExample(InspectrecordExample example);

    int deleteByExample(InspectrecordExample example);

    int deleteByPrimaryKey(Integer recordid);

    int insert(Inspectrecord record);

    int insertSelective(Inspectrecord record);

    List<Inspectrecord> selectByExampleWithBLOBs(InspectrecordExample example);

    List<Inspectrecord> selectByExample(InspectrecordExample example);

    Inspectrecord selectByPrimaryKey(Integer recordid);

    int updateByExampleSelective(@Param("record") Inspectrecord record, @Param("example") InspectrecordExample example);

    int updateByExampleWithBLOBs(@Param("record") Inspectrecord record, @Param("example") InspectrecordExample example);

    int updateByExample(@Param("record") Inspectrecord record, @Param("example") InspectrecordExample example);

    int updateByPrimaryKeySelective(Inspectrecord record);

    int updateByPrimaryKeyWithBLOBs(Inspectrecord record);

    int updateByPrimaryKey(Inspectrecord record);
}