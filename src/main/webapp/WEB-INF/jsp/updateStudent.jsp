<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2022/11/25
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改学生信息</title>
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/student/updateStudent">
        请输入需要修改的学生的id: <input type="text" name="id"></br>
        age:<input type="text" name="age"></br>
        name<input type="text" name="name"></br>
        <input type="submit" value="修改"></br>
    </form>
</body>
</html>
