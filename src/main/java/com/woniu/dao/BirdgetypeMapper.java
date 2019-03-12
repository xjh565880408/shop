package com.woniu.dao;

import com.woniu.domain.Birdgetype;
import com.woniu.domain.BirdgetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BirdgetypeMapper {
    long countByExample(BirdgetypeExample example);

    int deleteByExample(BirdgetypeExample example);

    int deleteByPrimaryKey(Integer bridgetypeid);

    int insert(Birdgetype record);

    int insertSelective(Birdgetype record);

    List<Birdgetype> selectByExample(BirdgetypeExample example);

    Birdgetype selectByPrimaryKey(Integer bridgetypeid);

    int updateByExampleSelective(@Param("record") Birdgetype record, @Param("example") BirdgetypeExample example);

    int updateByExample(@Param("record") Birdgetype record, @Param("example") BirdgetypeExample example);

    int updateByPrimaryKeySelective(Birdgetype record);

    int updateByPrimaryKey(Birdgetype record);
}