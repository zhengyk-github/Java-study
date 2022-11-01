<%--
  Created by IntelliJ IDEA.
  User: zyk
  Date: 2022/10/21
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:forward page="/demoForward/tag2.jsp">
    <jsp:param name="name" value="zhengyongkai"/>
    <jsp:param name="age" value="26"/>
</jsp:forward>
</body>
</html>
