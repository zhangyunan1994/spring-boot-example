package com.example.structure.infrastructure.mapper;

import com.example.structure.infrastructure.entity.SysDictType;
import com.example.structure.infrastructure.entity.SysDictTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDictTypeMapper {

  long countByExample(SysDictTypeExample example);

  int deleteByExample(SysDictTypeExample example);

  int deleteByPrimaryKey(Integer id);

  int insert(SysDictType record);

  int insertSelective(SysDictType record);

  List<SysDictType> selectByExample(SysDictTypeExample example);

  SysDictType selectByPrimaryKey(Integer id);

  int updateByExampleSelective(@Param("record") SysDictType record, @Param("example") SysDictTypeExample example);

  int updateByExample(@Param("record") SysDictType record, @Param("example") SysDictTypeExample example);

  int updateByPrimaryKeySelective(SysDictType record);

  int updateByPrimaryKey(SysDictType record);
}