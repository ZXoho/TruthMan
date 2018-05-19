create table article_info(
article_id VARCHAR(32) not null,
article_type int not null comment '文章种类',
article_status tinyint(3) DEFAULT 0 comment '文章状态 ，默认0为上架，1为下架',
article_title VARCHAR (32) not null comment '文章标题',
article_content MEDIUMTEXT not null comment '文章内容',
create_time TIMESTAMP  not null DEFAULT CURRENT_TIMESTAMP  comment'创建时间',
update_time TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP  on UPDATE CURRENT_TIMESTAMP  comment '修改时间',
PRIMARY key (article_id)
)comment '文章表'