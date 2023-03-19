<%--
  Created by IntelliJ IDEA.
  User: 86185
  Date: 2022/11/21
  Time: 23:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<h1>请您登陆</h1>
<form method="post" action="${pageContext.request.contextPath}/teacher/login">
    账号:<input type="text" name="username"></br>
    密码:<input type="text" name="password"></br>
    <input type="submit" value="登陆">
</form>
</body>
</html>
