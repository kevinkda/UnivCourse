<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  ~ Copyright (c) Kevin KDA 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
  ~ Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
  ~ Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
  ~ Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
  ~ Vestibulum commodo. Ut rhoncus gravida arcu. 
  --%>

<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2019/12/5
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品列表</title>
    <style type="text/css">
        #goodsListDiv {
            width: 1024px;
            margin: 0px auto;
            overflow: hidden;
        }

        #goodsDiv {
            width: 200px;
            float: left;
            margin: 2px;
            border: 1px solid red;
            text-align: center;
        }
    </style>
</head>
<body>
<form action="${pageContext.request.contextPath}/DriversServlet" method="post">
    <input type="submit" value="Submit">
</form>
<ul>
    <c:forEach items="${drivers}" var="s">
        <li>
            ${s.driversId},${s.driversName},${s.unitPrice} &nbsp;
            <a href="#">加入购物车</a>
        </li>
    </c:forEach>
</ul>
<table class="tableSCart">
    <tr>
        <th width="70px">ID</th>
        <th width="200px">商品名称</th>
        <th width="100px">价格</th>
    </tr>
    <c:forEach items="${drivers}" var="s">
        <tr>
            <td align="center">${s.driversId}</td>
            <td align="center">${s.driversName}</td>
            <td align="center">${s.unitPrice}</td>
        </tr>
    </c:forEach>
</table>
<div id="goodsListDiv" style="width: 1024px;">
    <c:forEach items="${goodsList}" var="goods">
        <div id="goodsDiv" style="width: 200px;">
            <img src="img/s2.jpg" style="width: 160px; height: 160px;"/><br/>
            <a href="#">${goods.gName}</a><br/>
            <span style="color: red;">${goods.price}</span><br/>
            <a href="Cart?gid=${goods.gid}">加入购物车</a>
        </div>
    </c:forEach>
</div>
</body>
</html>
