<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/9
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String userAcc = request.getParameter("userAcc");
    Cookie userCookie = new Cookie("userAcc", userAcc);
//    存活期为一个月 30 * 24 * 60 * 60
    userCookie.setMaxAge(30 * 24 * 60 * 60);
//    设置Cookie访问路径
    userCookie.setPath("/");
//    添加Cookie记录
    response.addCookie(userCookie);
//    重定向至首页
    response.sendRedirect("T2.jsp");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
