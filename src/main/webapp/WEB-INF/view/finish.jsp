<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Preview</title>
    <style>
        <%@include file="/WEB-INF/css/styles.css" %>
    </style>
</head>

<body>
<div id="doc">
    <div id="left-container">
        <div id="name">
            ${person.firstName} ${person.lastName}
        </div>
        <div id="photo">
            <img src="data:image/png;base64, ${photo}" alt=""/>
        </div>
        <div id="contact">
            <h3>Contact</h3>
            <hr>
            <b>Address:</b>
            <p>${person.address}</p>
            <br>
            <p>${person.zipCode}</p>
            <br>
            <p>${person.city}</p>
            <br><br>
            <b>Mobile phone:</b>
            <p>${person.phoneNumber}</p>
            <br><br>
            <b>Email:</b>
            <br>
            <p>${person.email}</p>
            <br><br>
        </div>
        <div id="languages">
            <h3>Languages</h3>
            <hr>
            <c:forEach items="${person.foreignLanguageSet}" var="list">
                ${list.language} - ${list.proficiency}
            </c:forEach>
        </div>
        <div id="clause">„Wyrażam zgodę na przetwarzanie moich danych osobowych również na potrzeby przyszłych
            rekrutacji, zgodnie z art. 6 ust. 1 lit. a Rozporządzenia Parlamentu Europejskiego i Rady (UE) 2016/679 z
            dnia 27 kwietnia 2016 r. w sprawie ochrony osób fizycznych w związku z przetwarzaniem danych osobowych i w
            sprawie swobodnego przepływu takich danych oraz uchylenia dyrektywy 95/46/WE (ogólne rozporządzenie o
            ochronie danych)”.
        </div>
    </div>
    <div id="right-container">
        <div id="about_me">
            <h2>About me</h2>
            <hr>
            ${person.hobbySet}
        </div>

        <div id="experience">
            <h2>Experience</h2>
            <hr>
            <c:forEach items="${person.experienceSet}" var="list">
                <div id="exp">
                    <div id="exp-date">
                            ${list.dateStarted}-${list.dateEnded}
                    </div>
                    <h3>${list.position} ${list.companyName} ${list.place}</h3>
                        ${list.shortDescription}
                </div>
                <br>
            </c:forEach>
        </div>

        <div id="education">
            <h2>Education</h2>
            <hr>
            <c:forEach items="${person.educations}" var="list">
                <div id="edu">
                    <div id="school-time">
                            ${list.startingSchool}-${list.finishSchool}
                    </div>
                    <h3>${list.schoolName} ${list.course} ${list.degree}</h3>
                        ${list.additionalInfo}
                </div>
                <br>
            </c:forEach>
        </div>

        <div id="skills">
            <h2>Skills</h2>
            <hr>
            ${person.skills}
        </div>
        <div id="hobbys">
            <h2>Hobby</h2>
            <hr>
            ${person.hobbySet}
        </div>
    </div>
</div>
</body>
</html>
