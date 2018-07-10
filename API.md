 ##API列表

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
    "code": 0,
    "msg": "成功",
    "data": [
        {
            "newsUrl": "https://github.com/ZXoho",
            "newsCreateTime": "2018-06-04T08:46:19.000+0000",
            "userOpenid": "dg45vb63"
        },
        {
            "newsUrl": "http://unbug.github.io/codelf/",
            "newsCreateTime": "2018-06-04T08:49:15.000+0000",
            "userOpenid": "6hg54n5"
        }
    ]
}
```

###用户上传虚假消息
```
POST truth/user/news/upload
```
#####参数
```
"newsUrl" : " "
"userOpenid" : " "
```
#####返回
```
{
    "newsId": 3,
    "userOpenid": "d4gvb523",
    "newsType": 0,
    "newsUrl": "http://op.hanhande.com/",
    "newsCreateTime": null,
    "newsUpdateTime": null
}
```
###用户评论
```
POST /truth/user/comment
```
#####参数
```
"message" : "今天天气真好"
"newsId" : " "
"newsUrl" : " "
"userOpenid" : " "

```
#####返回
```
{
    "userOpenid": "x64v86esd7",
    "comment": "周鑫我喜欢你",
    "commentCreateTime": null
}
```

###获取新闻评论
```
GET /truthMan/user/news/getNewsComment
```
#####参数
```
"newsId"
```
#####返回
```
[
    {
        "userOpenid": "x64v86esd7",
        "comment": "这个超好用",
        "commentCreateTime": "2018-06-04T09:53:22.000+0000",
        "commentId": 3
    },
    {
        "userOpenid": "x64v86esd7",
        "comment": "赞",
        "commentCreateTime": "2018-06-04T09:56:09.000+0000",
        "commentId": 4
    },
    {
        "userOpenid": "d64gv56wes",
        "comment": "挺好用的不错，",
        "commentCreateTime": "2018-06-04T09:57:12.000+0000",
        "commentId": 5
    }
]
```
###用户评论信息查询
```
GET /user/news/getUserComment
```
#####参数
```
"userOpenid"
```
#####返回
```
[
    {
        "newsId": 1,
        "commentId": 2,
        "comment": "周鑫我喜欢你",
        "commentCreateTime": "2018-06-04T09:45:35.000+0000"
    },
    {
        "newsId": 2,
        "commentId": 3,
        "comment": "这个超好用",
        "commentCreateTime": "2018-06-04T09:53:22.000+0000"
    },
    {
        "newsId": 2,
        "commentId": 4,
        "comment": "赞",
        "commentCreateTime": "2018-06-04T09:56:09.000+0000"
    }
]
```



