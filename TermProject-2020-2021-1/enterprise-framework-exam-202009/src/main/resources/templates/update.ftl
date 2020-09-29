<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        table.hovertable {
            font-family: verdana, arial, sans-serif;
            font-size: 11px;
            color: #333333;
            border-width: 1px;
            /*border-color: #999999;*/
            border-color: red;
            border-collapse: collapse;
        }

        table.hovertable th {
            background-color: #c3dde0;
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #a9c6c9;
        }

        table.hovertable tr {
            background-color: #d4e3e5;
        }

        table.hovertable td {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #a9c6c9;
        }

    </style>
</head>
<body>
<div class="container">
    <form action="/exam-09/update" method="post">
        <table class="hovertable">
            <tr>
                <td><label for="Profile_ID">编号</label></td>
                <td><input type="text" id="Profile_ID" name="Profile_ID" value="${user.Profile_ID}"></td>
            </tr>
            <tr>
                <td><label for="Profile_Name">姓名</label></td>
                <td><input type="text" id="Profile_Name" name="Profile_Name" value="${user.Profile_Name}"></td>
            </tr>
            <tr>
                <td><label for="Profile_Birthday">生日</label></td>
                <td><input type="text" id="Profile_Birthday" name="Profile_Birthday" value="${user.Profile_Birthday}">
                </td>
            </tr>
            <tr>
                <td><label for="Profile_Gender">性别</label></td>
                <td><input type="text" id="Profile_Gender" name="Profile_Gender" value="${user.Profile_Gender}"></td>
            </tr>
            <tr>
                <td><label for="Profile_Career">职业</label></td>
                <td><input type="text" id="Profile_Career" name="Profile_Career" value="${user.Profile_Career}"></td>
            </tr>
            <tr>
                <td><label for="Profile_Address">住所</label></td>
                <td><input type="text" id="Profile_Address" name="Profile_Address" value="${user.Profile_Address}"></td>
            </tr>
            <tr>
                <td><label for="Profile_Mobile">电话</label></td>
                <td><input type="text" id="Profile_Mobile" name="Profile_Mobile" value="${user.Profile_Mobile}"></td>
            </tr>
        </table>
        <p>
            <span><input type="submit" value="提交"></span>
            <span style="margin-left: 2em;"></span>
            <span><a href="/exam-09/userlist">返回</a></span>
        </p>
    </form>
</div>
</body>
</html>