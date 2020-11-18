CREATE TABLE `user` (
  `id` int(11) not null auto_increment primary key,
  `username` varchar(11) not null comment '用户名，只能为手机号',
  `email` varchar(32) default null comment '邮箱',
  `password` varchar(100) default null comment '登陆密码',
  `real_name` varchar(20) default null comment '真实姓名',
  `register_channel_source` varchar(20) DEFAULT 'UNKNOWN' COMMENT '用户注册来源 UNKNOWN, H5,OFFICIAL_ACCOUNT, PC',
  `create_time` datetime default current_timestamp comment '创建时间',
  `update_time` datetime default current_timestamp on update current_timestamp comment '更新时间'
) ENGINE=InnoDB COMMENT='注册用户表';
