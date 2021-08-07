<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Version</title>
    <meta http-equiv="Expires" content="0">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-control" content="no-cache">
    <meta http-equiv="Cache" content="no-cache">
    <style>
        #tagTime {
            margin-right: 1em;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>${name}</h1>
    <h2>Version ${main} - ${sub}</h2>
    <h2>POM Version ${pom}</h2>
    <#--    <h4>${version_token}</h4>-->
    <h4>
        <strong id="tagTime">Restart Time</strong>
        <span>${date}</span>
    </h4>
</div>
</body>
</html>