<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>

<h2>Уважаемый сотрудник, пожалуйста, заполните свои данные</h2>

<br>
<br>

<form:form action="showDetails2" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br>
    <br>
    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    <br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    <br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
</form:select>
    <br><br>
    Which car do you want?
    <form:radiobuttons path="car" items="${employee.cars}"/>
    <br/>
    Language(s):
    En <form:checkbox path="languages" value="English"/>
    Fr <form:checkbox path="languages" value="French"/>
    De <form:checkbox path="languages" value="Deutch"/>

    <input type="submit" value="OK">
</form:form>

</body>

</html>