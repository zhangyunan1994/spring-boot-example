package com.example.structure.infrastructure.mapper;

import com.example.structure.infrastructure.entity.SysDict;
import com.example.structure.infrastructure.entity.SysDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDictMapper {

  long countByExample(SysDictExample example);

  int deleteByExample(SysDictExample example);

  int deleteByPrimaryKey(Integer id);

  int insert(SysDict record);

  int insertSelective(SysDict record);

  List<SysDict> selectByExample(SysDictExample example);

  SysDict selectByPrimaryKey(Integer id);

  int updateByExampleSelective(@Param("record") SysDict record, @Param("example") SysDictExample example);

  int updateByExample(@Param("record") SysDict record, @Param("example") SysDictExample example);

  int updateByPrimaryKeySelective(SysDict record);

  int updateByPrimaryKey(SysDict record);
}