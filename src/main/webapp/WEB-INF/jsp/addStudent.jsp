<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2022/11/25
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/student/addStudent">
    请输入学生的信息:</br>
    id:<input type="text" name="id"></br>
    age:<input type="text" name="age"></br>
    name:<input type="text" name="name"></br>
    <input type="submit" value="添加">
</form>
</body>
</html>
