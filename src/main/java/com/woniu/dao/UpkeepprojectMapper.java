package com.woniu.dao;

import com.woniu.domain.Upkeepproject;
import com.woniu.domain.UpkeepprojectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpkeepprojectMapper {
    long countByExample(UpkeepprojectExample example);

    int deleteByExample(UpkeepprojectExample example);

    int deleteByPrimaryKey(Integer projectid);

    int insert(Upkeepproject record);

    int insertSelective(Upkeepproject record);

    List<Upkeepproject> selectByExample(UpkeepprojectExample example);

    Upkeepproject selectByPrimaryKey(Integer projectid);

    int updateByExampleSelective(@Param("record") Upkeepproject record, @Param("example") UpkeepprojectExample example);

    int updateByExample(@Param("record") Upkeepproject record, @Param("example") UpkeepprojectExample example);

    int updateByPrimaryKeySelective(Upkeepproject record);

    int updateByPrimaryKey(Upkeepproject record);
}