-- auto-generated definition
create table task
(
    task_id          int auto_increment comment '任务id'
        primary key,
    title            varchar(255)                           not null comment '任务名称',
    introduction     varchar(255)                           not null comment '项目任务简介',
    task_status      int      default 0                     not null comment '0代表尚未被接取，1代表已经被接取',
    demand           varchar(255)                           not null comment '存储文件路径',
    amount           int                                    not null comment '任务金额',
    cycle            varchar(255)                           not null,
    task_create_time datetime default '2020-01-01 08:00:00' null comment '默认创建时间',
    task_end_time    datetime default '9999-12-31 23:59:59' null comment '默认结束时间'
)
    comment '任务表';

