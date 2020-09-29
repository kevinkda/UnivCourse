<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script>

<#--function loadData(){-->
<#--    var size=${list?size};-->
<#--   for(var i=0;i<size;i++){-->
<#--       var score=parseInt(document.getElementById("sc"+i).innerHTML);-->
<#--       if(score>=90){-->
<#--           document.getElementById("tr"+i).style.backgroundColor="green";-->
<#--       }else if(score>=80){-->
<#--           document.getElementById("tr"+i).style.backgroundColor="yellow";-->
<#--       }else{-->
<#--           document.getElementById("tr"+i).style.backgroundColor="red";-->
<#--       }-->
<#--   }-->
}
    </script>
</head>
<!--
<body onload="loadData();">
-->
<body>
<table>

    <tr><td>序号</td><td>user_id</td><td>user_name</td><td>user_score</td></tr>
    <#list list as item>
        <!--判断这个值是否为空，如果为空那么显示默认的值-->
        <!--<tr><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName!'empty'}</td></tr>-->
        <!--<tr><td>${item_index+1}</td><td>${item.userId}</td><td> ${item.userName?default("empty")}</td></tr>-->
       <!-- <tr><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName?default("empty")?cap_first}</td></tr>-->


        <!--
			<#if null == '${item.userName}'>
                <tr><td>${item_index+1}</td><td>${item.userId}</td><td>empty</td></tr>
            <#else>
               <tr><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName?cap_first}</td></tr>
            </#if>
            -->

<!--
             <#if item.userScore gt 90>
    <tr style="background-color: green"><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName}</td><td>${item.userScore}</td></tr>
        <#elseif item.userScore gt 80>
            <tr style="background-color: yellow"><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName}</td><td>${item.userScore}</td></tr>
        <#else>
            <tr style="background-color: red"><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName}</td><td>${item.userScore}</td></tr>
        </#if>
        -->

        <!--
        <tr id="tr${item_index}"><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName}</td><td id="sc${item_index}">${item.userScore}</td></tr>
-->

        <tr style="background-color:<#if item.userScore gt 90>red<#elseif item.userScore gt 80>yellow<#else>blue</#if>"><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName}</td><td>${item.userScore}</td></tr>

    </#list>
</table>

</body>
</html>