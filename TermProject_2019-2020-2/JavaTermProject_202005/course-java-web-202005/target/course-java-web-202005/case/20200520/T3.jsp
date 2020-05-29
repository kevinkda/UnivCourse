<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/20
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="../../js/jquery.js"></script>
</head>
<body>
<div class="container">
    <p><input type="text" id="word" name="word" onblur="checkWord();"></p>
    <div id="show" style="border: red 1px solid;display: none;"></div>
</div>
</body>
<script>
    function checkWord() {
        // $.ajax({
        //     url:
        // });
        $.ajax({
            url: 'http://localhost:8081/course/WordServlet0520',
            dataType: 'text',
            type: 'POST',
            data: {
                'word': $("#word").val().trim()
            },
            async: true,
            success: function (data) {
                $("#showWords").html(data);
                $("#show").show();
                console.log(data);
            },
            error: function (data) {
                console.log(data);
            }
        });

        // $.ajax({
        //     url: '../../WordServlet0520',   //Servlet路径
        //     type: 'post',         //提交方法类型
        //     dataType: 'text',     //数据类型
        //     // 是否异步处理，异步为true
        //     async: true,
        //     data: {'word': $("#word").val().trim()},
        //     success: function (data) {
        //         $("#showWords").html(data);
        //         $("#show").show();
        //     }
        // });
    }
</script>
</html>
