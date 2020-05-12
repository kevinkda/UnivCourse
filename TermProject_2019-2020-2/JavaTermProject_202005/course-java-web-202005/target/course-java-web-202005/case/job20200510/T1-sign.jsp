<%@ page import="com.kevinkda.univ.course.web.job20200508.domain.Teacher" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/9
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //    获得用户输入的用户名
    String userAcc = request.getParameter("userAcc");

    boolean flag = false;

//    获得accList
//    List<String> list = (List<String>) request.getAttribute("accList");
    List<String> list = (List<String>) application.getAttribute("accList");

//    List<String> list = new ArrayList<String>();
//    list.add("T");
//    response.getWriter().write(String.valueOf(list));

//    检查 accList 是否存在
    if (list == null) {
//        不存在执行创建
        list = new ArrayList<String>();
//        用户名未被注册
        list.add(userAcc);
//        request.setAttribute("accList", list);
        application.setAttribute("accList", list);
        request.getRequestDispatcher("T1-suc.jsp").forward(request, response);
    } else {
//    list存在，存在执行用户名检查
        for (String s :
                list) {
//        检查用户名是否被注册
            if (s.equals(userAcc)) {
                flag = true;
//            用户名已被注册，执行错误跳转
//            request.getRequestDispatcher("T1-error.jsp").forward(request, response);
                response.sendRedirect("T1-error.jsp");
            }
        }
        if (!flag) {
//    用户名未被注册
            list.add(userAcc);
//    request.setAttribute("accList", list);
            application.setAttribute("accList", list);
            request.getRequestDispatcher("T1-suc.jsp").forward(request, response);

        }
    }
%>
<html>
<head>
    <title>job20200510T1-sign</title>
</head>
<body>

</body>
</html>
