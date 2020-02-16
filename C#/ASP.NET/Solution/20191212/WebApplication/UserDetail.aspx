<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="UserDetail.aspx.cs" Inherits="WebApplication.UserDetail" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="css/tableStyle.css" rel="stylesheet" />
    <title>用户信息</title>
</head>
<body>
    <form id="form1" runat="server" method="post">
        <div>
            <table>
                <tr>
                    <th>编号</th>
                    <th><%=entity.UserID %></th>
                </tr>
                <tr>
                    <td>用户名</td>
                    <td><%=entity.UserName %></td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td><%=entity.UserPass %></td>
                </tr>
                <%--<tr>
                    <td>时间</td>
                    <td><%=entity.Regtime %></td>
                </tr>--%>
                <tr>
                    <td>邮箱</td>
                    <td><%=entity.Email %></td>
                </tr>
            </table>
            <p>
                <a href="WebForm.aspx">返回</a>
            </p>
        </div>
    </form>
</body>
</html>
