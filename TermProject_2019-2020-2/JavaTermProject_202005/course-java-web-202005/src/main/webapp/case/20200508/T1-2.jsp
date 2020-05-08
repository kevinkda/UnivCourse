<%@ page import="com.kevinkda.univ.course.web.test20200508.service.ToolUtils" %>
<%@ page import="com.kevinkda.univ.course.web.test20200508.service.StringProcess" %><%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/8
  Time: 08:58
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
    String[] strA = StringProcess.getUtfStringsFromHtml(
            new String[]{
                    "userAcc", "userPass"
            },
            request
    );
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=userAcc%>
<br>
<%=userPass%>
<br><br>
<%=strA[0]%>
<br>
<%=strA[1]%>
</body>
</html>
