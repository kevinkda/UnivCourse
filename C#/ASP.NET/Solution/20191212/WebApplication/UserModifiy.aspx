<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="UserModifiy.aspx.cs" Inherits="WebApplication.UserModifiy" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="css/tableStyle.css" rel="stylesheet" />
    <title>修改用户数据</title>
</head>
<body>
    <form action="ModifiyPush.ashx" id="ModifiyPush" runat="server" method="post">
        <%--<input type="hidden" name="IsPostBack" value="hkhutyugrfuyjhfgyuf" />--%>
        <div>
            <%--<p>编号：<%=userModifiy.UserID %></p>
            <p>
                用户：
            <input type="text" name="userName" value="<%=userModifiy.UserName.Trim() %>" />
            </p>
            <p>
                密码：
            <input type="text" name="userPass" value="<%=userModifiy.UserPass.Trim() %>" />
            </p>
            <p>
                邮箱：
            <input type="text" name="userEmail" value="<%=userModifiy.Email.Trim() %>" />
            </p>
            <p><input type="hidden" value="<%=userModifiy.UserID %>" name="id" />
                <input type="submit" value="修改" />
            </p>--%>


            <table>
                <tr>
                    <th>编号</th>
                    <th><%=userModifiy.UserID %></th>
                </tr>
                <tr>
                    <td>用户</td>
                    <td>
                        <input type="text" name="userName" value="<%=userModifiy.UserName.Trim() %>" /></td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td>
                        <input type="text" name="userPass" value="<%=userModifiy.UserPass.Trim() %>" /></td>
                </tr>
                <tr>
                    <td>邮箱</td>
                    <td>
                        <input type="text" name="userEmail" value="<%=userModifiy.Email.Trim() %>" /></td>
                </tr>
            </table>
            <p>
                <input type="hidden" value="<%=userModifiy.UserID %>" name="id" />
                <input type="submit" value="修改" />
                <a href="WebForm.aspx">返回</a>
            </p>
        </div>
    </form>
</body>
</html>
