
<%@ page import="com.ssm.entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: 86185
  Date: 2022/11/21
  Time: 23:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
  <form method="post" action="${pageContext.request.contextPath}/student/getStudentById">
    请输入查询的id:<input type="text" name="id"><br/>
    <input type="submit" value="查询">
  </form>
</body>
</html>
