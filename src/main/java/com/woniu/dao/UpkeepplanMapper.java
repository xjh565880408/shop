package com.woniu.dao;

import com.woniu.domain.Upkeepplan;
import com.woniu.domain.UpkeepplanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpkeepplanMapper {
    long countByExample(UpkeepplanExample example);

    int deleteByExample(UpkeepplanExample example);

    int deleteByPrimaryKey(Integer upkeepid);

    int insert(Upkeepplan record);

    int insertSelective(Upkeepplan record);

    List<Upkeepplan> selectByExample(UpkeepplanExample example);

    Upkeepplan selectByPrimaryKey(Integer upkeepid);

    int updateByExampleSelective(@Param("record") Upkeepplan record, @Param("example") UpkeepplanExample example);

    int updateByExample(@Param("record") Upkeepplan record, @Param("example") UpkeepplanExample example);

    int updateByPrimaryKeySelective(Upkeepplan record);

    int updateByPrimaryKey(Upkeepplan record);
}