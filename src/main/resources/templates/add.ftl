<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>文本编辑器</title>
    <!--引入ckeditor-->
    <script type="text/javascript" src="../ckeditor/ckeditor.js"></script>
    <script type="text/javascript">
        //替换指定name的textarea为富文本编辑器
        CKEDITOR.replace('edi')
    </script>
</head>

<body>

<form action="/thruth/manager/article/save" method="post">
    <div>
        <!--加入ckdeitor类使其为富文本编辑器-->
        <label>
        <textarea class="ckeditor" name="edi"></textarea>
        </label>
    </div>
    <input type="submit" value="提交" />
</form>

</body>

</html>