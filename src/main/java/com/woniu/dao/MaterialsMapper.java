package com.woniu.dao;

import com.woniu.domain.Materials;
import com.woniu.domain.MaterialsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialsMapper {
    long countByExample(MaterialsExample example);

    int deleteByExample(MaterialsExample example);

    int deleteByPrimaryKey(Integer materialid);

    int insert(Materials record);

    int insertSelective(Materials record);

    List<Materials> selectByExample(MaterialsExample example);

    Materials selectByPrimaryKey(Integer materialid);

    int updateByExampleSelective(@Param("record") Materials record, @Param("example") MaterialsExample example);

    int updateByExample(@Param("record") Materials record, @Param("example") MaterialsExample example);

    int updateByPrimaryKeySelective(Materials record);

    int updateByPrimaryKey(Materials record);
}