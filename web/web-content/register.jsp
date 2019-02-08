<%--
  Created by IntelliJ IDEA.
  User: van
  Date: 18-12-26
  Time: 下午8:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生成绩查询系统</title>
    <link rel="stylesheet" href="../css/index.css"/>
</head>
<body background="../img/bg.jpg">
<div class="content">
    <div class="bidTitle">注册</div>
    <form class="logCon" action="register.action" method="post">
        <div class="line"><span>学号:</span>
            <input name="userId" class="bt_input" type="text" maxlength="16" onkeyup="value=value.replace(/[^\d]/g,'')" placeholder="请输入学号"/></div>
        <div class="line"><span>密码:</span>
            <input name="password" class="bt_input" type="password" minlength="6" maxlength="16" placeholder="请输入密码" /></div>
        <div class="line"><span>姓名:</span>
            <input name="userName" class="bt_input" type="text" minlength="1" maxlength="10" placeholder="请输入姓名"/></div>
        <button type="submit" class="loginBut">注册</button>
        <br> <br/>
        <a href="../index.jsp">已有账号</a>
    </form>
</div>
</body>
</html>
