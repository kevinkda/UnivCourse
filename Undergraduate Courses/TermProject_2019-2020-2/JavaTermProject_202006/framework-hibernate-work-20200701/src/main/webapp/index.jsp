<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/7/1
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table {
            border: 1px solid gray;
            border-collapse: collapse;
            width: 60%;
        }

        td {
            border: 1px solid gray;
            padding: 5px;
        }
    </style>
    <script type="text/javascript" src="js/ajax.js"></script>
</head>
<body>
<div class="container">
    <form action="${pageContext.request.contextPath}/AuthorServlet" method="post"></form>
    <table>
        <tr>
            <td>作者ID</td>
            <td>作者名</td>
            <td>作者年龄</td>
        </tr>
        <c:forEach items="${requestScope.authorList}" var="author">
            <tr>
                <td>${author.author_ID}</td>
                <td>${author.author_Name}</td>
                <td>${author.author_Age}</td>
                <td>
                        <%--                <a href="<c:url value='${pageContext.request.contextPath}com/xiaosir/servlet/AuthorServlet?--%>
                        <%--                cmd=delAuthor&authorId=${author.author_ID}'/>">删除</a>--%>
                    <a href="${pageContext.request.contextPath}/AuthorServlet?cmd=delAuthor&authorId=${author.author_ID}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>

    <h3>添加一个学生信息</h3>
    <%--<form action="<c:url value='${pageContext.request.contextPath}/AuthorServlet?cmd=addAuthor'/>"--%>
    <%--      method="post">--%>
    <form action="${pageContext.request.contextPath}/AuthorServlet" method="post">
        <table>
            <tr>
                <td>作者ID<span style="color: red; ">*</span></td>
                <td><input type="text" name="authorId" required></td>
            </tr>
            <tr>
                <td>作者姓名<span style="color: red; ">*</span></td>
                <td><input type="text" name="authorName" required></td>
            </tr>
            <tr>
                <td>作者年龄<span style="color: red; ">*</span></td>
                <td><input type="text" name="authorAge" required></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="添加/修改"></td>
            </tr>
        </table>
    </form>


    <hr/>
    <h3>学生查询</h3>
    <table>
        <tr>
            <td><label for="select-author-id">作者ID</label></td>
            <td><input type="text" id="select-author-id" name="authorId"></td>
        </tr>
        <tr>
            <td><label for="select-author-Name">作者姓名</label></td>
            <td><input type="text" id="select-author-Name" name="authorName"></td>
        </tr>
        <tr>
            <td><label for="select-author-Age">作者年龄</label></td>
            <td><input type="text" id="select-author-Age" name="authorAge"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="button" onclick="query();" value="查询">
            </td>
        </tr>
    </table>

    <c:if test="${!empty sessionScope.qlist}">
        <h3>查询结果</h3>
        <table>
            <tr>
                <td>作者ID</td>
                <td>作者名</td>
                <td>作者年龄</td>
            </tr>
            <c:forEach items="${sessionScope.qlist}" var="author">
                <tr>
                    <td>${author.author_ID}</td>
                    <td>${author.author_Name}</td>
                    <td>${author.author_Age}</td>
                    <td>
                            <%--                    <a href="<c:url value='${pageContext.request.contextPath}com/xiaosir/servlet/AuthorServlet?cmd=delAuthor&authorId=${author.author_ID}'/>">删除</a>--%>
                            <%--                    <a href="<c:url value='${pageContext.request.contextPath}com/xiaosir/servlet/AuthorServlet?cmd=delAuthor&authorId=${author.author_ID}'/>">删除</a>--%>
                            <%--                    <a href="<c:url value='${pageContext.request.contextPath}com/xiaosir/servlet/AuthorServlet?cmd=delAuthor&authorId=${author.author_ID}'/>">删除</a>--%>
                        <a href="${pageContext.request.contextPath}/AuthorServlet?cmd=delAuthor&authorId=${author.author_ID}">删除</a>
                        <a href="${pageContext.request.contextPath}/AuthorServlet?cmd=delAuthor&authorId=${author.author_ID}">删除</a>
                        <a href="${pageContext.request.contextPath}/AuthorServlet?cmd=delAuthor&authorId=${author.author_ID}">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</div>
</body>
<script type="text/javascript">
    let path = "<c:url value='/'/>";
</script>

<script type="text/javascript">
    let d = new Date();

    function query() {
        let authorId = document.getElementsByName("authorId")[1].value.trim();
        let authorName = document.getElementsByName("authorName")[1].value.trim();
        let authorAge = document.getElementsByName("authorAge")[1].value.trim();

        //ajax提交
        let ajax = new Ajax();
        let url = path + "/AuthorServlet";
        let params = "cmd=queryStudents&authorId=" + authorId + "&authorName="
            + authorName + "&authorAge=" + authorAge;
        ajax.post(url, params, function (data) {
            if (data == "1") {
                //这个返回来输出的页面的是子页面！
                window.parent.window.location.href = path + "?time="
                    + d.getTime();
            }
        });
    }
</script>
</html>
