<%@ page import="com.kevinkda.util.str.StringProcess" %>
<%@ page import="com.kevinkda.univ.course.web.test20200508.service.ToolUtils" %><%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/8
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("utf-8");
    String userAcc = StringProcess.getUtfStringFromHtml(
            request.getParameter("userAcc")
    );
    String userPass = ToolUtils.getNewString(
            request.getParameter("userPass")
    );
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if ("admin".equals(userAcc) && "admin".equals(userPass)){
        request.getRequestDispatcher("T2-3.jsp").forward(request,response);
//        response.sendRedirect("T2-3.jsp");
    }
%>
</body>
</html>
