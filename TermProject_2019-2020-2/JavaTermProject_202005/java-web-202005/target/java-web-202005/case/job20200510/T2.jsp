<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/9
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    Cookie[] cookies = request.getCookies();
    String userAcc = null;
    for (Cookie cookie :
            cookies) {
        if (cookie.getName().equals("userAcc")) {
            userAcc = cookie.getValue();
            request.setAttribute("userAcc", userAcc);
        }
    }
    if (userAcc == null) {
        response.sendRedirect("T2-login.jsp");
    }
%>
<html>
<head>
    <title>job20200510T2</title>
</head>
<body>
<div class="container">
    <%=userAcc%>，欢迎您
</div>
</body>
</html>
