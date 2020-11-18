<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/1.12.4/jquery.js"></script>
    <#--    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/1.12.4/jquery.min.js"></script>-->
    <script src="/demo200916/js/b0929/upfile.js"></script>
</head>
<body>
<div class="container">
    <form action="/demo200916/b0929/receivefile" method="post"
          enctype="multipart/form-data" id="form-upfile">
        <p><label for="nickname">NickName:</label>
            <input type="text" id="nickname" name="nickname">
        </p>
        <p><label for="headPhoto">HeadName:</label>
            <input type="file" id="headPhoto" name="headPhoto"
                   onchange="verificationPicFile(this)">
        </p>
        <p><input type="submit" value="Submit"></p>
    </form>
</div>
</body>
<script>
    window.onload = function () {
        $.ajax({
            url: url
        })
    }
</script>
</html>