<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
${score[0]}
<table>

    <tr>
        <td>Check</td>
        <td>SN</td>
        <td>user_id</td>
        <td>user_name</td>
        <td>user_score</td>
    </tr>
    <#--    <#list list as item>-->
    <#--        <tr>-->
    <#--            <td>${item_index+1}</td>-->
    <#--            <td>${item.userName?cap_first}</td><!--首字母大写&ndash;&gt;-->
    <#--            <td>${item.userName?uncap_first}</td><!--首字母小写&ndash;&gt;-->
    <#--&lt;#&ndash;            <td>${item.userName!'empty'}</td>&ndash;&gt;-->
    <#--            <td>${item.userName?default('empty')}</td> <!--空值转换&ndash;&gt;-->
    <#--            <td>-->
    <#--        <#if null='${item.userName}'>-->
    <#--                    ${item.userName?default('empty')}-->
    <#--            <#else>-->
    <#--                ${item.userName?cap_first}-->
    <#--        </#if>-->
    <#--            </td>-->
    <#--        </tr>-->
    <#--    </#list>-->
    <#list list as item>
        <tr>
            <#if item.userscore gt 90  >
                <td bgcolor="blue">${item_index+1}</td>
                <td bgcolor="blue">${item_index+1}</td>
                <td bgcolor="blue">${item.userid}</td>
                <td bgcolor="blue">${item.userName}</td>
                <td bgcolor="blue">${item.userscore}</td>
            <#elseif item.userscore gt 60 >
                <td bgcolor="yellow">${item_index+1}</td>
                <td bgcolor="yellow">${item.userid}</td>
                <td bgcolor="yellow">${item.userName}</td>
                <td bgcolor="yellow">${item.userscore}</td>
            <#else >
                <td bgcolor="red">${item_index+1}</td>
                <td bgcolor="red">${item.userid}</td>
                <td bgcolor="red">${item.userName}</td>
                <td bgcolor="red">${item.userscore}</td>
            </#if>
        </tr>
    </#list>
</table>
<br>

</body>
<script>
    function choose() {
        let box = document.getElementsByName("ibs");
        if (box[0].checked) {
            for (let i = 0; i < box.length; i++) {
                box[i].checked = true;
            }
        } else {
            for (let i = 0; i < box.length; i++) {
                box[i].checked = false;
            }
        }
    }
</script>
</html>