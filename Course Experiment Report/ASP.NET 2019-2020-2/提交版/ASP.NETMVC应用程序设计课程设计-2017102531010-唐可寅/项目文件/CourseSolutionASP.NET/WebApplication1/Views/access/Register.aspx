<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Register.aspx.cs" Inherits="WebApplication1.Views.access.Register" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
    <style>
        .container {
            text-align: center;
            width: 1200px;
            margin: 0 auto;
        }

        h2 {
            color: #00ffff;
        }
    </style>
</head>
<body>
    <div class="container">
        <section id="content">
            <form method="post" action="AccessConntroller">
                <h2>注册中心</h2>
                <div>
                    账号：<input type="text" required="" id="regAccount" name="regAccount" />
                </div>
                <div>
                    密码：<input type="password" required="" id="regPwd" name="regPwd" />
                </div>
                <div class="">
                    <span class="help-block u-errormessage" id="js-server-helpinfo">&nbsp;</span>
                </div>
                <div>
                    <!-- <input type="submit" value="Log in" /> -->
                    <input type="submit" value="注册" class="btn btn-primary" id="js-btn-login" />
                    <a href="Login.aspx">登录</a>
                    <!-- <a href="#">Register</a> -->
                </div>
            </form>
            <%=ViewData["errRegInfo"] %>
            <!-- form -->
            <!-- button -->
        </section>
        <!-- content -->
    </div>
</body>
</html>
