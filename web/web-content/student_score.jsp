
<%--
  Created by IntelliJ IDEA.
  User: van
  Date: 18-12-29
  Time: 下午12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>查询成绩结果</title>
    <link rel="stylesheet" href="css/index.css"/>
</head>
<body>
<body background="img/bg.jpg">
<div class="content">
    <div class="line">
        <div class="bidTitle">您好，<s:property value="userName"/>同学，这是您的成绩</div>
        <br/>
            <table class="font" cellspacing="1" cellpadding="15" width="700">
                <thead>
                <th>学科</th>
                <th>成绩</th>
                </thead>
                <tbody>
                <tr>
                    <td>数学</td>
                    <td><s:property value="math"/></td>
                </tr>
                <tr>
                    <td>语文</td>
                    <td><s:property value="chinese"/></td>
                </tr>
                <tr>
                    <td>英语</td>
                    <td><s:property value="english"/></td>
                </tr>
                </tbody>
            </table>
    </div>

</div>学号：<s:property value="userId"/>,<a href="index.jsp">登出</a>
<style>
    .font{font-size:25px}
    .font{color: #edefee}
    .font{text-align: center}
</style>
</body>
</html>
