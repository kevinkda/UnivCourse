<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/9
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>T2-login</title>
</head>
<body>
<div class="container">
    <div class="core-wrapper">
        <form action="T2-sign.jsp" method="post" onsubmit="checkUserAcc()">
            <p>
                <label for="userAcc">账号：</label>
                <input type="text" name="userAcc" id="userAcc" required>
            </p>
            <p>
                <input type="submit" value="Reg">
            </p>
        </form>
    </div>
</div>
</body>
<script>
    function checkUserAcc() {
        let userAcc = document.getElementById("#userAcc").value;
        document.getElementById("#userAcc").value = userAcc.trim();
    }
</script>
</html>
