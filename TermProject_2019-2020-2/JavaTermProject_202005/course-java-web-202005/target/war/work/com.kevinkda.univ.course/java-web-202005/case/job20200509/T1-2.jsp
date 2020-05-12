<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.kevinkda.util.str.StringProcess" %>
<%@ page import="java.util.Arrays" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/8
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String userAcc = StringProcess.getUtfStringFromHtml(request.getParameter("userAcc"));
    String userPass = StringProcess.getUtfStringFromHtml(request.getParameter("userPass"));
    String userSex = StringProcess.getUtfStringFromHtml(request.getParameter("sex"));
    String email = StringProcess.getUtfStringFromHtml(request.getParameter("email"));

//    String userHobby = StringProcess.getUtfStringFromHtml(request.getParameter("hobby"));
    String[] userHobby = request.getParameterValues("hobby");
    StringBuilder strHobby = new StringBuilder();
    for (String s :
            userHobby) {
        strHobby.append(StringProcess.getUtfStringFromHtml(s)).append(" ");
    }


    //    进行用户性别文字化处理
    if ("1".equals(userSex)) {
        userSex = "男";
    } else {
        userSex = "女";
    }
%>
<html>
<head>
    <title>User Info</title>
    <link rel="stylesheet" href="../../css/job20200509/T1.css">
</head>
<body>
<div class="container">
    <div class="table-wrapper">
        <table>
            <tr>
                <td>用户名</td>
                <td><%=userAcc%>
                </td>
            </tr>
            <tr>
                <td>密码</td>
                <td><%=userPass%>
                </td>
            </tr>
            <tr>
                <td>性别</td>
                <td><%=userSex%>
                </td>
            </tr>
            <tr>
                <td>电子邮件</td>
                <td><%=email%>
                </td>
            </tr>
            <tr>
                <td>兴趣爱好</td>
                <td><%=strHobby.toString()%>
                </td>
            </tr>
        </table>
    </div>
</div>
</body>
</html>
