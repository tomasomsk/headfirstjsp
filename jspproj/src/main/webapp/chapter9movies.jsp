<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Movies</title>
</head>
<body>
<table>
    <c:forEach var="listElement" items="${movies}">
        <c:forEach var = "movie" items = "${listElement}">
            <tr>
                <td>${movie}</td>
            </tr>
        </c:forEach>
    </c:forEach>
</table>

</body>
</html>
