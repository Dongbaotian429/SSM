<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2022/11/25
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除学生</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/student/deleteStudent">
  请输入需要删除学生的id</br>
  id: <input type="text" name="id"></br>
      <input type="submit" value="删除"></br>
</form>


</body>
</html>
