<%@ page import="com.ssm.entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2022/11/25
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
    <%
        Student student = (Student) request.getAttribute("student");
        out.print(student);
    %>
</body>
</html>
