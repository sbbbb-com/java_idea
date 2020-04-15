<%@ page import="cn.itcast.domain.User" %>
<%@ page import="java.awt.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    User user=new User();
    user.setName("张三");
    user.setAge(18);
    user.setBirthday(new Date());

    request.setAttribute("u",user);

    //集合
    List list=new ArrayList();
    list.add("aaa");
    list.add("bbb");
    list.add(85);
    list.add(user);
    request.setAttribute("list",list);

    //map集合
    Map map=new HashMap();
    map.put("sname","李四");
    map.put("gender","男");
    map.put("user",user);
    request.setAttribute("map",map);


%>

<h3>el获取对象中的值</h3>
${requestScope.u.name}

        <%--
        通过的是对象的属性来获取
        setter或getter方法，去掉set或get,在剩余部分，首字母变小写
        setName--->Name---->name
        --%>
${u.birthday}
${u.birthday.month }
<br>
<hr>
${u.birStr}
<br>
集合
${list}
<hr>
测试集合
${list[3]}
<h2>获取map的值</h2>
${map.sname}
${map.user}
${map["gender"]}

<h4>empty运算符</h4>
<%
String h="d";
request.setAttribute("h",h);
%>
${empty h}

</body>
</html>
