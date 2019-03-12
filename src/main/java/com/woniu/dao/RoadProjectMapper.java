package com.woniu.dao;

import com.woniu.domain.RoadProject;
import com.woniu.domain.RoadProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoadProjectMapper {
    long countByExample(RoadProjectExample example);

    int deleteByExample(RoadProjectExample example);

    int insert(RoadProject record);

    int insertSelective(RoadProject record);

    List<RoadProject> selectByExample(RoadProjectExample example);

    int updateByExampleSelective(@Param("record") RoadProject record, @Param("example") RoadProjectExample example);

    int updateByExample(@Param("record") RoadProject record, @Param("example") RoadProjectExample example);
}