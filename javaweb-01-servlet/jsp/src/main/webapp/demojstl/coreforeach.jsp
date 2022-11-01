<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList<String> people = new ArrayList<>();
    people.add("麻子");
    people.add("王二");
    people.add("张三");
    people.add("李四");
    request.setAttribute("list",people);
%>
<c:forEach var="people" items="${list}">
    <c:out value="${people}"/> <br>

</c:forEach>


</body>
</html>
