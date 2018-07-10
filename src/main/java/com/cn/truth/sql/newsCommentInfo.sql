create table news_comment_info(
news_id integer not null,
news_url tinytext not null,
user_openid varchar(32) not null,
comment_id integer not null auto_increment,
comment text not null,
comment_create_time timestamp not null DEFAULT CURRENT_TIMESTAMP on UPDATE CURRENT_TIMESTAMP,
thumbs integer not null default 0,
primary key(comment_id)
)