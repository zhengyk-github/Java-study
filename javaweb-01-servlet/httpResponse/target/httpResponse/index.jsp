<%@ page language="java" contentType="text/html; chareset=UTF-8" pageEncoding="UTF-8"%>

<html>
<meta http-equiv="Content-Type" content="text/xml;charset=UTF-8">
<body>
<h2>Hello World!</h2>

<%--这是提交的路径，需要找到项目的路径--%>
<%--${pageContext.request.contextPath} 代表当前的项目--%>
<form action="${pageContext.request.contextPath}/login" method="get">
    用户名：<input type="text" name="username"> <br>
    密码：<input type="password" name="password"> <br>
    <input type="submit">
</form>


</body>
</html>
