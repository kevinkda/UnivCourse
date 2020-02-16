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
  Date: 2019/12/12
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <script type="text/javascript">
        var xmlhttp;

        function valiloginID() {
            var loginID = document.getElementById("loginID").value;
            var url = "valilogin?loginID=" + loginID;
            //创建XMLhttp对象
            if (window.XMLHttpRequest) {
                xmlhttp = new XMLHttpRequest();
            } else if (window.ActiveXObject) {
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
            }
            //绑定回传事件
            xmlhttp.onreadystatechange = readData;
            //访问
            xmlhttp.open("get", url, true);
            xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
            xmlhttp.send(null);

        }

        //回调事件（用于接收数据）
        function readData() {
            var span = document.getElementById("err");
            if (xmlhttp.readyState == 4) {
                if (xmlhttp.status == 200) {
                    span.innerHTML = xmlhttp.responseText;
                } else {
                    alert("请求处理返回的数据有错误");
                }
            }
        }
    </script>
</head>
<body>
<form action="" method="post">
    <label>账号：</label>
    <input type="text" id="loginID" name="loginID" onblur="valiloginID()"/>
    <span id="err"></span>
    <br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
