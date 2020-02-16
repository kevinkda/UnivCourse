<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Add.aspx.cs" Inherits="WebApplication.Add" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <input type="hidden" value="dshkgj" name="hidd" />
        <div>
            <p>用户：<input type="text" name="UserName" /></p>
            <p>密码：<input type="password" name="UserPass" /></p>
            <p>邮箱：<input type="text" name="Email" /></p>
            <p><input type="submit" value="提交" /></p>
        </div>
    </form>
</body>
</html>
