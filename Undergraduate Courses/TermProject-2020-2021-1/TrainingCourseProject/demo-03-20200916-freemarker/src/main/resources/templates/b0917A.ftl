<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="main" align="center">
        <p><input type="button" value="添加" onclick="add();"/></p>
        <div id="all" action="index">

        </div>
        <p><input type="submit" value="提交"></p>
    </div>
</div>
</body>
<script>
    function add() {
        let all = document.getElementById("all");
        //创建p标签
        let p = document.createElement("p");
        //创建输入框
        let input = document.createElement("input");
        //给输入框设置属性
        input.setAttribute("type", "text");
        input.setAttribute("name", "score");

        let btn = document.createElement("input");
        btn.setAttribute("type", "button");
        btn.setAttribute("value", "删除");
        btn.onclick = function () {
            all.removeChild(p)
        }
        p.appendChild(input)
        p.appendChild(btn);
        all.appendChild(p)

        p.appendChild(input);
        document.getElementById("all").appendChild(p)
    }
</script>
</html>