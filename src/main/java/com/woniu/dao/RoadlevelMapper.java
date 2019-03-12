package com.woniu.dao;

import com.woniu.domain.Roadlevel;
import com.woniu.domain.RoadlevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoadlevelMapper {
    long countByExample(RoadlevelExample example);

    int deleteByExample(RoadlevelExample example);

    int deleteByPrimaryKey(Integer roadlevelid);

    int insert(Roadlevel record);

    int insertSelective(Roadlevel record);

    List<Roadlevel> selectByExample(RoadlevelExample example);

    Roadlevel selectByPrimaryKey(Integer roadlevelid);

    int updateByExampleSelective(@Param("record") Roadlevel record, @Param("example") RoadlevelExample example);

    int updateByExample(@Param("record") Roadlevel record, @Param("example") RoadlevelExample example);

    int updateByPrimaryKeySelective(Roadlevel record);

    int updateByPrimaryKey(Roadlevel record);
}