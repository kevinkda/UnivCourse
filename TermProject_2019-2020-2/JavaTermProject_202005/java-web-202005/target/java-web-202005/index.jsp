<%--<%@ taglib prefix="c" uri=""%>--%>
<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/7
  Time: 09:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Java Web</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        div {
            margin-left: 20px;
        }

        p {
            margin-top: 20px;
        }
    </style>
</head>
<body>
<div class="container">
    <div>
        <p>Java Web</p>
    </div>
    <div>
        <p>job20200507</p>
        <a href="<c:url value="case/job20200507/T1.jsp"/>">job20200507/T1</a>
    </div>
    <div>
        <p>job20200508</p>
        <a href="<c:url value="case/job20200508/T1.jsp"/>">job20200508/T1</a>
        <a href="<c:url value="case/job20200508/T2.jsp"/>">job20200508/T2</a>
    </div>
    <div>
        <p>job20200509</p>
        <a href="<c:url value="case/job20200509/T1.jsp"/>">job20200509/T1</a>
        <a href="<c:url value="case/job20200509/T2.jsp"/>">job20200509/T2</a>
    </div>
    <div>
        <p>job20200510</p>
        <a href="<c:url value="case/job20200510/T1.jsp"/>">job20200510/T1</a>
        <a href="<c:url value="case/job20200510/T2.jsp"/>">job20200510/T2</a>
    </div>
    <div>
        <p>job20200512</p>
        <a href="<c:url value="case/job20200512/T1.jsp"/>">job20200512/T1</a>
        <a href="<c:url value="case/job20200512/T2.jsp"/>">job20200512/T2</a>
        <a href="<c:url value="case/job20200512/T3.jsp"/>">job20200512/T3</a>
    </div>
    <div>
        <p>job20200513</p>
        <a href="<c:url value="case/job20200513/T1.jsp"/>">job20200513/T1</a>
    </div>
    <div>
        <p>job20200514</p>
        <a href="<c:url value="case/job20200514/T1.jsp"/>">job20200514/T1</a>
        <a href="<c:url value="case/job20200514/T2.jsp"/>">job20200514/T2</a>
    </div>
    <div>
        <p>job20200514</p>
        <a href="<c:url value="case/job20200515/T1.jsp"/>">job20200515/T1</a>
        <a href="<c:url value="case/job20200515/T2.jsp"/>">job20200515/T2</a>
    </div>
</div>
</body>
</html>
