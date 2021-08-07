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

        #msg {
            width: 100%;
            height: 70%;
            background-color: rgba(126, 225, 255, 0.68);
            border: none;
            border-bottom: white;
            padding-left: 1em;
        }

        #msg-btn {
            margin-top: 2em;
            margin-left: 5em;
        }

        body {
            background: rgba(126, 225, 255, 0.68);
        }
    </style>
    <script src="../js/jquery-1.12.4.js"></script>
</head>
<body>
<%--<div class="container">--%>
<div id="sendMsgInfo">
    <p><input type="text" id="msg" name="msg" maxlength="80"/></p>
    <p>
        <input type="submit" id="msg-btn" onclick="sendMsg();" value="发送"/>
        <span id="tag-error"></span>
    </p>
</div>
<%--</div>--%>
</body>
<script type="text/javascript">
    function sendMsg() {
        let info = $("#msg").val().trim();
        if (info == '') {
            $("#tag-error").html('输入的信息不允许为空');
        } else {
            $.ajax({
                url: '/chatRoom/User/UserServlet',
                type: 'post',
                dataType: 'json',
                async: false,
                data: {
                    num: 4,
                    msg: info
                },
                success: function (data) {
                    if (data == '1') {
                        $("#tag-error").html('发送成功');
                        document.getElementById("#tag-error").style.color = "green";
                        $("#msg").html('');
                    } else {
                        $("#tag-error").html('');
                        // document.getElementById("#tag-error").style.color = "red";
                        window.parent.location.href = "../login.jsp";
                    }
                }
            });
        }
    }
</script>
</html>
