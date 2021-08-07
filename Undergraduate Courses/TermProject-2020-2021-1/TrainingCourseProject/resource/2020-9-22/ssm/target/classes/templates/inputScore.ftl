<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>输入页面</title>
    <script>
function add(){
    var all=document.getElementById("all");
    //创建p标签元素
   var p=document.createElement("p");
   //创建输入框元素
   var input=document.createElement("input");
   //给输入框元素设置属性
   input.setAttribute("type","text");
   input.setAttribute("name","score");

   var btn=document.createElement("input");
   btn.setAttribute("type","button");
   btn.setAttribute("value","删除");
   btn.onclick=function(){
    all.removeChild(p);
   }
   p.appendChild(input);
   p.appendChild(btn);
   all.appendChild(p);

}
    </script>
</head>
<body>

<p><input type="button" value="add" onclick="add();"></p>
<form action="index" method="get">
<div id="all">

</div>
    <p><input type="submit" value="提交"></p>
</form>

</body>
</html>