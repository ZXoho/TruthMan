create table news_comment_info(
newsId integer not null,
newsUrl tinytext not null,
userOpenid varchar(32) not null,
commentId integer not null auto_increment,
comment text not null,
commentCreateTime timestamp not null DEFAULT CURRENT_TIMESTAMP on UPDATE CURRENT_TIMESTAMP,
primary key(commentId)
)