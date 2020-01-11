<%--
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create CV</title>
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

        .input-box {
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

        .container {
            width: 100%;
            margin: 0 auto;
        }

        #left-container {
            width: 100%;
            margin: 0 auto;
        }

        #right-container {
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
    <a class="active" href="#personal-information">Personal information</a>
    <a href="#education">Education</a>
    <a href="#experience">Experience</a>
    <a href="#language">Language</a>
    <a href="#achievement">Achievement</a>
</div>
<br>
<h3>Please add your information below</h3>
<br>
<form:form action="savePersonals" modelAttribute="person" method="POST">
    <form:hidden path="id"/>

    <div class="container">
        <div id="left-container">
            <label>First name</label>
            <form:input path="firstName" class="input-box" type="text" name="firstName"/>
            <br><br>
            <label>Last name</label>
            <form:input path="lastName" class="input-box" type="text" name="lastName"/>
            <br><br>
            <label>Address</label>
            <form:input path="address" class="input-box" type="text" name="address"/>
            <br><br>
            <label>Zip code</label>
            <form:input path="zipCode" class="input-box" type="text" name="zipCode"/>
            <br><br>
            <label>City</label>
            <form:input path="city" class="input-box" type="text" name="city"/>
            <br><br>
            <label>Email</label>
            <form:input path="email" class="input-box" type="text" name="email"/>
            <br><br>
            <label>Phone number</label>
            <form:input path="phoneNumber" class="input-box" type="text" name="phoneNumber"/>
            <br><br>
        </div>
        <div id="right-container">
            <label>About Me</label>
            <form:input path="aboutMe" class="input-box" type="text" name="aboutMe"/>
            <br><br>
            <label>Skills</label>
            <form:input path="skills" class="input-box" type="text" name="skills"/>
            <br><br>
            <label>Hobby</label>
            <form:input path="hobbySet" class="input-box" type="text" name="hobby"/>
            <br><br>
        </div>
        <input onclick="location.href='education'" class="submit-button" type="submit" value="Next">
    </div>
</form:form>
</body>
</html>
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create CV</title>
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

        .input-bigger {
            text-align: left;
            word-wrap: break-word;
            word-break: break-all;
            padding: 10px;
            height: 100px;
            width: 60%;
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

        .container {
            width: 100%;
            margin: 0 auto;
        }

        #left-container {
            width: 48%;
            float: left;
            margin: 0 auto;
        }

        #right-container {
            width: 48%;
            float: right;
            margin: 0 auto;
        }

        h3 {
            text-align: center;
        }
    </style>
</head>
<body>
<div class="resume-menu">
    <a class="active" href="#personal-information">Personal information</a>
    <a href="#education">Education</a>
    <a href="#experience">Experience</a>
    <a href="#language">Language</a>
    <a href="#achievement">Achievement</a>
</div>
<br>
<h3>Please add your information below</h3>
<br>
<form:form action="savePersonals" modelAttribute="person" method="POST" enctype="multipart/form-data">
    <form:hidden path="id"/>

    <div class="container">
        <div id="left-container">
            <label>First name</label>
            <form:input path="firstName" class="input-box" type="text" name="firstName"/>
            <br><br>
            <label>Last name</label>
            <form:input path="lastName" class="input-box" type="text" name="lastName"/>
            <br><br>
            <label>Address</label>
            <form:input path="address" class="input-box" type="text" name="address"/>
            <br><br>
            <label>Zip code</label>
            <form:input path="zipCode" class="input-box" type="text" name="zipCode"/>
            <br><br>
            <label>City</label>
            <form:input path="city" class="input-box" type="text" name="city"/>
            <br><br>
            <label>Email</label>
            <form:input path="email" class="input-box" type="text" name="email"/>
            <br><br>
            <label>Phone number</label>
            <form:input path="phoneNumber" class="input-box" type="text" name="phoneNumber"/>
            <br><br>
            <label>CV photo</label>
            <form:input path="photo" type="file" name="file"/>
            <br><br>
        </div>
        <div id="right-container">
            <label>About Me</label>
            <form:input path="aboutMe" class="input-bigger" type="text" name="aboutMe"/>
            <br><br>
            <label>Skills</label>
            <form:input path="skills" class="input-bigger" type="text" name="skills"/>
            <br><br>
            <label>Hobby</label>
            <form:input path="hobbySet" class="input-bigger" type="text" name="hobby"/>
            <br><br>
        </div>
        <input onclick="location.href='education'" class="submit-button" type="submit" value="Next">
    </div>
</form:form>
</body>
</html>

