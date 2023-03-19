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
<a href="${pageContext.request.contextPath
}/student/toStudentById">通过id查询一个学生</a>
</br>
<a href="${pageContext.request.contextPath
}/student/toAddStudent">添加学生</a>
</br>
<a href="${pageContext.request.contextPath
}/student/toUpdataStudent">修改学生信息</a>
</br>
<a href="${pageContext.request.contextPath
}/student/toDeleteStudent">通过id删除学生</a>
</br>
<a href="${pageContext.request.contextPath
}/student/getAllStudent">获取所有学生信息</a>
</body>
</html>
