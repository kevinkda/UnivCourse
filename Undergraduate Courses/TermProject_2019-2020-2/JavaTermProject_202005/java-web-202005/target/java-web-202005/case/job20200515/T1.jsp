<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="com.kevinkda.univ.course.web.job20200515.domain.Car" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/14
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    List<Car> list = new ArrayList<Car>();
    Random random = new Random();
    for (int i = 0; i < 11; i++) {
        list.add(new Car(
                i,
                "大众",
                "S" + i,
                "Red",
                random.nextInt(300000) + 10000
        ));
    }
    request.setAttribute("carList", list);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div>
        <h2>Student List</h2>
        <table>
            <tr>
                <td>Car ID</td>
                <td>品牌</td>
                <td>型号</td>
                <td>颜色</td>
                <td>价格(c:if)</td>
                <td>价格(c:choose)</td>
            </tr>
            <c:forEach items="${carList}" var="i">
                <tr>
                    <td>${i.id}</td>
                    <td>${i.brand}</td>
                    <td>${i.model}</td>
                    <td>${i.color}</td>
                    <c:if test="${i.price lt 100000}">
                        <td style="color: black">${i.price}</td>
                    </c:if>
                    <c:if test="${i.price ge 100000 && i.price lt 200000}">
                        <td style="color: blue">${i.price}</td>
                    </c:if>
                    <c:if test="${i.price ge 200000}">
                        <td style="color: green">${i.price}</td>
                    </c:if>
                    <c:choose>
                        <c:when test="${i.price < 100000}">
                            <td style="color: black">${i.price}</td>
                        </c:when>
                        <c:when test="${i.price >= 100000 && i.price < 200000}">
                            <td style="color: blue">${i.price}</td>
                        </c:when>
                        <c:when test="${i.price >= 200000}">
                            <td style="color: green">${i.price}</td>
                        </c:when>
                    </c:choose>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
