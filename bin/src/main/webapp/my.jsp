<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Index</title>
</head>
<body>
<form action="/save" method="post">
    姓名：<input type="text" th:value="${name}" name="name"><br/>
    年龄：<input type="text" th:value="${age}" name="age"><br/>
    简介：<input type="text" th:value="${info}" name="info"><br/>
    <button>保存</button>
</form>
</body>
</html>