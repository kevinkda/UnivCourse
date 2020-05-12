<%@ page import="com.kevinkda.util.str.StringProcess" %><%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/8
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String userAcc = StringProcess.getUtfStringFromHtml(request.getParameter("userAcc"));
    String userPass = StringProcess.getUtfStringFromHtml(request.getParameter("userPass"));
    if ("sa".equals(userAcc) && "sa".equals(userPass)) {
        request.getRequestDispatcher("T2-2-suc.jsp").forward(request, response);
    } else {
        response.sendRedirect("T2-2-error.jsp");
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<%=userAcc%>--%>
<%--<%=userPass%>--%>
</body>
</html>
