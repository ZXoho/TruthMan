create table article_type_info(
article_type Integer not null auto_increment,
type_name varchar(32) not null,
create_time timestamp not null default CURRENT_TIMESTAMP  comment '创建时间',
update_time timestamp not null default CURRENT_TIMESTAMP on UPDATE  CURRENT_TIMESTAMP comment '修改时间',
primary key(article_type)
)