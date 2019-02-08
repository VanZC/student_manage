<%--
  Created by IntelliJ IDEA.
  User: van
  Date: 18-12-26
  Time: 下午3:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>学生成绩查询系统</title>
    <link rel="stylesheet" href="css/index.css" />
</head>
<body background="img/bg.jpg">
    <div class="content">
        <div class="bidTitle">您好，管理员</div>
        <br> <br/>
        <div class="line">
            <form method="get" action="selectAll.action">
                <button type="submit" class="loginBut">查看学生成绩</button>
            </form>
        </div>
        <div class="line">
            <form method="get" action="web-content/insert_score.jsp">
                <button type="submit" class="loginBut">添加学生成绩</button>
            </form>
        </div>

    </div>
</body>
</html>
