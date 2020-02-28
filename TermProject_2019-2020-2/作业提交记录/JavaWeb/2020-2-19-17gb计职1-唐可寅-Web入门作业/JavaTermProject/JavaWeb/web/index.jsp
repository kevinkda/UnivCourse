<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/2/19
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh">
<head>
    <title>Project Directory</title>
    <link rel="stylesheet" href="./css/index.css">
    <script src="./js/index.js"></script>
</head>
<body>
<div class="container">
    <div class="top-wapper">
        <h1 id="top-word">Project list of the second semester 2019-2020</h1>
    </div>

    <div class="core-wapper">
        <div class="table-wapper">
            <table>
                <thead>
                <th>SN</th>
                <th>Project</th>
                <th>Date</th>
                <th>Project Description</th>
                <th>Task Details</th>
                <th>Affiliated Courses</th>
                </thead>
                <tr>
                    <td>1</td>
                    <td>Java程序开发概述</td>
                    <td>20200217</td>
                    <td>控制台输出个人简历</td>
                    <td><a href="taskDetails/job20200217.html">Detail</a></td>
                    <td>Java SE</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td><a href="./job20200219/vitae.jsp">Web入门作业 - Job20200219</a></td>
                    <td>20200219</td>
                    <td>Servlet用语句输出个人简历</td>
                    <td><a href="./taskDetails/job20200219.html">Detail</a></td>
                    <td>Java Web</td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
            </table>
        </div>
    </div>

    <div class="bottom-wapper">
        <hr>
    </div>
</div>

<footer class="footer">
    <div class="sub-foot">
        <div style="text-align: center;">
            <span style="font-size: smaller; color: #525D76; ">
                <em>Copyright © 2020, Kevin KDA. AllRightsReserved.</em>
            </span>
        </div>
    </div>
</footer>
</body>
</html>
