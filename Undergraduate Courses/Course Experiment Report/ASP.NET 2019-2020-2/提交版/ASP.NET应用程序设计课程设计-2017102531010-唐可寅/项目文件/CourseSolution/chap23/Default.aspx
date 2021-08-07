<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>无标题页</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
    </div>
    <asp:LinkButton ID="LinkButton1" runat="server">退出</asp:LinkButton>
    <asp:DataList ID="DataList1" runat="server" 
        oncancelcommand="DataList1_CancelCommand" 
        ondeletecommand="DataList1_DeleteCommand" oneditcommand="DataList1_EditCommand" 
        onitemcommand="DataList1_ItemCommand" onupdatecommand="DataList1_UpdateCommand">
      
        <EditItemTemplate>
             <table style="width: 297px; height: 59px; font-size: 9pt;">
                                <tr>
                                    <td style="width: 75px; height: 19px;">
                                        用户名：</td>
                                    <td style="width: 131px; height: 19px;">
                                        <asp:Label ID="lblUserName" runat="server" Text='<%# DataBinder.Eval(Container.DataItem,"UserName") %>'></asp:Label></td>
                                    <td style="width: 95px; height: 19px;">
                                    </td>
                                </tr>
                                <tr>
                                    <td style="width: 75px">
                                        旧密码：</td>
                                    <td style="width: 131px">
                                        <asp:TextBox ID="txtOldpwd" runat="server" TextMode="Password" Width="98px"></asp:TextBox>
                                        <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="txtOldpwd"
                                            ErrorMessage="*"></asp:RequiredFieldValidator></td>
                                    <td style="width: 95px">
                                    </td>
                                </tr>
                                <tr>
                                    <td style="width: 75px">
                                        新密码：</td>
                                    <td style="width: 131px">
                                        <asp:TextBox ID="txtNewpwd" runat="server" TextMode="Password" Width="98px"></asp:TextBox>
                                        <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" ControlToValidate="txtNewpwd"
                                            ErrorMessage="*"></asp:RequiredFieldValidator></td>
                                    <td style="width: 95px">
                                        </td>
                                </tr>
                                <tr>
                                    <td style="width: 75px">
                                        确认密码：</td>
                                    <td style="width: 131px">
                                        <asp:TextBox ID="txtRepwd" runat="server" TextMode="Password" Width="98px"></asp:TextBox>
                                        <asp:RequiredFieldValidator ID="RequiredFieldValidator3" runat="server" ControlToValidate="txtRepwd"
                                            ErrorMessage="*"></asp:RequiredFieldValidator></td>
                                    <td style="width: 95px">
                                        <asp:CompareValidator ID="CompareValidator1" runat="server" ControlToCompare="txtNewpwd"
                                            ControlToValidate="txtRepwd" ErrorMessage="与密码不符！" Width="73px"></asp:CompareValidator></td>
                                </tr>
                                <tr>
                                    <td style="width: 75px">
                                    </td>
                                    <td style="width: 131px">
                                        <asp:Button ID="btnUpdate" runat="server" CommandName="update" CommandArgument = '<%#DataBinder.Eval(Container.DataItem,"PassWord")%>' Text="修改密码" />
                                        <asp:Button ID="btnCancel" runat="server" CommandName="cancel" Text="取消" CausesValidation="False" /></td>
                                    <td style="width: 95px">
                                    </td>
                                </tr>
                            </table>
                        </EditItemTemplate>
       
      
        <HeaderTemplate>
            <table style="width:100%;" bgcolor="#0066FF" >
                <tr>
                    <td style="color: #FFFFFF">
                        用户名</td>
                    <td style="color: #FFFFFF">
                        电子邮件</td>
                    <td style="color: #FFFFFF">
                        是否为管理员</td>
                         <td style="color: #FFFFFF">
                        操作</td>
                         <td style="color: #FFFFFF">
                        管理员设置</td>
                </tr>
              
            </table>
        </HeaderTemplate>
        <SelectedItemTemplate>
              <table style="width: 297px; height: 59px; font-size: 9pt;">
                                <tr>
                                    <td style="width: 58px; height: 19px;">
                                        用户名：</td>
                                    <td style="width: 131px; height: 19px;">
                                        <asp:TextBox ID="txtUserName" runat="server" Text='<%# DataBinder.Eval(Container.DataItem,"UserName") %>'
                                            Width="98px"></asp:TextBox>
                                        <asp:RequiredFieldValidator ID="RequiredFieldValidator4" runat="server" ControlToValidate="txtUserName"
                                            ErrorMessage="*"></asp:RequiredFieldValidator></td>
                                </tr>
                                <tr>
                                    <td style="width: 58px">
                                        Email：</td>
                                    <td style="width: 131px">
                                        <asp:TextBox ID="txtEmail" runat="server" Text='<%# DataBinder.Eval(Container.DataItem,"Email") %>'
                                            Width="98px"></asp:TextBox>
                                        <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="txtEmail"
                                            ErrorMessage="*"></asp:RequiredFieldValidator></td>
                                </tr>
                                <tr>
                                    <td style="width: 58px">
                                    </td>
                                    <td style="width: 131px">
                                        <asp:Button ID="btnUpdateName" runat="server" CommandName="updateName" CommandArgument = '<%# DataBinder.Eval(Container.DataItem,"UserID") %>' Text="修改用户信息" Width="84px" />
                                        <asp:Button ID="btnCancel" runat="server" CommandName="cancel" Text="取消" CausesValidation="False" /></td>
                                </tr>
                            </table>
        </SelectedItemTemplate>
        <ItemTemplate>
            <table style="width:100%;"  >
                <tr>
                    <td >
                        <asp:LinkButton ID="LinkButton2" runat="server" CommandName="select" 
                            Text='<%# Eval("UserName") %>'></asp:LinkButton>
                    </td>
                    <td >
                        <asp:Label ID="Label2" runat="server" Text='<%# Eval("Email") %>'></asp:Label>
                        </td>
                    <td >
                        <asp:CheckBox ID="CheckBox1" runat="server" Checked='<%# Eval("Role") %>' />
                    </td>
                         <td >
                             <asp:Button ID="Button1" runat="server" Text="编辑" CommandName="edit" />
                             &nbsp;<asp:Button ID="Button2" runat="server" Text="删除" CommandName="delete" />
                    </td>
                         <td >
                             <asp:Button ID="Button3" runat="server" 
                                 Text='<%# (bool)Eval("Role")==true?"取消管理员权限":"设置管理员权限" %>' 
                                 CommandName="setRole" />
                    </td>
                </tr>
              
            </table>
        </ItemTemplate>
    </asp:DataList>
    </form>
</body>
</html>
