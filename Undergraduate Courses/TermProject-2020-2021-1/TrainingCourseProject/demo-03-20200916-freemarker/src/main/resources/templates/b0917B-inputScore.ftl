<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script>
        function add() {
            let all = document.getElementById("all");
            let p = document.createElement("p");
            let input = document.createElement("input");
            input.setAttribute("type", "text");
            input.setAttribute("name", "score");

            let btn = document.createElement("input");
            btn.setAttribute("type", "button");
            btn.setAttribute("value", "删除");
            btn.onclick = function () {
                all.removeChild(p);
            }
            p.appendChild(input);
            p.appendChild(btn);
            all.appendChild(p);
        }
    </script>
</head>
<body>

<p><input type="button" value="add" onclick="add();"/></p>
<form action="index" method="post">
    <div id="all">

    </div>
    <p>
        <input type="submit" value="提交">
    </p>
</form>
</body>
</html>