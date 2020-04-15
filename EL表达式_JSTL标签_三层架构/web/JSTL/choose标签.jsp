<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>choose</title>
</head>
<body>

<h1>演示开始--choose</h1>
<%
request.setAttribute("number",51);
%>
<c:choose>
    <c:when test="${number==1}">星期一</c:when>
    <c:when test="${number==51}">星期五一</c:when>
</c:choose>

</body>
</html>
