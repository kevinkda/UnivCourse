<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/15
  Time: 09:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <form action="${pageContext.request.contextPath}/TestServlet0515" method="post">
        <%--    <form action="T1-2.jsp" method="post">--%>
        <p><input type="text" id="word" name="word" value="李四"></p>
        <p><input type="submit" value="Submit"></p>
    </form>
</div>
</body>
</html>
