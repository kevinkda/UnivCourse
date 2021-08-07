<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table>
    <tr><td>序号</td><td>user_id</td><td>user_name</td></tr>
    <#list list as item>
        <tr><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName}</td></tr>
    </#list>
</table>

</body>
</html>