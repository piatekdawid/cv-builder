<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        h3 {
            padding-top: 30px;
            text-align: center
        }
        body{
            background-color: rgba(65, 228, 255, 0.32);
            font-size: 20px;
        }

        .button {
            display: block;
            text-align: center;
            margin: 5px auto;
            color: white;
            background: #4C8FFB;
            border: 1px #3079ED solid;
            box-shadow: inset 0 1px 0 #80B0FB;
            padding: 5px 10px;
        }

        .button:hover {
            border: 1px #2F5BB7 solid;
            box-shadow: 0 1px 1px #EAEAEA, inset 0 1px 0 #5A94F1;
            background: #3F83F1;
        }

        .button:active {
            box-shadow: inset 0 2px 5px #2370FE;
        }
    </style>
    <title>CV Online builder</title>
</head>
<body>
<h3>Welcome to CV online creator</h3>
    <input type="button"
           value="Click"
           onclick="window.location.href = 'showBuilder'; return false;"
           class = "button"/>
</body>
</html>