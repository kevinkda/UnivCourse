<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/6/19
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Up File</title>
</head>
<body>
<div class="container">
    <form action="${pageContext.request.contextPath}/UpFileServlet0618" method="post"
          enctype="multipart/form-data">
<%--        <p>选择一个文件</p>--%>
<%--        <p><input type="file" name="uploadFile"/></p>--%>
<%--        <input type="submit" value="上传"/>--%>
    <table>
        <tr><td>图片名字</td><td><input type="text" name="name" id="name" /></td></tr>
        <tr><td>图片路径</td><td><input type="file" name="file" value="浏览" /></td></tr>
        <tr><td><input type="submit" value="提交"/></td></tr>
    </table>
    </form>
</div>
</body>
</html>
