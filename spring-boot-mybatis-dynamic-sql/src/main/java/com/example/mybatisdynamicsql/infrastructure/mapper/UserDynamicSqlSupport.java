package com.example.mybatisdynamicsql.infrastructure.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDynamicSqlSupport {

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final User user = new User();

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<Integer> id = user.id;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<String> username = user.username;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<String> email = user.email;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<String> password = user.password;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<String> realName = user.realName;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<String> registerChannelSource = user.registerChannelSource;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<Date> createTime = user.createTime;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<Date> updateTime = user.updateTime;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final class User extends SqlTable {

    public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

    public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

    public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

    public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

    public final SqlColumn<String> realName = column("real_name", JDBCType.VARCHAR);

    public final SqlColumn<String> registerChannelSource = column("register_channel_source", JDBCType.VARCHAR);

    public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

    public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

    public User() {
      super("user");
    }
  }
}