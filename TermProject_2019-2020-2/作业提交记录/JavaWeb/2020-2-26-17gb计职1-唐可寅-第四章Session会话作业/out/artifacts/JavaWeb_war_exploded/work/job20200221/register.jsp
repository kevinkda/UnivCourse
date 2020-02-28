<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/2/20
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="../../css/index.css">
    <script>
        function checkAccount() {

        }

        function isClicked() {
            var checkAgree1 = document.getElementById("checkAgree1");
            var checkAgree2 = document.getElementById("checkAgree2");
            var sub = document.getElementById("submit");
            if ((checkAgree1.checked === true) && (checkAgree2.checked === true)) {
                sub.disabled = "";
            } else {
                sub.disabled = "disabled";
            }
        }
    </script>
</head>
<body>
<div class="container">
    <div class="top-wapper">
        <h1 id="top-word">job20200221</h1>
        <h6>This is a registration page from Kevin</h6>
    </div>

    <div class="core-wapper">
        <div class="word-wapper">
            <form action="${pageContext.request.contextPath}/RegisterServlet" method="post">
                <p>
                    <span>User Account Name</span>
                    <input type="text" name="account" onblur="checkAccount()" required>
                </p>
                <p>
                    <span>User Account Password</span>
                    <input type="text" name="password" onblur="checkAccount()" required>
                </p>
                <!--                <p>-->
                <!--                    <span>Confirm Password</span>-->
                <!--                    <input type="text" name="password2" required>-->
                <!--                </p>-->
                <br>

                <select>
                    <option>请选择</option>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                </select>

                <p>
                    <input type="checkbox" id="checkSub" value="1">
                    <!--                    订阅来自本系统的更新、广告等-->
                    <span>Subscribe to updates, advertisements, etc. from the system</span>
                </p><br>

                <p>
                    <input type="checkbox" id="checkAgree1" onclick="isClicked()">
                    <!--                    本系统使用协议-->
                    <span>Agree</span><a href="#">System use agreement</a>
                </p>
                <p>
                    <input type="checkbox" id="checkAgree2" onclick="isClicked()">
                    <!--                    网络服务协议-->
                    <span>Agree</span><a href="#">Network service agreement</a>
                </p>
                <p><input type="submit" id="submit" value="Submit" disabled="disabled"></p>
            </form>
        </div>
    </div>

    <div class="bottom-wapper">
        <hr>
        <p class="complete">Completion Date: February 20, 2020</p>
    </div>
</div>
</body>
<script src="../../js/Copyright.js"></script>
</html>
