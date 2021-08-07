<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <#--    <link rel="stylesheet" href="/css/table.css">-->
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
            <td>姓名</td>
            <td>生日</td>
            <td>性别</td>
            <td>职业</td>
            <td>住所</td>
            <td>电话</td>
            <td>操作</td>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.Profile_ID}</td>
                <td>${item.Profile_Name}</td>
                <td>${item.Profile_Birthday}</td>
                <td>${item.Profile_Gender}</td>
                <td>${item.Profile_Career}</td>
                <td>${item.Profile_Address}</td>
                <td>${item.Profile_Mobile}</td>
                <td>
                    <span><a href="/exam-09/user?id=${item.Profile_ID}">详细</a></span>
                    <span style="margin-left: 2em;"></span>
                    <span><a href="/exam-09/update-before?id=${item.Profile_ID}">修改</a></span>
                </td>
            </tr>

        </#list>
    </table>
</div>
</body>
</html>