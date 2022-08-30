SET NAMES utf8mb4;

CREATE TABLE SYS_USER (
    id          BIGINT NOT NULL,
    name        VARCHAR(100) NULL,
    nickname    VARCHAR(100) NULL,
    email       VARCHAR(100) NULL,
    mobile      VARCHAR(100) NULL,
    avatar      VARCHAR(100) NULL,
    create_time DATETIME NULL,
    update_time DATETIME NULL,
    enabled     tinyint(1) NOT NULL,
    PRIMARY KEY (id)
) comment '用户表';

CREATE TABLE SYS_ACCOUNT (
    id            BIGINT(20) NOT NULL,
    create_time   DATETIME NULL,
    update_time   DATETIME NULL,
    user_id       BIGINT(20) NOT NULL,
    passport      VARCHAR(100) NULL,
    PRIMARY KEY (id)
) comment '账号信息';

CREATE TABLE SYS_BINDING (
    id            BIGINT(20) NOT NULL,
    create_time   DATETIME NULL,
    update_time   DATETIME NULL,
    user_id       BIGINT(20) NOT NULL,
    bind_value    VARCHAR(100) NOT NULL,
    UNIQUE KEY UK_SYS_BINDING_BIND_VALUE (bind_value) USING BTREE,
    PRIMARY KEY (id)
) comment '绑定信息';
