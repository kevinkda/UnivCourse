<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/1.12.4/jquery.js"></script>
    <#--    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/1.12.4/jquery.min.js"></script>-->
</head>
<body>
<div class="container">
    <div><img src="https://unsplash.com/photos/UaCB-rH9Sp0" alt="a"></div>
    <#--    <div><img src="../../static/img/britain-eriksen-UaCB-rH9Sp0-unsplash.jpg" alt="b"></div>-->
    <div>
        <img src="/demo200916/img/britain-eriksen-UaCB-rH9Sp0-unsplash.jpg" alt="b"
             style="width: 30em;height: 30em;">
    </div>
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