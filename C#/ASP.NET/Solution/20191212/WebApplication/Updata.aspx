<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Updata.aspx.cs" Inherits="WebApplication.Updata" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>更新信息</title>
</head>
<body>
    <form id="form1" runat="server" method="post">
        <input type="hidden" name ="IsPostBack" value="1"/>
    <div>
    <table>
            <tr>
                <td>用户</td>
                <td><input type="text" name="UserName" value="<%= entity.UserName %>" /></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="text" name="UserPass" value="<%= entity.UserPass %>" /></td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td><input type="text" name="UserEmail" value="<%= entity.Email %>" /></td>
            </tr>
            <tr>
                <td colspan="4"><input type="submit"value="修改用户" /></td>
            </tr>
        </table>
    </div>
    </form>
</body>
</html>
