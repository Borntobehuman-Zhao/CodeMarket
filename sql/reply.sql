-- auto-generated definition
create table reply
(
    reply_id          int auto_increment
        primary key,
    reply_user_id     int                                    not null comment '回帖人id',
    post_user_id      int                                    not null comment '原帖子用户id',
    reply_content     varchar(255)                           not null comment '回帖限制，255个字符',
    reply_create_time datetime default '1000-01-01 08:00:00' not null comment '回帖时间',
    reply_level       int                                    not null comment '值为2时，表示对主贴的评论，为3时表示，对子贴的回复'
)
    comment '回帖表';

