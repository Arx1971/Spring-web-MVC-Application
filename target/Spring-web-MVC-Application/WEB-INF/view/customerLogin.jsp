<%--
  Created by IntelliJ IDEA.
  User: rahin
  Date: 1/13/20
  Time: 3:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer FirstName LastName Page</title>
    <style>
        .error {
            color: red
        }
    </style>
</head>
<body>

<form:form action="process" modelAttribute="customer">
    First Name: <form:input path="firstName"/>
    Last Name : <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>

    <br><br>

    Free Passes: <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="error"/>
    <br><br>

    Postal Code: <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error"/>
    <br><br>
    <input type="submit" value="Submit">

</form:form>

</body>
</html>
