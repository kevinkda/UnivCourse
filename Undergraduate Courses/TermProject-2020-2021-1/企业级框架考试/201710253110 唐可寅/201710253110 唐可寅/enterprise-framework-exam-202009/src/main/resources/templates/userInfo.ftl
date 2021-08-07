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
    <table class="hovertable">
        <tr>
            <td>编号</td>
            <td>${user.Profile_ID}</td>
        </tr>
        <tr>
            <td>姓名</td>
            <td>${user.Profile_Name}</td>
        </tr>
        <tr>
            <td>生日</td>
            <td>${user.Profile_Birthday}</td>
        </tr>
        <tr>
            <td>性别</td>
            <td>${user.Profile_Gender}</td>
        </tr>
        <tr>
            <td>职业</td>
            <td>${user.Profile_Career}</td>
        </tr>
        <tr>
            <td>住所</td>
            <td>${user.Profile_Address}</td>
        </tr>
        <tr>
            <td>电话</td>
            <td>${user.Profile_Mobile}</td>
        </tr>
    </table>
    <p>
        <span><a href="/exam-09/userlist">返回</a></span>
        <span style="margin-left: 2em;"></span>
        <span><a href="/exam-09/update-before?id=${user.Profile_ID}">修改</a></span>
    </p>
</div>
</body>
</html>