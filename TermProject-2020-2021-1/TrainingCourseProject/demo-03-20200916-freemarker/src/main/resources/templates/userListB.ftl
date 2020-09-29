<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>user_id</td>
        <td>user_name</td>
        <td>user_pass</td>
        <td>reg_time</td>
    </tr>
    <#list list as item>
        <tr>
            <td>${item.user_id}</td>
            <td>${item.user_name}</td>
            <td>${item.user_pass}</td>
            <td>${item.reg_time}</td>
        </tr>
    </#list>
</table>
</body>
</html>