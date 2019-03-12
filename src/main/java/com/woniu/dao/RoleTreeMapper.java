package com.woniu.dao;

import com.woniu.domain.RoleTree;
import com.woniu.domain.RoleTreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleTreeMapper {
    long countByExample(RoleTreeExample example);

    int deleteByExample(RoleTreeExample example);

    int insert(RoleTree record);

    int insertSelective(RoleTree record);

    List<RoleTree> selectByExample(RoleTreeExample example);

    int updateByExampleSelective(@Param("record") RoleTree record, @Param("example") RoleTreeExample example);

    int updateByExample(@Param("record") RoleTree record, @Param("example") RoleTreeExample example);
}