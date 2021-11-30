<%--
  Created by IntelliJ IDEA.
  User: hoangfvi
  Date: 30/11/2021
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <p>Student id: ${student.getId()} </p> <br>
    <input type="text" value="${student.getName()}" name="name1"> <br>
    <input type="text" value="${student.getMaths()}" name="maths"> <br>
    <input type="text" value="${student.getPhysics()}" name="physics"> <br>
    <input type="text" value="${student.getChemistry()}" name="chemistry">
    <button onclick="return confirm('Are you sure to update student id ${student.getId()} with name '+ name1.value+': '+ 'maths '+maths.value+', physics '+physics.value+', chemistry '+chemistry.value)">
        Submit</button>
</form>
</body>
</html>
