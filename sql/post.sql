-- auto-generated definition
create table post
(
    post_id          int auto_increment
        primary key,
    post_user_id     int                                    null,
    post_create_time datetime default '2020-01-01 08:00:00' not null,
    post_content     text                                   not null comment '内容以文本的形式显示',
    floor            int                                    not null comment '记录当前帖子的楼层',
    post_image       varchar(255)                           not null comment '帖子的图片路径，上传到本地服务器',
    post_level       int      default 1                     not null comment '默认等级为1，认为该帖子为初始帖子，之后的帖子，如果是对当前帖子的评论，则等级加一',
    constraint post_sys_user_id_fk
        foreign key (post_user_id) references sys_user (id)
);

