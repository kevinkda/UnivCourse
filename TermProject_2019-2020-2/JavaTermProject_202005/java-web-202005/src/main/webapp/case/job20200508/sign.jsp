<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/7
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
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
<%--<c:set var="userID" scope="session" value="${userID}"/>--%>
<%--<c:if test="${userID}"></c:if>--%>
<%--<c:set var="userTypeHead" scope="request" value="${requestScope.userID}"/>--%>
<%
    //    保存用户userID数据头
    String userTypeHead = null;
//    假定用户userID长度小于3位，即为非vip
    boolean userType = false;
//    用户userID长度大于3位，进行进一步处理
    if (userID.length() >= 3) {
        userTypeHead = userID.substring(0, 3);
//        用户userID以vip开头
        if ("vip".equals(userTypeHead)) {
            userType = true;
        }
    }
%>
<%=userTypeHead%>


<%--<c:if test="${requestScope.userID.substring(0,3)}" scope="request" var="vip">--%>
<%--<c:if test="${requestScope.userID.substring(0,3) == 'vip'}">--%>
<%--    dsgjld--%>
<%--</c:if>--%>

<%
    if (userType) {
%>
<jsp:include page="vip.jsp" flush="true">
    <jsp:param name="userAcc" value="<%=userAcc%>"/>
    <jsp:param name="sex" value="<%=userSex%>"/>
</jsp:include>
<%
} else {
%>
<jsp:include page="novip.jsp" flush="true">
    <jsp:param name="userAcc" value="<%=userAcc%>"/>
    <jsp:param name="sex" value="<%=userSex%>"/>
</jsp:include>
<%
    }
%>
</body>
</html>
