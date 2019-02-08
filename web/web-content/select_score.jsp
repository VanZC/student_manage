<%--
  Created by IntelliJ IDEA.
  User: van
  Date: 18-12-28
  Time: 下午6:24
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
        <div class="bidTitle">您好，管理员</div>
        <br/>
        <table class="font" cellspacing="1" cellpadding="15" width="700">
            <thead>
            <th>学号</th>
            <th>姓名</th>
            <th>数学</th>
            <th>英语</th>
            <th>语文</th>
            </thead>
            <tbody>
            <s:iterator value="studentList">
            <tr>
                <td><s:property value="id"/></td>

                <td><s:property value="name"/></td>

                <td><s:property value="math"/></td>

                <td><s:property value="english"/></td>

                <td><s:property value="chinese"/></td>
            </tr>
            </s:iterator>
        </table>


    </div>
</div>
<style>
    .font{font-size:25px}
    .font{color: #edefee}
    .font{text-align: center}
</style>
</body>
</html>
