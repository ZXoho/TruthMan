 ##API列表
 
 ###用户获取文章列表
```
GET /user/article/list
````
#####参数
```
无
```
#####返回
```
{
   "code" : 0,
   "msg" : "成功",
   "data" : 
   [ articleId : 123,
     articleType : 0,
     updateTime : "yyyy-mm-dd",
     content : ".........."
   ]
}     
```

###用户获取未处理新闻
```
GET /user/news/list
```
#####参数
```
无
```
#####返回
```
{
   "code" : 0,
   "msg" : "成功",
   "data" :
     [
        "newsId" : 123,
        "createTime" : "yyyy-mm-dd",
        "newsUrl" : "........."
      ]
}
```

###用户上传虚假消息
```
POST /user/news/upload
```
#####参数
```
"newsUrl" : "............."
```
#####返回
```
{
  "code" : 0,
  "msg" : "成功”,
  "data" : 
    [
       //TODO 对URL链接进行截图展示
       ‘newsUrl" : ".............”
    ]
```
###用户评论
```
POST /user/comment
```
#####参数
```
"message" : "今天天气真好"
```
#####返回
```
"returnMessage" : "评论成功"
```
###用户信息查询
```
GET /user/info
```
#####参数
```
无
```
#####返回
```
{
  "code" : 0,
  "msg" : "成功"
  "data" : 
    [
       "userPoints" : 50,
       "userComments" : 
          [
            "message" : "今天天气真好",
            "url" : ".........."
          ]
          [
             "message" : "他好帅啊",
             "url" : "........."
          ]
    ]
}
```

###用户登录获取openid
```
GET /user/login
```
#####参数
```
"code"  //前端传递的code，以此获得openid
```


###后台获取待处理消息
```
GET /manager/news/list
```
#####参数
```
无
```
#####返回
```
"newsId"
"newsCreateTime"
"newsUrl"
```

###后台新闻处理
```
POST /manager/news/edit
```

###后台添加文章
```
POST /manager/article/add
```

###后台文章修改
```
GET /manager/article/index
```

###后台文章删除
```
POST /manager/article/delete
```



