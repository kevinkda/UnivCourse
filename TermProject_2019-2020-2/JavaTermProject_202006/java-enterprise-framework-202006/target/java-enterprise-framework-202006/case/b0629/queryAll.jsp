<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/6/21
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <form action="${pageContext.request.contextPath}/AuthorServlet0629" method="get" id="form1">
        <input type="hidden" value="1" name="param" id="param"/>
        <input type="hidden" name="pageIndex" id="pageIndex" value="1"/>
        <input type="hidden" name="pageSize" id="pageSize" value="3"/>
        <p>作者:
            <input type="text" name="authorName" value="${parmaMap.authorName}" id="authorName"/>
            年龄:
            <input type="text" name="authorAge" id="authorAge" value="${parmaMap.authorAge}"/>
            <input type="submit"/>
        </p>
    </form>
    <table>
        <tr>
            <td>authorId</td>
            <td>authorName</td>
            <td>authorAge</td>
            <td>update</td>
            <td>delete</td>
        </tr>
        <c:forEach var="comment" items="${sessionScope.authorList}">
            <tr>
                <td>${comment.authorId}</td>
                <td>${comment.authorName}</td>
                <td>${comment.authorAge}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/AuthorServlet0629?operType=queryItem&blogId=${comment.authorId}">detailed</a>
                <td>
                    <a href="${pageContext.request.contextPath}/AuthorServlet0629?operType=updateB&blogId=${comment.authorId}">update</a>
                </td>
                <td>
                    <a href="updateB.jsp?operType=updateB&authorId=${comment.authorId}&authorName=${comment.authorName}&authorAge=${comment.authorAge}">update</a>
                </td>
                <td>
                    <a href="${pageContext.request.contextPath}/AuthorServlet0629?operType=delete&authorId=${comment.authorId}">delete</a>
                </td>
            </tr>
        </c:forEach>
        <tr>
            <c:if test="${parmaMap.pageIndex!=1}">
                <td><a href="javascript:pageIndex(${parmaMap.pageIndex-1},${parmaMap.pageSize});">上一页</a>
                </td>
            </c:if>
            <td>总的数量${parmaMap.totalCount},总的页数${parmaMap.totalPage},当前页${parmaMap.pageIndex},每页最大条数
                <select id="pageSize1">
                    <option id="sel0" <c:if test="${parmaMap.pageSize==3}">selected="selected"</c:if>>3</option>
                    <option id="sel1" <c:if test="${parmaMap.pageSize==4}">selected="selected"</c:if>>4</option>
                    <option id="sel2" <c:if test="${parmaMap.pageSize==5}">selected="selected"</c:if>>5</option>
                </select>
                <c:if test="${parmaMap.pageIndex!=parmaMap.totalPage}">
            <td><a href="javascript:pageIndex(${parmaMap.pageIndex+1},${parmaMap.pageSize});">下一页</a>
            </td>
            </c:if>
        </tr>
    </table>


</div>
</body>
<script>
    function pageIndex(pageIndex, pageSize) {
        document.getElementById("pageIndex").value = pageIndex;
        document.getElementById("pageSize").value = pageSize;
        document.getElementById("form1").submit();
    }

    function loadData() {
        //取到从servlet里面传递过来的每页的最大条数
        let pageSize = '${parmaMap.pageSize}';
        let num = new Array(3);
        let index = -1;
        for (let i = 0; i < num.length; i++) {
            if (document.getElementById("sel" + i).innerHTML == pageSize) {
                index = i;
                break;
            }
        }
        console.log(index);
        document.getElementById("sel" + index).selected = "selected";
    }
</script>
</html>
