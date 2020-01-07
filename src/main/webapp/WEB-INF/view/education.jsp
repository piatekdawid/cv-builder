<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add education</title>
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
    <a class="active" href="#education">Education</a>
    <a href="#experience">Experience</a>
    <a href="#language">Language</a>
    <a href="#achievement">Achievement</a>
</div>
<br>
<h3>Please add your education below</h3>
<br>
<form:form action="" id="form" modelAttribute="education" method="post">
    <form:hidden path="id"/>

    <div id="wrapper">
        <label>School Name</label>
        <form:input path="schoolName" class="input-box" type="text" name="schoolName"/>
        <br><br>
        <label>School begin</label>
        <form:input path="startingSchool" class="input-box" type="text" name="startingSchool"/>
        <br><br>
        <label>School graduation</label>
        <form:input path="finishSchool" class="input-box" type="text" name="finishSchool"/>
        <br><br>
        <label>Course</label>
        <form:input path="course" class="input-box" type="text" name="course"/>
        <br><br>
        <label>Degree</label>
        <form:input path="degree" class="input-box" type="text" name="degree"/>
        <br><br>
        <label>Additional Information</label>
        <form:input path="additionalInfo" class="input-box" type="text" name="additionalInfo"/>
        <br><br>
        <input class="submit-button" type="button" value="Add next" name="Next" onclick="nextEducationElement()"/>
        <input class="submit-button" type="button" value="Forward" name="finish" onclick="saveEducation()"/>

    </div>
</form:form>
<script id="script">
    form = document.getElementById("form");

    function nextEducationElement() {
        form.action = "nextElement";
        form.submit();
    }

    function saveEducation() {
        form.action = "saveEducation";
        form.submit();
    }

</script>
</body>
</html>
