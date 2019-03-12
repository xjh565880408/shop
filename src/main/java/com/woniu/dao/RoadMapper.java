package com.woniu.dao;

import com.woniu.domain.Road;
import com.woniu.domain.RoadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoadMapper {
    long countByExample(RoadExample example);

    int deleteByExample(RoadExample example);

    int deleteByPrimaryKey(Integer roadid);

    int insert(Road record);

    int insertSelective(Road record);

    List<Road> selectByExample(RoadExample example);

    Road selectByPrimaryKey(Integer roadid);

    int updateByExampleSelective(@Param("record") Road record, @Param("example") RoadExample example);

    int updateByExample(@Param("record") Road record, @Param("example") RoadExample example);

    int updateByPrimaryKeySelective(Road record);

    int updateByPrimaryKey(Road record);
}