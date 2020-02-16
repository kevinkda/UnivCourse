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
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Shopping Cart</title>
    <style type="text/css">
        .tableSCart {
            border: 1px solid #F00;
        }
    </style>
</head>
<body>
<h3>Shopping Cart</h3>
<form action="${pageContext.request.contextPath}/ShoppingCartServlet" method="post">
    <input type="submit" value="Submit">
</form>
<table class="tableSCart">
    <tr>
        <%--        <th>选择</th>--%>
        <th width="200px">商品名称</th>
        <th width="70px">图片</th>
        <th width="150px">型号</th>
        <th width="100px">价格</th>
        <th width="70px">数量</th>
        <th width="100px">小计</th>
    </tr>
    <c:forEach items="${shoppingcart}" var="s">
        <tr>
                <%--            <td align="center"><input type="checkbox" name="vehicle" value="Car" checked="${s.checked?"checked":0}"/></td>--%>
            <td align="center"><a href="${s.commodityUrl}">${s.tradeName}</a></td>
            <td align="center"><img src="${s.photo}" onclick="${s.photoUrl}" align="Photo"></td>
            <td align="center">${s.model}</td>
            <td align="center">${s.price}</td>
            <td align="center">${s.amount}</td>
            <td align="center">${s.price*s.amount}</td>
        </tr>
    </c:forEach>
    <%--    <tr>--%>
    <%--        &lt;%&ndash;        <td></td>&ndash;%&gt;--%>
    <%--        <td></td>--%>
    <%--        <td></td>--%>
    <%--        <td></td>--%>
    <%--        <td></td>--%>
    <%--        <td></td>--%>
    <%--        <c:forEach items="shoppingcart" var="t">--%>
    <%--            <td></td>--%>
    <%--        </c:forEach>--%>
    <%--    </tr>--%>
</table>
</body>
</html>
