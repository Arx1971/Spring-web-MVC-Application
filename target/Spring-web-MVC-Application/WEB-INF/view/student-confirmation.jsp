<%--
  Created by IntelliJ IDEA.
  User: rahin
  Date: 1/12/20
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>

First Name: ${student.firstName} <!--spring will call student.getFirstName()-->
<br><br>
Last Name: ${student.lastName} <!--spring will call student.getLastName()-->
<br><br>
Country: ${student.country} <!--spring will call student.getCountry()-->
<br><br>
Favourite Programming Language: ${student.favoriteLanguage} <!--spring will call student.getFavoriteLanguage()-->
<br><br>

<ul>
    <c:forEach var="temp" items="${student.operatingSystem}">
        <li> ${temp} </li>
    </c:forEach>
</ul>

</body>
</html>
