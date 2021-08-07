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
<#--   }
}-->

//全选/非全选
function choose(){
    var box=document.getElementsByName("ids");
    if(box[0].checked){//如果第一个多选框层现选中状态
        for(var i=0;i<box.length;i++){
            box[i].checked=true;
        }
        document.getElementById("btn").disabled="";
    }else{
        for(var i=0;i<box.length;i++){//如果没有第一个checkbox选中
            box[i].checked=false;
        }
        document.getElementById("btn").disabled="disabled";
    }
}
//监听每一条数据的第一个checkbox
function choose1(){
    var box=document.getElementsByName("ids");
    var result=false;
    for(var i=1;i<box.length;i++){
        if(box[i].checked==false){//只要有一条数据没有选中那么一定不是全选的状态
            result=true;
            break;
        }
    }
    //如果result为true那么肯定不是所有的数据都是空的
    if(result){
        box[0].checked=false;
    }else{
        box[0].checked=true;
    }

    //接下来开始判断删除按钮是否需要开启了
    var temp=false;
    for(var i=1;i<box.length;i++){
        if(box[i].checked){
            temp=true;
            break;
        }
    }
    if(temp){
        document.getElementById("btn").disabled="";
    }else{
        document.getElementById("btn").disabled="disabled";
    }
}

//删除的方法
function del(){
    //有取得所有的id的值
    var box=document.getElementsByName("ids");
    var ids="";//容器用来装id的
    for(var i=1;i<box.length;i++){
        if(box[i].checked){
               ids+=box[i].value+",";
        }
    }
    //询问框，问用户是否需要删除的操作!
   if(confirm('你确定需要删除id是'+ids+'的数据吗?')){
        //alert('执行删除');
       location.href='del?ids='+ids;
   }else{
       alert('您取消了删除的操作!');
   }

}

function pageData(pageIndex){
document.getElementById("pageIndex").value=pageIndex;
document.getElementById("pageSize").value=2;
document.getElementById("form1").submit();

}
    </script>
</head>
<!--
<body onload="loadData();">
-->
<body>
<p>
<form action="index" method="get" id="form1">
    <input type="hidden" name="pageIndex" id="pageIndex" value="${pageIndex}">
    <input type="hidden" name="pageSize" id="pageSize" value="${pageSize}">
userName:<input type="text" name="userName" value="${userName}">
    userScore:<input type="text" name="userScore" value="${userScore}">
    <input type="submit" value="提交"/>
</form>

photo:<img src="car.jpg">

</p>
<table>



    <#if list?? && (list?size > 0) >
    <tr><td><input type="checkbox"  name="ids" onclick="choose();">全选/非全选</td><td>序号</td><td>user_id</td><td>user_name</td><td>user_score</td><td>操作</td></tr>
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

       <!-- <tr style="background-color:<#if item.userScore gt 90>red<#elseif item.userScore gt 80>yellow<#else>blue</#if>"><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName}</td><td>${item.userScore}</td></tr>-->



        <tr><td><input type="checkbox" name="ids" onclick="choose1();" value="${item.userId}"></td><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName}<td>${item.userScore}</td><td><a href="selectUserById?userId=${item.userId}">编辑</a></td></tr>
    </#list>
    <tr><td><input type="button" value="删除" id="btn" disabled="disabled" onclick="del();"></td></tr>
    <#else>
    暂无数据
    </#if>
    <tr><td><a href="addUser">增加</a>
            <#if pageIndex!=null>
            当前页:${pageIndex}每页最大条数:${pageSize}总的页数:${totalPage}总的数量:${totalCount}
            </#if>
        </td></tr>
    <#if pageIndex!=null>
    <tr>

        <#if pageIndex!=1>
        <td>
            <a href="javascript:pageData(${pageIndex-1});">上一页</a>
        </td>
        </#if>
        <#if pageIndex!=totalPage>
        <td>
            <a href="javascript:pageData(${pageIndex+1});">下一页</a>
        </td>
        </#if>
        </#if>
    </tr>
</table>


</body>
</html>