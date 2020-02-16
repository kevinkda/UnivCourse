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
  User: Administrator
  Date: 2019/12/13
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>歌曲列表</title>
</head>
<body>
<ul>
    <c:forEach items="${songList }" var="song">
        <li>${song.title }</li>
    </c:forEach>
</ul>
<a href="slps?index=1">首页</a>&nbsp;
<a href="slps?index=${index-1==0?1:index-1 }">上一页</a>&nbsp;
<a href="slps?index=${index+1>max?max:index+1 }">下一页</a>&nbsp;
<a href="slps?index=${max }">末页</a>&nbsp;
</body>
</html>
