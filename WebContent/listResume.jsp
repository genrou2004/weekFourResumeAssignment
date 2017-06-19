<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show All Resumes</title>
</head>
<body>
<table>
        <thead>
            <tr>
                <th>Resume ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>School Name</th>
                <th>Educational Level</th>
                <th>Work Experience</th>
                <th>Experience Level</th>
                <th>SkillSet Name</th>
                <th>Level Of SkillSet</th>
                <th colspan="2">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${resumes}" var="resume">
                <tr>
                    <td><c:out value="${resume.resumeID}" /></td>
                    <td><c:out value="${resume.firstName}" /></td>
                    <td><c:out value="${resume.lastName}" /></td>
                    <td><c:out value="${resume.emailAddress}" /></td>
                    <td><c:out value="${resume.schoolName}" /></td>
                    <td><c:out value="${resume.levelOfEducation}" /></td>
                    <td><c:out value="${resume.workExperiance}" /></td>
                    <td><c:out value="${resume.levelOfExperty}" /></td>
                    <td><c:out value="${resume.skillSetName}" /></td>
                    <td><c:out value="${resume.levelOfSkillSet}" /></td>
                    <td><a href="ResumeController.do?action=edit&resumeID <c:out value="${resume.resumeID }"/>">Update</a></td>
                    <td><a href="ResumeController.do?action=delete&resumeID <c:out value="${resume.resumeID }"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p>
        <a href="ResumeController.do?action=insert">Add Resume</a>
    </p>
</body>
</html>