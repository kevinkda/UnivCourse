<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/6/19
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        ul, li {
            /*text-decoration: none;*/
            list-style: none;
        }

        label {
            margin-right: 2em;
            /*width: 10em;*/
        }

        .file-list-item {
            margin-right: 2em;
        }
    </style>
</head>
<body>
<div class="container">
    <form action="${pageContext.request.contextPath}/UploadServlet0618" method="post"
          enctype="multipart/form-data">
        <p><input type="button" value="Add" onclick="addFileItem();"></p>
        <div id="own-name">
            <p>
                <label for="own-name-item">上传者</label><input type="text" id="own-name-item" name="name"/>
            </p>
        </div>
        <div id="file-list">
            <div id="item">
                <%--                <p>--%>
                <%--                    <label for="file-list-item-0">上传文件</label>--%>
                <%--                    <input type="file" id="file-list-item-0" class="file-list-item" name="myfile">--%>
                <%--                    <input type="button" id="file-list-item-delete-0" class="file-list-item" onclick="removeItem()"--%>
                <%--                           value="Delete">--%>
                <%--                </p>--%>
            </div>
        </div>
        <div id="submit">
            <p><input type="submit" value="上传"/></p>
        </div>
    </form>
</div>
</body>
<script>
    let fileCount = 0;

    function addFileItem() {
        let fileList = document.getElementById("file-list");
        fileCount++;
        let templateElement = document.createElement("div");
        templateElement.setAttribute("id", "item-" + fileCount);
        templateElement.innerHTML = '<p>\n' +
            '                    <label for="file-list-item-' + fileCount + '">上传文件' + fileCount + '</label>\n' +
            '                    <input type="file" id="file-list-item-' + fileCount + '" class="file-list-item" name="myfile">\n' +
            '                    <input type="button" id="file-list-item-delete-' + fileCount + '" class="file-list-item" onclick="removeItem(' + fileCount + ')"\n' +
            '                           value="Delete">\n' +
            '                </p>';
        fileList.appendChild(templateElement);
    }

    function removeItem(uid) {
        let tempId = 'item-' + uid;
        let removeElement = document.getElementById(tempId);
        removeElement.remove();
    }

    window.onload = addFileItem();
</script>
</html>
