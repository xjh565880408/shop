package com.woniu.dao;

import com.woniu.domain.Roadtype;
import com.woniu.domain.RoadtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoadtypeMapper {
    long countByExample(RoadtypeExample example);

    int deleteByExample(RoadtypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(Roadtype record);

    int insertSelective(Roadtype record);

    List<Roadtype> selectByExample(RoadtypeExample example);

    Roadtype selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") Roadtype record, @Param("example") RoadtypeExample example);

    int updateByExample(@Param("record") Roadtype record, @Param("example") RoadtypeExample example);

    int updateByPrimaryKeySelective(Roadtype record);

    int updateByPrimaryKey(Roadtype record);
}