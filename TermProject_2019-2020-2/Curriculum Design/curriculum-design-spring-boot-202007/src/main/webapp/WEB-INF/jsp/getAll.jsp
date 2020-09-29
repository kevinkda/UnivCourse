<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/7/7
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%%>
<html>
<head>
    <title>Title</title>
    <style>
        a:link,a:visited,a:active{
            text-decoration:none;
            color: #00f;
        }

        a:hover{
            text-decoration:underLine;
            color: #f00;
        }

        .container {
            width: 50%;
            margin: 0 auto;
            text-align: center;
        }

        .container {
            width: 80%;
            margin: 0 auto;
            text-align: center;
        }

        table {
            width: 80%;
            margin: 0 auto;
            text-align: center;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>火车详情班次表</h1>
    <form action="${pageContext.request.contextPath}/deleteTrainItem" method="post">
        <input type="hidden" id="method" name="method" value="dels">
        <table border="1" width="700">
            <tr>
                <th><a href="javascript:del()">删除</a></th>
                <th>车次</th>
                <th>发车———到达</th>
                <th>发时———到时</th>
                <th>车型</th>
                <th>运行时（小时）</th>
            </tr>
            <c:forEach items="${trainList}" var="item">
                <tr>
                    <td>
                        <input type="checkbox" name="trainNo" value="${item.train_no}">
                    </td>
                    <td>
                            <%--                        <a href="${pageContext.request.contextPath}/TrainInfoServlet?method=getTrainById&no=${item.train_no}">${item.train_no}</a>--%>
                        <a href="${pageContext.request.contextPath}/getTrain?trainNo=${item.train_no}"
                           name="No">${item.train_no}</a>
                    </td>
                    <td>${item.start_station}-${item.arrival_station}</td>
                    <td>${item.start_time}-${item.arrival_time}</td>
                    <td>${item.type}</td>
                    <td>${item.runtime}</td>
                </tr>
            </c:forEach>
        </table>
    </form>
</div>
</body>
<script type="text/javascript">
    function del() {
        let delInfo = "";
        // 统计选中的checkbox个数
        let n = 0;
        // 获取所有checkbox和车次号码
        let nos = document.getElementsByName("trainNo");
        let Nos = document.getElementsByName("No");
        for (let i = 0; i < nos.length; i++) {
            if (nos[i].checked) {
                n++;
                delInfo += "“" + Nos[i].innerText + "”,";
            }
        }
        if (delInfo !== "") {
            delInfo = delInfo.substring(0, delInfo.length - 1);
            if (confirm("是否删除车次号为：" + delInfo + " 的信息？")) {
                document.forms[0].submit();
            }
        } else {
            alert("请选择车次");
            return false;
        }
    }
</script>
</html>
