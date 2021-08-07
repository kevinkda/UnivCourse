<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/2/21
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>job20200223</title>
    <link rel="stylesheet" href="../../css/index.css">
    <script>
        function x() {
            var spanQQ = document.getElementById("spanQQ");
            if (true) {
                // spanQQ.disabled = "";
                // document.getElementById("btn").disabled = '';
            } else {
                // spanQQ.disabled = "disabled";
                // document.getElementById("btn").disabled = 'disabled';
            }
        }

        function replaceSpace(obj) {
            obj.value = obj.value.replace(/\s/gi, '')
        }

        function chkNumber(eleText) {
            var value = eleText.value;
            var len = value.length;
            for (var i = 0; i < len; i++) {
                if (value.charAt(i) > "9" || value.charAt(i) < "0") {
                    // alert("含有非数字字符");
                    document.getElementById("spanQQ").innerHTML = 'QQ只包含数字';
                    document.getElementById("spanQQ").style.color = 'red';
                    document.getElementById("sub").disabled = 'disabled';
                    eleText.focus();
                    break;
                } else {
                    document.getElementById("spanQQ").innerHTML = 'QQ输入正确';
                    document.getElementById("spanQQ").style.color = 'green';
                    document.getElementById("sub").disabled = '';
                }
            }
        }
    </script>
</head>
<body>
<div class="container">
    <div class="top-wapper">
        <h1 id="top-word">job20200223</h1>
        <h4>This is a registration page from Kevin</h4>
    </div>

    <div class="core-wapper">
        <div class="word-wapper">
            <form action="${pageContext.request.contextPath}/Reg0221Work1Servlet" method="post">
                <p><label>User Name
                    <input type="text" name="userAcc" onblur="replaceSpace(this);" value="admin1" required></label></p>
                <p><label>User Password
                    <input type="text" name="userPass" onblur="replaceSpace(this);" value="admin1" required></label>
                </p>
                <p>
                    <label>QQ <input type="text" name="userQQ" onblur="chkNumber(this);replaceSpace(this);"
                                     value="12345" required></label>
                    <span id="spanQQ">QQ只包含数字</span>
                </p>
                <p><input type="submit" id="sub" value="Submit"></p>
            </form>

        </div>
    </div>

    <div class="bottom-wapper">
        <hr>
        <p class="complete">Completion Date: February 21, 2020</p>
    </div>
</div>
</body>
<script src="../../js/Copyright.js"></script>
</html>
