<%--
  Created by IntelliJ IDEA.
  User: rahin
  Date: 1/12/20
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>

First Name: ${student.firstName} <!--spring will call student.getFirstName()-->
Last Name: ${student.lastName}<!--spring will call student.getLastName()-->
Country: ${student.country}<!--spring will call student.getCountry()-->
</body>
</html>
