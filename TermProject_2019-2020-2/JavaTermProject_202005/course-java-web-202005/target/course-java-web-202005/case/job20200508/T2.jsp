<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/7
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<jsp:useBean id="teacher" class="com.kevinkda.univ.course.web.job20200508.domain.Teacher"/>
<jsp:setProperty name="teacher" property="id" value="921"/>
<jsp:setProperty name="teacher" property="name" value="Karry"/>
<jsp:setProperty name="teacher" property="sex" value="1"/>
<jsp:setProperty name="teacher" property="idNum" value="123456789012345678"/>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../css/job20200508/T2.css">
</head>
<body>
<div class="container">
    <table>
        <tr>
            <td>ClassName</td>
            <td>
                <jsp:getProperty name="teacher" property="class"/>
            </td>
        </tr>
        <tr>
            <td>Teacher ID</td>
            <td>
                <jsp:getProperty name="teacher" property="id"/>
            </td>
        </tr>
        <tr>
            <td>Teacher Name</td>
            <td>
                <jsp:getProperty name="teacher" property="name"/>
            </td>
        </tr>
        <tr>
            <td>Teacher Sex</td>
            <td>
                <jsp:getProperty name="teacher" property="sex"/>
            </td>
        </tr>
        <tr>
            <td>Teacher ID Card Num.</td>
            <td>
                <jsp:getProperty name="teacher" property="idNum"/>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
