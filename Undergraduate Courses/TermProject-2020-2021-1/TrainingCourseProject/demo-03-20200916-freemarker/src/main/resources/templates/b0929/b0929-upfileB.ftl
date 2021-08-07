<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/1.12.4/jquery.js"></script>
    <script src="/demo200916/js/jquery-1.11.0.min.js"></script>
    <#--    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/1.12.4/jquery.min.js"></script>-->
    <script src="/demo200916/js/b0929/upfileB.js"></script>
</head>
<body>
<div class="container">
    <form action="/demo200916/b0929B/receivefile" method="post"
          enctype="multipart/form-data" id="form-upfile">
        <p><label for="nickname">NickName:</label>
            <input type="text" id="nickname" name="nickname">
        </p>
        <p><label for="headPhoto">HeadName:</label>
            <input type="file" id="headPhoto" name="headPhoto">
        </p>
        <p><input type="button" value="Submit" onclick="insertData();"></p>
    </form>
</div>
</body>
<script>

</script>
</html>