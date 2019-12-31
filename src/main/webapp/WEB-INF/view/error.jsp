<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error page</title>
    <style>
        #container {
            padding-top: 10%;
            text-align: center;
            display: block;
        }

        h3 {
            padding-top: 10px;
            text-align: center;
        }

    </style>
</head>
<body>
<h3>Sorry we cannot display your page</h3>
<br><br>
<div id="container">
    <img onclick="location.href='/'" src="/content/img/unsmileyface.jpg" alt="Unsmiley Face"/>
    <br><br>
    Click Face to reload
</div>

</body>
</html>
