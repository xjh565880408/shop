package com.woniu.dao;

import com.woniu.domain.Birdge;
import com.woniu.domain.BirdgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BirdgeMapper {
    long countByExample(BirdgeExample example);

    int deleteByExample(BirdgeExample example);

    int deleteByPrimaryKey(Integer birdgeid);

    int insert(Birdge record);

    int insertSelective(Birdge record);

    List<Birdge> selectByExample(BirdgeExample example);

    Birdge selectByPrimaryKey(Integer birdgeid);

    int updateByExampleSelective(@Param("record") Birdge record, @Param("example") BirdgeExample example);

    int updateByExample(@Param("record") Birdge record, @Param("example") BirdgeExample example);

    int updateByPrimaryKeySelective(Birdge record);

    int updateByPrimaryKey(Birdge record);
}