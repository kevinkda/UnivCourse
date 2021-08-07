<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/14
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    request.setCharacterEncoding("UTF-8");
    String userAcc = request.getParameter("userAcc");
    String userPass = request.getParameter("userPass");
    String sex = request.getParameter("sex");
    String[] hobby = request.getParameterValues("hobby");
    String country = request.getParameter("userCountry");
    String introduce = request.getParameter("introduce");

    request.setAttribute("userAcc", userAcc);
    request.setAttribute("userPass", userPass);
    request.setAttribute("sex", sex);
    request.setAttribute("hobby", Arrays.toString(hobby));
    request.setAttribute("country", country);
    request.setAttribute("introduce", introduce);
%>
<html>
<head>
    <title>Title</title>
    <style>
        span {
            margin-left: 2em;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="core">
        <p>userAcc:<span>${userAcc}</span></p>
        <p>userPass:<span>${userPass}</span></p>
        <p>sex:<span>${sex}</span></p>
        <p>Hobby:<span>${hobby}</span></p>
        <p>Country:<span>${country}</span></p>
        <p>introduce:<span>${introduce}</span></p>
    </div>
</div>
</body>
</html>
