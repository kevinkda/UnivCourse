<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/27
  Time: 17:31
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
            background: linear-gradient(to top right, #5df5d5, #9ff8b8, #c8f3b1, #f4ffbb);
        }

        .container {
            margin: 0 auto;
            text-align: center;
        }

        h2 {
            margin-top: 5em;
        }

        p {
            margin-top: 1.5em;
        }

        span {
            margin-left: 1em;
            margin-right: 1em;
        }

        #form-login {
            margin-top: 2em;
            text-align: center;
            color: #4F4F4F;
        }

        #serviceTag {
            color: red;
        }
    </style>
    <script src="js/jquery-1.12.4.js"></script>
</head>
<body>
<div class="container">
    <h2>登录</h2>
    <form action="${pageContext.request.contextPath}/User/UserServlet" method="post" id="form-login"
          onsubmit="return checkData();">
        <input type="hidden" name="num" value="1"/>
        <p>
            <span><label for="nickName">昵称</label></span>
            <input type="text" name="nickName" id="nickName" onblur="checkNickName();"/>
            <span id="nickName1">请输入昵称..</span>
        </p>
        <p>
            <span>性别</span>
            <input type="radio" id="man" name="sex" value="1" checked="checked"/><label for="man">男</label>
            <input type="radio" id="woman" name="sex" value="0"/><label for="woman">女</label>
        </p>
        <p><input type="submit" value="Submit"/></p>
        <p id="serviceTag">${sessionScope.msg}</p>
    </form>
</div>
</body>
<script type="text/javascript">
    // 不允许注册登录
    let result = false;

    function checkNickName() {
        // 获得值
        let nickName = $("#nickName").val().trim();
        if (nickName == "") {
            $("#nickName1").html("昵称不允许为空");
        } else {
            $.ajax({
                // url: "/chatRoom/User/UserServlet",
                url: "${pageContext.request.contextPath}/User/UserServlet",
                dataType: "text",
                type: "post",
                async: false,
                data: {
                    nickName: nickName,
                    num: 0
                },
                success: function (data) {
                    if (data == '0') {
                        //alert('有重复的');
                        $("#nickName1").html('昵称重复');
                        $("#nickName1").css("color", "red");
                    } else {
                        $("#nickName1").html('√');
                        $("#nickName1").css("color", "green");
                        result = true;
                    }
                }

            })
        }
        return result;
    }

    //检查昵称是否合适
    function checkData() {
        if (checkNickName()) {
            return true;
        } else {
            return false;
        }
    }
</script>
</html>
