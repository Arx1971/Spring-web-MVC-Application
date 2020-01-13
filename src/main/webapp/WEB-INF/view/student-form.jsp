<%--
  Created by IntelliJ IDEA.
  User: rahin
  Date: 1/12/20
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">

    First Name: <form:input path="firstName"/>

    <br><br>

    Last Name: <form:input path="lastName"/>

    <br><br>
    Country:
    <form:select path="country">

        <%--Hard Coded Result--%>
        <%--<form:option value="Brazil" label="Brazil"/>
        <form:option value="France" label="France"/>
        <form:option value="Germany" label="Germany"/>
        <form:option value="United States" label="United States"/>--%>

        <%--Result Retrieve From Student Class--%>

        <from:options items="${student.countryList}"/>


    </form:select>
    <br><br>

    <br><br>

    Favourite Programming Language: <!--spring will call student.setFavoriteLanguage()-->
    java <form:radiobutton path="favoriteLanguage" value="Java"/>
    C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
    Python <form:radiobutton path="favoriteLanguage" value="Python"/>
    R <form:radiobutton path="favoriteLanguage" value="R"/>

    <br><br>

    Operating System:
    Linux Ubuntu Mate <form:checkbox path="operatingSystem" value="Linux Ubuntu Mate"/>
    Linux Ubuntu Canonical <form:checkbox path="operatingSystem" value="Linux Ubuntu Canonical"/>
    Linux Mint<form:checkbox path="operatingSystem" value="Linux Mint"/>

    <input type="submit" value="Submit">

</form:form>

</body>
</html>
