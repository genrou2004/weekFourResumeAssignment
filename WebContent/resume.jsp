<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Resume</title>
</head>
<body>
<form action="ResumeController.do" method="post">
        <fieldset>
            <div>
                <label for="resumeID">Resume ID</label> <input type="text"
                    name="resumeID" value="<c:out value="${resume.resumeID}" />"
                    readonly="readonly"/>
            </div>
            <div>
                <label for="firstName">First Name</label> <input type="text"
                    name="firstName" value="<c:out value="${resume.firstName}" />"
                    placeholder="First Name" />
            </div>
            <div>
                <label for="lastName">Last Name</label> <input type="text"
                    name="lastName" value="<c:out value="${resume.lastName}" />"
                    placeholder="Last Name" />
            </div>
            <div>
                <label for="emailAddress">Email</label> <input type="text" name="emailAddress"
                    value="<c:out value="${resume.emailAddress}" />" placeholder="Email Address" />
            </div>
            <div>
                <label for="schoolName">School Name</label> <input type="text" name="schoolName"
                    value="<c:out value="${resume.schoolName}" />" placeholder="School Name" />
            </div>
             <div>
                <label for="levelOfEducation">Level Of Education</label> <input type="text" name="levelOfEducation"
                    value="<c:out value="${resume.levelOfEducation}" />" placeholder="Level Of Education" />
            </div>
             <div>
                <label for="workExperience">Work Experience</label> <input type="text" name="workExperience"
                    value="<c:out value="${resume.workExperience}" />" placeholder="Work Experience" />
            </div>
             <div>
                <label for="levelOfExperty">Level Of Experty</label> <input type="text" name="levelOfExperty"
                    value="<c:out value="${resume.levelOfExperty}" />" placeholder="Experty Level" />
            </div>
             <div>
                <label for="skillSetName">Skill Set Name</label> <input type="text" name="skillSetName"
                    value="<c:out value="${resume.skillSetName}" />" placeholder="Skill Set Name" />
            </div>
             <div>
                <label for="levelOfSkillSet">Level Of Skill Set</label> <input type="text" name="levelOfSkillSet"
                    value="<c:out value="${resume.levelOfSkillSet}" />" placeholder="Skill Set Level" />
            </div>
            <div>
                <input type="submit" value="Submit" />
            </div>
        </fieldset>
    </form>
</body>
</html>