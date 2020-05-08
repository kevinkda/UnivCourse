<%@ page import="com.kevinkda.util.str.StringProcess" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/8
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String userAcc = StringProcess.getUtfStringFromHtml(request.getParameter("userAcc"));
    String userPass = StringProcess.getUtfStringFromHtml(request.getParameter("userPass"));
%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../css/job20200509/T1.css">
</head>
<body>
<div class="container">
    <div class="user-wrapper">
        <ul>
            <li><span>userID:</span></li>
            <li>
                <span>userAcc:</span>
                <%=userAcc%>
            </li>
            <li>
                <span>userPass:</span>
                <%=userPass%>
            </li>
            <li><span>userName:</span></li>
        </ul>
    </div>

    <div class="table-wrapper">
        <table>
            <tr>
                <td>订单ID</td>
                <td>商品名称</td>
                <td>商品价格</td>
                <td>商品数量</td>
                <td>商品总价</td>
            </tr>
            <tr>
                <td>1</td>
                <td>iPhone</td>
                <td>9210</td>
                <td>21</td>
                <td>${9210*21}</td>
            </tr>
        </table>
    </div>
</div>
</body>
</html>
