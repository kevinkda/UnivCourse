<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/21
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-1.12.4.js"></script>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        .core {
            padding-top: 2em;
            width: 70%;
            margin: 0 auto;
            text-align: center;
        }

        #show {
            /*border: red solid 1px;*/
            display: none;
            padding-top: 2em;
            margin: 0 auto;
            width: 30%;
            text-align: center;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="core">
        <p>
            <label for="word">请输入首字母：</label>
            <input type="text" id="word" name="word" onblur="checkWord();">
        </p>
        <div id="show">

        </div>
    </div>
</div>
</body>
<script>
    function checkWord() {
        $.ajax({
            url: 'http://localhost:8082/java/WordServlet0521',
            dataType: 'text',
            type: 'POST',
            data: {
                'word': $("#word").val().trim()
            },
            async: true,
            success: function (data) {
                $("#show").text(data);
                $("#show").show();

                console.log(data);
            },
            error: function (data) {
                console.log(data);
            }
        });
    }
</script>
</html>
