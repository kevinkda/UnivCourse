<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/7
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<jsp:useBean id="employee" class="com.kevinkda.univ.course.web.test20200507.domain.Empolyee"/>
<jsp:setProperty name="employee" property="id" value="1"/>
<jsp:setProperty name="employee" property="name" value="admin"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:getProperty name="employee" property="id"/>
<br>
<jsp:getProperty name="employee" property="name"/>
<br>
<jsp:getProperty name="employee" property="class"/>
</body>
</html>
