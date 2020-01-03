<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add achievement</title>
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
        .input-box{
            float: left;
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
    <a href="#language">Language</a>
    <a class="active" href="#achievement">Achievement</a>
</div>
<br>
<h3>Please add your achievement and courses below</h3>
<br>
<form:form id="form" action="" modelAttribute="achievement" method="post">
    <form:hidden path="id"/>

    <div id="wrapper">
        <label>Date</label>
        <form:input path="date" class="input-box" type="text" name="date"/>
        <br><br>
        <label>Name</label>
        <form:input path="name" class="input-box" type="text" name="name"/>
        <br><br>
        <label>Place</label>
        <form:input path="place" class="input-box" type="text" name="place"/>
        <br><br>
        <label>Description</label>
        <form:input path="description" class="input-box" type="text" name="description"/>
        <br><br>
            <%--<input class="submit-button" type="submit" value="Next">--%>
        <input class="submit-button" type="button" value="Next" name="Next" onclick="nextElement()"/>
        <input class="submit-button" type="button" value="Finish" name="finish" onclick="move()"/>

    </div>
</form:form>
<script id="script">
    form = document.getElementById("form");

    function nextElement() {
        form.action = "nextAchievement";
        form.submit();
    }

    function move() {
        form.action = "saveAchievement";
        form.submit();
    }

</script>
</body>
</html>
