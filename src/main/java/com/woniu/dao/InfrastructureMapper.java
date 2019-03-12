package com.woniu.dao;

import com.woniu.domain.Infrastructure;
import com.woniu.domain.InfrastructureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfrastructureMapper {
    long countByExample(InfrastructureExample example);

    int deleteByExample(InfrastructureExample example);

    int deleteByPrimaryKey(Integer baseid);

    int insert(Infrastructure record);

    int insertSelective(Infrastructure record);

    List<Infrastructure> selectByExample(InfrastructureExample example);

    Infrastructure selectByPrimaryKey(Integer baseid);

    int updateByExampleSelective(@Param("record") Infrastructure record, @Param("example") InfrastructureExample example);

    int updateByExample(@Param("record") Infrastructure record, @Param("example") InfrastructureExample example);

    int updateByPrimaryKeySelective(Infrastructure record);

    int updateByPrimaryKey(Infrastructure record);
}