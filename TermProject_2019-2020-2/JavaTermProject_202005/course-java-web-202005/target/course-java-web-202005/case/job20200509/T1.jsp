<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/8
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Reg</title>
    <link rel="stylesheet" href="../../css/job20200509/T1.css">
</head>
<body>
<div class="container">
    <div>
        <form action="T1-2.jsp" method="post">
            <table>
                <tr>
                    <td><label for="userAcc">用户名</label></td>
                    <td><input type="text" id="userAcc" name="userAcc" onblur="checkAcc();" required></td>
                    <td><span id="accTag">只能输入字母或数字，4-16个字符</span></td>
                </tr>
                <tr>
                    <td><label for="userPass">密码</label></td>
                    <td><input type="password" id="userPass" name="userPass" onblur="checkPass();" required></td>
                </tr>
                <tr>
                    <td><label for="userPassT">确认密码</label></td>
                    <td><input type="password" id="userPassT" name="userPassT" onblur="checkPass();" required></td>
                    <td><span id="passTag">密码长度6-12位</span></td>
                </tr>
                <tr>
                    <td>性别</td>
                    <td colspan="2">
                        <input type="radio" id="man" name="sex" value="1" checked="checked">
                        <label for="man">男</label>
                        <span style="margin-right: 20px;"></span>
                        <input type="radio" id="woman" name="sex" value="0">
                        <label for="woman">女</label>
                    </td>
                </tr>
                <tr>
                    <td><label for="email">电子邮件</label></td>
                    <td><input type="text" id="email" name="email" onblur="checkEmail();" required></td>
                    <td><span id="emailTag"></span></td>
                </tr>
                <tr>
                    <td>兴趣爱好</td>
                    <td colspan="2">
                        <span><input type="checkbox" id="che-gym" name="hobby" value="体育">
                            <label for="che-gym">体育</label></span>
                        <span><input type="checkbox" id="che-read" name="hobby" value="读书">
                            <label for="che-read">读书</label></span>
                        <span><input type="checkbox" id="che-music" name="hobby" value="音乐">
                            <label for="che-music">音乐</label></span>
                        <span><input type="checkbox" id="che-travel" name="hobby" value="旅游">
                            <label for="che-travel">旅游</label></span>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <label>
                            <textarea readonly="readonly" disabled="disabled" cols="50" rows="10">一、总则&#10;1.1 用户应当同意本协议的条取并按照页面上的提示完成全部的注程序。用户在进行注田程序过程中点击“同意“按田即表示用户与百度公司达成物议，完全接受本协议项下的全御条歌。&#10;2.2 用户注冊成功后，百度给予每个用户一个用户帐号及相应的密码，该用户帐号和密码由用户负责保管：用户应当对以其用户号进行的所有活动和事伴负法迎责任。
                            </textarea>
                        </label>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <input type="checkbox" id="terms-of-service" name="terms-of-service" required>
                        <label for="terms-of-service">同意服务条款</label>
                    </td>
                </tr>
            </table>
            <p><input type="submit" id="btn-sub" value="Submit" onsubmit="checkSubmit();"></p>
        </form>
    </div>
</div>
</body>
<script src="../../js/job20200509/T1.js"></script>
</html>
