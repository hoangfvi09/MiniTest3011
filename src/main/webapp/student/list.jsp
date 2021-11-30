<%--
  Created by IntelliJ IDEA.
  User: hoangfvi
  Date: 30/11/2021
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Student List</h2>
<c:forEach items='${students}' var="student">
    <p>
            ${student.getId()},    ${student.getName()},    ${student.getMaths()} ,   ${student.getPhysics()},  ${student.getChemistry()}
                <a href="student?action=remove&id=${student.getId()}"
           onclick="return confirm('Are you sure to delete student ${student.getName()}?')">Delete</a><br>
    </p>

</c:forEach>
<a href="student?action=update">Update a student</a>
</body>
</html>
