<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2019/12/5
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/SongListServlet" method="post">
    <select name="singerID">
        <option value="-1">全部</option>
        <c:forEach items="${singerList }" var="singer">
            <option value="${singer.singerID }">${singer.singerName }</option>
        </c:forEach>
    </select>
    <input type="text" name="title"/>
    <input type="submit" value="搜索"/>
</form>
</div>
<table border="1" cellspacing="0" cellpadding="0" style="width: 800px; margin: 0px auto;">
    <tr>
        <th>编号</th>
        <th>名称</th>
        <th>类型</th>
        <th>点击数</th>
    </tr>
    <c:forEach items="${songList }" var="song">
        <tr>
            <td>${song.songID }</td>
            <td>${song.title }</td>
            <td>${song.typeName }</td>
            <td>${song.hit }</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
