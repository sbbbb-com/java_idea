<%@ page contentType="text/html;charset=UTF-8" language="java"   %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 在很久很久以前  服务器凉凉了，请等一下昂

<%
//在域中存储数据
    session.setAttribute("name","二狗子");

    request.setAttribute("name","张三");
    session.setAttribute("age","18");
%>

<h2>el获取值</h2>
${requestScope.name}
${sessionScope.age}
<hr>
<br>
${name}
<br>
<hr>
${sessionScope.name}
<br>
<hr>

</body>
</html>
