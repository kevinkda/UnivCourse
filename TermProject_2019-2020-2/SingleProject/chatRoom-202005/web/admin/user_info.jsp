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
            /*margin: 0;*/
            /*padding: 0;*/
        }

        #userInfo {
            /*margin-top: 1em;*/
            /*padding-left: 0.5em;*/
            /*padding-right: 0.5em;*/
            text-align: center;
            width: 100%;
        }

        body {
            background: #7ceefd;
        }
    </style>
    <script src="../js/jquery-1.12.4.js"></script>
</head>
<body>
<div class="container">
    <div id="userInfo">
        玩命加载中
    </div>
</div>
</body>
<script type="text/javascript">
    function work() {
        $.ajax({
            url: '/chatRoom/User/UserServlet',
            dataType: 'json',
            type: 'post',
            async: false,
            data: {
                num: 2
            },
            success: function (data) {
                let div = $("#userInfo");
                // 清空
                div.html();
                let info = "<table width='90%'>";
                for (let i = 0; i < data.length; i++) {
                    let str = data[i].sex == "0" ? "女" : "男";
                    if (str === "男") {
                        info += '<tr style="color: #84b9d9"><td align="left">' + data[i].nickName + '</td><td align="right">' + str + '</td></tr>'
                    } else {
                        info += '<tr style="color: #eeab8b"><td align="left">' + data[i].nickName + '</td><td align="right">' + str + '</td></tr>'
                    }
                }
                info += "</table>"
                div.html(info);
            }
        });
    }

    setInterval("work()", 1000);
</script>
</html>
