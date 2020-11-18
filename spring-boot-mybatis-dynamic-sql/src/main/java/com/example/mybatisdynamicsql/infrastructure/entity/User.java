package com.example.mybatisdynamicsql.infrastructure.entity;

import java.util.Date;
import javax.annotation.Generated;

public class User {

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  private Integer id;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  private String username;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  private String email;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  private String password;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  private String realName;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  private String registerChannelSource;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  private Date createTime;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  private Date updateTime;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public Integer getId() {
    return id;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public void setId(Integer id) {
    this.id = id;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public String getUsername() {
    return username;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public void setUsername(String username) {
    this.username = username;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public String getEmail() {
    return email;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public void setEmail(String email) {
    this.email = email;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public String getPassword() {
    return password;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public void setPassword(String password) {
    this.password = password;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public String getRealName() {
    return realName;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public void setRealName(String realName) {
    this.realName = realName;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public String getRegisterChannelSource() {
    return registerChannelSource;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public void setRegisterChannelSource(String registerChannelSource) {
    this.registerChannelSource = registerChannelSource;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public Date getCreateTime() {
    return createTime;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public Date getUpdateTime() {
    return updateTime;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }
}