<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/7/7
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        a:link,a:visited,a:active{
            color: skyblue;
        }
        a:hover{
            color: #00f;
        }
        .container {
            width: 50%;
            margin: 0 auto;
            text-align: center;
        }

        table {
            width: 50%;
            margin: 20px auto;
            text-align: center;

        }
    </style>
</head>
<body>
<div class="container">
    <h2>"${trainList.train_no}"详细信息</h2>
    <table border="1" width="400">
        <tr>
            <td>车次</td>
            <td>${trainList.train_no}</td>
        </tr>
        <tr>
            <td>发车———到达</td>
            <td>${trainList.start_station}-${trainList.arrival_station}</td>
        </tr>
        <tr>
            <td>发时———到时</td>
            <td>${trainList.start_time}-${trainList.arrival_time}</td>
        </tr>
        <tr>
            <td>车型</td>
            <td>${trainList.type}</td>
        </tr>
        <tr>
            <td>运行时（小时）</td>
            <td>${trainList.runtime}</td>
        </tr>
        <tr>
            <td>里程</td>
            <td>${trainList.mile}</td>
        </tr>
    </table>
    <a href="getAll">返回主页</a>
</div>

</body>
</html>
