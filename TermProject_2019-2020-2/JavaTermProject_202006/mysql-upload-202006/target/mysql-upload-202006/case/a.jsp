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
    </style>
</head>
<body>
<div class="container">
    <form action="${pageContext.request.contextPath}/UploadServlet0618" method="post"
          enctype="multipart/form-data">
        <table width="600">
            <th>
                <tr>
                    <td><input type="button" value="Add" onclick="addFileItem();"></td>
                </tr>
            </th>
            <tr>
                <td>上传者</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <ul id="file-list">

            </ul>
            <tr>
                <!--设置单元格可横跨的列数。-->
                <td colspan="2"><input type="submit" value="上传"/></td>
            </tr>
        </table>
    </form>
</div>
</body>
<script>
    let fileCount = 0;

    function addFileItem() {
        let fileList = document.getElementById("file-list");
        fileCount++;
        let templateElement = document.createElement("li");
        templateElement.setAttribute("id", "item" + fileCount);
        console.log(templateElement);
        templateElement.innerHTML = "<tr>\n" +
            "            <td>上传文件" + fileCount + "</td>\n" +
            "            <td><input type=\"file\" name=\"myfile\"/></td>\n" +
            "        </tr>";
        console.log(templateElement);

        fileList.appendChild(templateElement);
    }
</script>
</html>
