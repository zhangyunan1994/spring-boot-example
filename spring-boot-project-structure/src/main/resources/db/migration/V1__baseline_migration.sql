CREATE TABLE `sys_dict_type`
(
    `id`   int(11)     NOT NULL AUTO_INCREMENT,
    `code` varchar(20) NOT NULL COMMENT '编码',
    `name` varchar(20) NOT NULL COMMENT '名称',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB COMMENT ='字典类型表';

CREATE TABLE `sys_dict`
(
    `id`          int(11)      NOT NULL AUTO_INCREMENT,
    `type_code`   varchar(20)  NOT NULL COMMENT '类型code',
    `code`        varchar(20)  NOT NULL COMMENT 'key',
    `value`       varchar(100) NOT NULL COMMENT '值',
    `description` varchar(30) DEFAULT NULL COMMENT '描述',
    `sort`        int(11)     DEFAULT '0' COMMENT '排序',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB COMMENT ='字典表';