<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/8
  Time: 01:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
    String userID = request.getParameter("userID");
    String userAcc = request.getParameter("userAcc");
    String userSex = request.getParameter("sex");

    request.setAttribute("userID", userID);
    request.setAttribute("userAcc", userAcc);
    request.setAttribute("userSex", userSex);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
${fn:startsWith(userID, "vip")}
${fn:startsWith(fn:toLowerCase(userID), "vip")}
</body>
</html>
