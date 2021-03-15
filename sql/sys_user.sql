-- auto-generated definition

create table sys_user
(
    user_Id          int auto_increment
        primary key,
    user_name        varchar(255)  not null,
    user_phone       varchar(255)  not null,
    sex              int           not null comment '0代表女，1代表男',
    user_credibility int           not null comment '默认值100，小于100无法接受任务',
    level            int default 1 not null comment '用户等级，初始等级为1',
    user_experience  int default 0 not null comment '初始经验为0',
    funds            int default 0 not null comment '初始用户积累资金为0'
)
    comment '系统用户表I';

