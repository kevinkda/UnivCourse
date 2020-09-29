<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/27
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        * {
            background: #ffffff;
        }
    </style>
</head>
<frameset cols="80%,*">
    <frameset rows="80%,*">
        <frame src="msg_info.jsp">
        <frame src="msg.jsp">
    </frameset>
<%--    <frameset>--%>
        <frame src="user_info.jsp">
<%--    </frameset>--%>
</frameset>
</html>
