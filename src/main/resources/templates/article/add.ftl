<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>文本编辑器</title>
    <!--引入ckeditor-->
    <script type="text/javascript" src=../../ckeditor/ckeditor.js"></script>
    <script type="text/javascript">
        //替换指定name的textarea为富文本编辑器
        CKEDITOR.replace('edi')
    </script>
</head>

<body>

<form action="/thruth/manager/article/save" method="post">

    <div class="form-group">
        <label>文章标题</label>
        <input class="form-control" type="text" name="title">
    </div>
    <div class="form-group">
        <label>文章种类</label>
        <input class="form-control" type="number" name="type">
    </div>
    <div class="form-group">
        <!--加入ckdeitor类使其为富文本编辑器-->
        <label>文章内容</label>
        <textarea class="ckeditor"  name="edi"></textarea>
    </div>
    <input type="submit" value="提交" />
</form>

</body>

</html>