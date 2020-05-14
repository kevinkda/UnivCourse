<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/12
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div>
        <p>Modify</p>
        <form action="<c:url value="/ModifyNewsServlet0513"/>" method="post">
            <p>
                <label for="newsId">新闻ID：</label>
                <input type="text" id="newsId" name="newsId"/>
            </p>
            <p>
                <label for="newsTitle">新闻标题：</label>
                <input type="text" id="newsTitle" name="newsTitle"/>
            </p>
            <p><input type="submit"/></p>
        </form>
    </div>
</div>
</body>
</html>
