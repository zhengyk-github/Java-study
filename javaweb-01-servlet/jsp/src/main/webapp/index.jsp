<html>

<%!
    String name = "郑永凯";
%>
<%!
    static {
        System.out.println("Loading Servlet!");
    }
    private int globalVar = 0;
    public void zyk(){
        System.out.println("进入了方法zyk()");
    }
%>
<body>
<h2>Hello World!</h2>

<%
    String value = "新页面";
    out.println(value);
%>
<%=name%>
<%=value%>
<h3>${value}</h3>

</body>
</html>
