<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/25
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="../../js/jquery-1.12.4.js"></script>
</head>
<body>
<div class="container">
    <div class="core">

    </div>
</div>
</body>
<script>
    $(function () {
        $.ajax({
            url: "/course/JsonServlet0525",
            type: 'post',
            dataType: 'json',
            async: true,
            success: function (data) {
                console.log(data);
            }
        });
    });
</script>
</html>
