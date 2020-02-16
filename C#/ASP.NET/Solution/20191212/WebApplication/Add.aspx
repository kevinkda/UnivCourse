<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Add.aspx.cs" Inherits="WebApplication.Add" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>添加用户</title>
</head>
<body>
    <form id="form1" runat="server">
        <input type="hidden" name="IsPostBack" value="hkhutyugrfuyjhfgyuf" />
        <div>
            <table border="1">
                <tr>
                    <td>用户名：</td>
                    <td>
                        <input type="text" value="" name="UserName" /></td>
                </tr>
                <tr>
                    <td>密码：</td>
                    <td>
                        <input type="password" value="" name="UserPass" /></td>
                </tr>
                <tr>
                    <td>邮箱：</td>
                    <td>
                        <input type="text" value="" name="Email" /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="提交"  /></td>
                </tr>
            </table>

        </div>
    </form>
</body>
</html>
