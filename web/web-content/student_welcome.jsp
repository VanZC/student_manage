<%--
  Created by IntelliJ IDEA.
  User: van
  Date: 18-12-27
  Time: 下午12:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>学生成绩查询系统</title>
    <link rel="stylesheet" href="css/index.css"/>
</head>
<body background="img/bg.jpg">
<div class="content">
    <div class="line">
        <div class="bidTitle">您好，请输入学号</div>
        <br/>
        <form action="studentSelectScore.action" method="get">
            <div class="line"><span>学号:</span>
                <input name="userId" class="bt_input" type="text" maxlength="16" onkeyup="value=value.replace(/[^\d]/g,'')" placeholder="请输入学号"/></div>
            <button type="submit" class="loginBut">查询</button>
        </form>
    </div>

</div>
</body>
</html>
