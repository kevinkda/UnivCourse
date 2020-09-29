<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
        <link rel="stylesheet" href="${basePath}/css/table.css">
<#--    <style>-->
<#--        table.hovertable {-->
<#--            font-family: verdana, arial, sans-serif;-->
<#--            font-size: 11px;-->
<#--            color: #333333;-->
<#--            border-width: 1px;-->
<#--            border-color: #999999;-->
<#--            border-collapse: collapse;-->
<#--        }-->

<#--        table.hovertable th {-->
<#--            background-color: #c3dde0;-->
<#--            border-width: 1px;-->
<#--            padding: 8px;-->
<#--            border-style: solid;-->
<#--            border-color: #a9c6c9;-->
<#--        }-->

<#--        table.hovertable tr {-->
<#--            background-color: #d4e3e5;-->
<#--        }-->

<#--        table.hovertable td {-->
<#--            border-width: 1px;-->
<#--            padding: 8px;-->
<#--            border-style: solid;-->
<#--            border-color: #a9c6c9;-->
<#--        }-->
<#--    </style>-->
</head>
<body>
<div class="container">
    <#--    <div id="table-wrapper">-->
    <#--        <table>-->
    <#--            <tr>-->
    <#--                <td>ID</td>-->
    <#--                <td>UserID</td>-->
    <#--                <td>ApiType</td>-->
    <#--                <td>CallParameters</td>-->
    <#--                <td>REGION_ID</td>-->
    <#--                <td>INSTANCE_ID</td>-->
    <#--                <td>ApiReturn</td>-->
    <#--                <td>Date</td>-->
    <#--            </tr>-->
    <#--            <#list list as item>-->
    <#--                <tr>-->
    <#--                    <td>${item.ID}</td>-->
    <#--                    <td>${item.UserID!'empty'}</td>-->
    <#--                    <td>${item.ApiType!'empty'}</td>-->
    <#--                    <td>${item.CallParameters!'empty'}</td>-->
    <#--                    <td>${item.REGION_ID!'empty'}</td>-->
    <#--                    <td>${item.INSTANCE_ID!'empty'}</td>-->
    <#--                    <td>${item.ApiReturn!'empty'}</td>-->
    <#--                    <td>${item.Date!'empty'}</td>-->
    <#--                </tr>-->
    <#--            </#list>-->
    <#--        </table>-->
    <#--    </div>-->
    <div id="table-wrapper">
        <table class="hovertable">
            <tr>
                <td>ID</td>
                <td>UserID</td>
                <td>ApiType</td>
                <td>CallParameters</td>
                <td>REGION_ID</td>
                <td>INSTANCE_ID</td>
                <td>ApiReturn</td>
                <td>Date</td>
            </tr>
            <#list list as item>
                <tr onmouseover="this.style.backgroundColor='#ffff66';"
                    onmouseout="this.style.backgroundColor='#d4e3e5';">
                    <td>${item.ID}</td>
                    <td>${item.UserID!'empty'}</td>
                    <td>${item.ApiType!'empty'}</td>
                    <td>${item.CallParameters!'empty'}</td>
                    <td>${item.REGION_ID!'empty'}</td>
                    <td>${item.INSTANCE_ID!'empty'}</td>
                    <td>${item.ApiReturn!'empty'}</td>
                    <td>${item.Date!'empty'}</td>
                </tr>
            </#list>
        </table>
    </div>
</div>
</body>
</html>