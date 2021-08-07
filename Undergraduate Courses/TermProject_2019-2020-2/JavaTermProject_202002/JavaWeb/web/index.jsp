<%--
  ~ Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
  ~ Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
  ~ Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
  ~ Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
  ~ Vestibulum commodo. Ut rhoncus gravida arcu.
  --%>

<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/2/19
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="utf-8" %>
<%@ page import="com.kevin.homepage.entity.Project" %>
<%@ page import="com.kevin.homepage.manager.Manager" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    ArrayList<Project> projects = Manager.getAllProjects();
    int count = 0;
    request.setAttribute("projects", projects);
%>
<html lang="zh">
<head>
    <title>Project Directory</title>
    <link rel="stylesheet" href="./css/index.css">
</head>
<body>
<div class="container">
    <div class="top-wapper">
        <h1 id="top-word">Project list of the second semester 2019-2020</h1>
    </div>

    <div class="core-wapper">
        <div class="table-wapper">
            <table>
                <thead>
                <th>SN</th>
                <th>Project</th>
                <th>Submission Date</th>
                <th>Project Description</th>
                <th>Task Details</th>
                <th>Affiliated Courses</th>
                </thead>
                <c:forEach items="${projects}" var="p">
                    <tr>
                        <%request.setAttribute("count", ++count);%>
                        <td><c:out value="${(count)}"></c:out></td>
                        <td><a href="<c:out value="${(p.strUrlByProjName)}"></c:out>">
                            <c:out value="${(p.strProjName)}"></c:out></a></td>
                        <td><c:out value="${(p.strSubmissionDate)}"></c:out></td>
                        <td><c:out value="${(p.strProjectDescription)}"></c:out></td>
                            <%--                        <td><a href="<c:out value="${(p.strUrlByTaskDetails)}"></c:out>">Detail</a></td>--%>
                        <td>
                            <a href="${pageContext.request.contextPath}/TaskDetailsServlet?task=<c:out value="${(p.strUrlByTaskDetails)}"></c:out>">Detail</a>
                        </td>
                        <td><c:out value="${(p.strAffiliatedCourses)}"></c:out></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>

    <div class="bottom-wapper">
        <hr>
        <p class="complete">Modification Date: February 22, 2020</p>
    </div>
</div>
</body>
<script src="js/Copyright.js"></script>
</html>
