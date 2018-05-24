 ##API列表
 
 ###获取文章列表
```
GET /user/article/list
````
####参数
```
无
```
####返回
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

###获取未处理新闻
```
GET /user/news/list
```
####参数
```
无
```
####返回
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

###上传虚假消息
```
POST /user/news/upload
```
####参数
```
"newsUrl" : "............."
```
####返回
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
####参数
```
"message" : "今天天气真好"
```
####返回
```
"returnMessage" : "评论成功"
```
###用户信息查询
```
GET /user/info
```
####参数
```
无
```
####返回
```
{
  "code" : 0,
  "msg" : "成功"
  "data" : 
    [
       "userPoints" : 50,
       "userComments" : 
          [
             "今天天气真好",
             "他好帅啊"
           ]
     ]
}
```



