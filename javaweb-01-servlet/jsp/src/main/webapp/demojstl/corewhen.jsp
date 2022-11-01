
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="score" value="80"></c:set>



<c:choose>
    <c:when test="${score>=90}">
        你的成绩很优秀
    </c:when>
    <c:when test="${score<90&&score>80}">
        你的成绩一般
    </c:when>
    <c:otherwise>
        你的成绩很差
    </c:otherwise>
</c:choose>


</body>
</html>
