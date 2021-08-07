<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/14
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        .span-label {
            margin-right: 2em;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="core">
        <form action="T1-show.jsp" method="post">
            <p>
                <label for="userAcc">UserAcc:</label>
                <input type="text" id="userAcc" name="userAcc" value="admin">
            </p>
            <p>
                <label for="userPass">UserPass:</label>
                <input type="password" id="userPass" name="userPass" value="admin">
            </p>
            <p>
                <span class="span-label">Sex</span>
                <label for="man">Man</label><input type="radio" id="man" name="sex" value="男" checked>
                <label for="woman">Woman</label><input type="radio" id="woman" name="sex" value="女">
            </p>
            <p>
                <span class="span-label">Hobby</span>
                <input type="checkbox" id="che-gym" name="hobby" value="体育"><label for="che-gym">体育</label>
                <input type="checkbox" id="che-read" name="hobby" value="读书"><label for="che-read">读书</label>
                <input type="checkbox" id="che-music" name="hobby" value="音乐"><label for="che-music">音乐</label>
                <input type="checkbox" id="che-travel" name="hobby" value="旅游"><label for="che-travel">旅游</label>
            </p>
            <p>
                <span class="span-label">
                    <label for="country">Country</label>
                </span>
                <select id="country" name="userCountry">
                    <option>China</option>
                </select>
            </p>
            <p>
                <label for="introduce">自我介绍</label>
            <p>
                <textarea name="introduce" id="introduce" cols="30" rows="10">这是一个自我介绍</textarea></p>
            </p>
            <p><input type="submit" value="Submit"></p>
        </form>
    </div>
</div>
</body>
</html>
