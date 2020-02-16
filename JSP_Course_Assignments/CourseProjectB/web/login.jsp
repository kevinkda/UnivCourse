<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  ~ Copyright (c) Kevin KDA 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
  ~ Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
  ~ Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
  ~ Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
  ~ Vestibulum commodo. Ut rhoncus gravida arcu.
  --%>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>登录</title>
    <style type="text/css">
        img, a {
            cursor: pointer;
        }
    </style>
    <script type="text/javascript">
        function changeCode() {
            var img = document.getElementById("imgCode");
            img.src = "${pageContext.request.contextPath}/VerificationCodeServlet?" + Math.random();
        }
        function changeVerifyCode(){
            $("#verifyCode").attr("src","<%=path %>/verifyCode.jpg?r="+Math.random());
        }
    </script>
</head>

<body>
<form action="login" method="post">
    <input type="text" name="loginID"/><br/>
    <input type="text" name="inCode"/>
    <img id="imgCode" src="${pageContext.request.contextPath}/VerificationCodeServlet" onclick="changeCode()" style="width: 80p; height: 30px"/>
    <a onclick="changeCode()">换一张</a><br/>

    <p>
        验证码：<input type="text" name="verifyCode" />
        <img alt="" id="verifyCode" src="<%=path %>/verifyCode.jpg?r=<%=Math.random() %>"
             onclick="changeVerifyCode()" style="cursor: pointer;">
        <a href="javascript:void(0)" onclick="changeVerifyCode()">看不清，换一张?</a>
    </p>

    <input type="submit" value="登录"/>
</form>
<c:if test="${!empty login  }" var="islogin">
    ${login.loginID }<a href="exit">退出</a>
</c:if>
</body>
</html>
