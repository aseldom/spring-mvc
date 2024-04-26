<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>

<%--<h2>Добро пожаловать, дорогой ${param.employeeName}!</h2>--%>
<br>
<br>
<h2>Your name ${employee.name}!</h2>
<h2>Your surname ${employee.surname}!</h2>
<h2>Your salary ${employee.salary}!</h2>
<h2>Your department ${employee.department}!</h2>
<h2>Your phoneNumber ${employee.phoneNumber}!</h2>
<h2>Your email ${employee.email}!</h2>
<h2>Your car ${employee.car}!</h2>
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>  ${lang}  </li>
    </c:forEach>
</ul>

<br>
<br>

</body>
</html>