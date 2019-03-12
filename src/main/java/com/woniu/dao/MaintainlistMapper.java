package com.woniu.dao;

import com.woniu.domain.Maintainlist;
import com.woniu.domain.MaintainlistExample;
import com.woniu.domain.MaintainlistKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintainlistMapper {
    long countByExample(MaintainlistExample example);

    int deleteByExample(MaintainlistExample example);

    int deleteByPrimaryKey(MaintainlistKey key);

    int insert(Maintainlist record);

    int insertSelective(Maintainlist record);

    List<Maintainlist> selectByExample(MaintainlistExample example);

    Maintainlist selectByPrimaryKey(MaintainlistKey key);

    int updateByExampleSelective(@Param("record") Maintainlist record, @Param("example") MaintainlistExample example);

    int updateByExample(@Param("record") Maintainlist record, @Param("example") MaintainlistExample example);

    int updateByPrimaryKeySelective(Maintainlist record);

    int updateByPrimaryKey(Maintainlist record);
}