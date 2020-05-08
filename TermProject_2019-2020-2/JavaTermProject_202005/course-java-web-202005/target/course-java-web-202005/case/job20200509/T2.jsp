<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/8
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="../../css/job20200509/T1.css">
</head>
<body>
<div class="container">
    <div class="table-wrapper">
        <form action="T2-2-sign.jsp" method="get">
            <table>
                <tr>
                    <td><label for="userAcc">用户名</label></td>
                    <td><input type="text" id="userAcc" name="userAcc" onblur="checkAcc();" required></td>
                </tr>
                <tr>
                    <td><label for="userPass">密码</label></td>
                    <td><input type="password" id="userPass" name="userPass" onblur="checkPass();" required></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Submit">
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
<script src="../../js/job20200509/T1.js"></script>
</html>
