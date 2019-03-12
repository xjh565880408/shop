package com.woniu.dao;

import com.woniu.domain.Accident;
import com.woniu.domain.AccidentExample;
import com.woniu.domain.AccidentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccidentMapper {
    long countByExample(AccidentExample example);

    int deleteByExample(AccidentExample example);

    int deleteByPrimaryKey(Integer accidentid);

    int insert(AccidentWithBLOBs record);

    int insertSelective(AccidentWithBLOBs record);

    List<AccidentWithBLOBs> selectByExampleWithBLOBs(AccidentExample example);

    List<Accident> selectByExample(AccidentExample example);

    AccidentWithBLOBs selectByPrimaryKey(Integer accidentid);

    int updateByExampleSelective(@Param("record") AccidentWithBLOBs record, @Param("example") AccidentExample example);

    int updateByExampleWithBLOBs(@Param("record") AccidentWithBLOBs record, @Param("example") AccidentExample example);

    int updateByExample(@Param("record") Accident record, @Param("example") AccidentExample example);

    int updateByPrimaryKeySelective(AccidentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AccidentWithBLOBs record);

    int updateByPrimaryKey(Accident record);
}