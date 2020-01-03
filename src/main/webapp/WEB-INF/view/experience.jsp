<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add experience</title>
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
            width: 100px;
            margin-left: 30%;
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
        .input-box{
            float: left;
            text-align: center;
            width: 30%;
            border: #2F5BB7 solid 1px;
            border-radius: 8px;

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
    <a class="active" href="#experience">Experience</a>
    <a href="#language">Language</a>
    <a href="#achievement">Achievement</a>
</div>
<br>
<h3>Please add your experience below</h3>
<br>
<form:form id="form" action="" modelAttribute="experience" method="post">
    <form:hidden path="id"/>

    <div id="wrapper">
        <label>Started date</label>
        <form:input path="dateStarted" class="input-box" type="text" name="dateStarted"/>
        <br><br>
        <label>Finish date</label>
        <form:input path="dateEnded" class="input-box" type="text" name="dateEnded"/>
        <br><br>
        <label>Position</label>
        <form:input path="position" class="input-box" type="text" name="position"/>
        <br><br>
        <label>Company</label>
        <form:input path="companyName" class="input-box" type="text" name="companyName"/>
        <br><br>
        <label>Description</label>
        <form:input path="shortDescription" class="input-box" type="text" name="shortDescription"/>
        <br><br>
        <label>Place</label>
        <form:input path="place" class="input-box" type="text" name="place"/>
        <br><br>
            <%--<input class="submit-button" type="submit" value="Next">--%>
        <input class="submit-button" type="button" value="Next" name="Next" onclick="nextElement()"/>
        <input class="submit-button" type="button" value="Finish" name="finish" onclick="move()"/>

    </div>
</form:form>
<script id="script">
    form = document.getElementById("form");

    function nextElement() {
        form.action = "nextExperience";
        form.submit();
    }

    function move() {
        form.action = "saveExperience";
        form.submit();
    }

</script>
</body>
</html>
