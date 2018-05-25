create table news_info(
news_id integer not null auto_increment,
news_type integer not null default 0,
news_url varchar(64) not null,
news_create_time TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP,
news_update_time TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP on UPDATE CURRENT_TIMESTAMP,
primary key(news_id)
)