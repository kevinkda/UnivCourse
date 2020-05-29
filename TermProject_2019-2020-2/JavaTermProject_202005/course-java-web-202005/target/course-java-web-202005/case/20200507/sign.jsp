<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/7
  Time: 09:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String userAcc = (String) request.getAttribute("userAcc");
    String userSex = (String) request.getAttribute("sex");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=userAcc%>
<%=userSex%>


<%--<c:if test="${userSex eq 0}">--%>
<%--    <jsp:include page="woman.jsp" flush="true">--%>
<%--        <jsp:param name="userAcc" value="<%=userAcc%>"/>--%>
<%--        <jsp:param name="sex" value="<%=userSex%>"/>--%>
<%--    </jsp:include>--%>
<%--</c:if>--%>


<%
    if ("1".equals(userSex)) {
%>
<jsp:include page="man.jsp" flush="true">
    <jsp:param name="userAcc" value="<%=userAcc%>"/>
    <jsp:param name="sex" value="<%=userSex%>"/>
</jsp:include>
<%
} else {
%>
<jsp:include page="woman.jsp" flush="true">
    <jsp:param name="userAcc" value="<%=userAcc%>"/>
    <jsp:param name="sex" value="<%=userSex%>"/>
</jsp:include>
<%
    }
%>
</body>
</html>
