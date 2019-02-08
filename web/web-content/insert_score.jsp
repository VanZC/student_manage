<%--
  Created by IntelliJ IDEA.
  User: van
  Date: 18-12-28
  Time: 下午6:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生成绩</title>
    <link rel="stylesheet" href="../css/index.css" />
</head>
<body background="../img/bg.jpg">
<div class="content">
    <div class="bidTitle">注册</div>
    <form class="logCon" action="insertScore.action" method="post">
        <div class="line"><span>学号:</span>
            <input name="userId" class="bt_input" type="text" maxlength="16" onkeyup="value=value.replace(/[^\d]/g,'')" placeholder="请输入学号"/></div>
        <div class="line"><span>数学:</span>
            <input name="math" class="bt_input" type="text" minlength="1" maxlength="3" onkeyup="value=value.replace(/[^\d]/g,'')" placeholder="请输入数学成绩" /></div>
        <div class="line"><span>英语:</span>
            <input name="english" class="bt_input" type="text" minlength="1" maxlength="3" onkeyup="value=value.replace(/[^\d]/g,'')" placeholder="请输入语文成绩"/></div>
        <div class="line"><span>语文:</span>
            <input name="chinese" class="bt_input" type="text" minlength="1" maxlength="3" onkeyup="value=value.replace(/[^\d]/g,'')" placeholder="请输入英语成绩"/></div>
        <button type="submit" class="loginBut">提交</button>
    </form>
</div>
</body>
</html>
