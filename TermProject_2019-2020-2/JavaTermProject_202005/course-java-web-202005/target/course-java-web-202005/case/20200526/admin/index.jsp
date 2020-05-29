<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/26
  Time: 09:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<frameset cols="80%,*">
    <frameset rows="80%,*">
        <frame src="${pageContext.request.contextPath}/case/20200526/admin/msg_info.jsp">
        <frame src="${pageContext.request.contextPath}/case/20200526/admin/send_msg.jsp">
    </frameset>
    <frameset>
        <frame src="${pageContext.request.contextPath}/case/20200526/admin/user_info.jsp">
    </frameset>
</frameset>
</html>
