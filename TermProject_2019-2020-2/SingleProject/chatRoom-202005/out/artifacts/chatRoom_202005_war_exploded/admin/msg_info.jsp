<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/27
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        * {
            margin: 0;
            padding: 0;
        }

        body {
            background: linear-gradient(to right, #91c9e8, #47a0e5);
            color: white;
        }

        #msgInfo {
            margin-top: 0.8em;
            margin-left: 1.5em;
            width: 100%;
            height: auto;
        }

        p {
            margin-top: 1em;
        }
    </style>
    <script src="../js/jquery-1.12.4.js"></script>
</head>
<body>
<div class="container">
    <div id="msgInfo">
        玩命加载中
    </div>
</div>
</body>
<script type="text/javascript">
    function work() {
        let info = "";
        $.ajax({
            url: "/chatRoom/User/UserServlet",
            dataType: "json",
            type: "post",
            async: false,
            data: {
                num: 3
            },
            success: function (data) {
                let div = $("#msgInfo");
                div.html();
                if (data.length == 0) {
                    div.html("去聊天吧");
                } else {
                    div.html("");
                    for (let i = 0; i < data.length; i++) {
                        info += "<p>" + data[i] + "</p>";
                    }
                }
                div.html(info);
            }
        });
    }

    setInterval("work()", 1000);
</script>
</html>
