<%--
  Created by IntelliJ IDEA.
  User: hoangfvi
  Date: 30/11/2021
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test='${message != null}'>
    ${message}
    <br>
    <a href="/student">View product list</a>
</c:if>
</body>
</html>
