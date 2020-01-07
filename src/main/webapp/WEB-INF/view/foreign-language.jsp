<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add language</title>
    <style>
        .resume-menu {
            background-color: #333;
            overflow: hidden;
        }

        /* Style the links inside the navigation bar */
        .resume-menu a {
            float: left;
            color: #f2f2f2;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
            font-size: 17px;
        }

        /* Change the color of links on hover */
        .resume-menu a:hover {
            background-color: #35c0fb;
            color: white;
        }

        /* Add a color to the active/current link */
        .resume-menu a.active {
            background-color: #3079ED;
            color: white;
        }

        body {
            background-color: rgba(65, 228, 255, 0.32);
            font-size: 20px;
        }

        label {
            float: left;
            height: 45px;
            width: 100px;
            margin-left: 30%;
        }

        .input-box {
            float: left;
            padding-top: 15px;
            padding-bottom: 15px;
            margin-bottom: 25px;
            text-align: center;
            width: 30%;
            border: #2F5BB7 solid 1px;
            border-radius: 8px;
        }

        .submit-button {
            display: inline;
            text-align: center;
            margin: 15px 50%;
            color: white;
            background: #4C8FFB;
            border: 1px #3079ED solid;
            box-shadow: inset 0 1px 0 #80B0FB;
            padding: 5px 20px;
        }

        #wrapper {
            width: 100%;
            margin: 0 auto;
        }

        h3 {
            text-align: center;
        }
    </style>
</head>
<body>
<div class="resume-menu">
    <a href="#personal-information">Personal information</a>
    <a href="#education">Education</a>
    <a href="#experience">Experience</a>
    <a class="active" href="#language">Language</a>
    <a href="#achievement">Achievement</a>
</div>
<br>
<h3>Please add your language</h3>
<br>
<form:form id="form" action="" modelAttribute="foreignLanguage" method="post">
    <form:hidden path="id"/>

    <div id="wrapper">
        <label>Language</label>
        <form:input path="language" class="input-box" type="text" name="language"/>
        <br><br>
        <label>Proficiency</label>
        <form:input path="proficiency" class="input-box" type="text" name="proficiency"/>
        <br><br>
            <%--<input class="submit-button" type="submit" value="Next">--%>
        <input class="submit-button" type="button" value="Add next" name="Next" onclick="nextElement()"/>
        <input class="submit-button" type="button" value="Forward" name="finish" onclick="move()"/>

    </div>
</form:form>
<script id="script">
    form = document.getElementById("form");

    function nextElement() {
        form.action = "nextForeignLanguage";
        form.submit();
    }

    function move() {
        form.action = "saveForeignLanguage";
        form.submit();
    }

</script>
</body>
</html>
