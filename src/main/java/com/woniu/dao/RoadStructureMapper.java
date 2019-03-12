package com.woniu.dao;

import com.woniu.domain.RoadStructure;
import com.woniu.domain.RoadStructureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoadStructureMapper {
    long countByExample(RoadStructureExample example);

    int deleteByExample(RoadStructureExample example);

    int deleteByPrimaryKey(Integer conid);

    int insert(RoadStructure record);

    int insertSelective(RoadStructure record);

    List<RoadStructure> selectByExample(RoadStructureExample example);

    RoadStructure selectByPrimaryKey(Integer conid);

    int updateByExampleSelective(@Param("record") RoadStructure record, @Param("example") RoadStructureExample example);

    int updateByExample(@Param("record") RoadStructure record, @Param("example") RoadStructureExample example);

    int updateByPrimaryKeySelective(RoadStructure record);

    int updateByPrimaryKey(RoadStructure record);
}