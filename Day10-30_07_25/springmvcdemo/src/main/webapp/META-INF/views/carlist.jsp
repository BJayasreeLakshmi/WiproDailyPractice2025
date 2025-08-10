<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Car List</title>
</head>
<body>
    <h2>Available Car Brands</h2>
    <ul>
        <c:forEach var="car" items="${carList}">
            <li>${car}</li>
        </c:forEach>
    </ul>
</body>
</html>
