<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h1>登录</h1>
<div style="text-align: center">
    <%--以post方式提交表单--%>
    <form method="post" action="${pageContext.request.contextPath}/login">
        用户名：<input type="text" name="username"> <br>
        密码：<input type="password" name="password"> <br>
        爱好：<input type="checkbox" name="hobbys" value="代码">代码
        <input type="checkbox" name="hobbys" value="听歌">听歌
        <input type="checkbox" name="hobbys" value="动漫">动漫
        <input type="checkbox" name="hobbys" value="电影">电影
        <br>
        <input type="submit">
    </form>
</div>

</body>
</html>
