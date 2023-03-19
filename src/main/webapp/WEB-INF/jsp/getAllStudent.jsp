<%@ page import="com.ssm.entity.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2022/11/25
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询所有学生</title>
</head>
<body>
<%
  List<Student> allStudent= (List<Student>) request.getAttribute("allStudent");
  for (Student c:allStudent
  ) {
    out.print(c);
  }
%>
</body>
</html>
