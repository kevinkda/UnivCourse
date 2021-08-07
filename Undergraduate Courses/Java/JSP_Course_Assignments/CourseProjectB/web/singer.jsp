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
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>歌手列表</title>
    <style type="text/css">
        * {
            margin: 0px;
            padding: 0px;
            list-style-type: none;
            font-size: 12px;
        }
    </style>
    <script src="js/jquery-1.11.0.min.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript">
        $(function () {
            $("#sltArea").change(function () {
//					$("#singerListDiv").load(
//						"singerbyarea",
//						{"area", $("#sltArea").val()}
//					);
                $.ajax({
                    type: "post",
                    url: "singerbyarea",
                    dataType: "text",
                    data: {
                        "area": $("#sltArea").val()
                    },
                    success: function (data) {
                        $("#singerListDiv").html(data);
                    },
                    error: function (xhr, status, errorobj) {
                        alert(status);
                        alert(errorobj);
                    }
                });

            });
        });
    </script>
</head>
<body>
<select id="sltArea" name="sltArea">
    <option value="-1">全部</option>
    <c:forEach items="${areas }" var="area">
        <option value="${area }">${area }</option>
    </c:forEach>
</select>
<div id="singerListDiv">
</div>
</body>
</html>
