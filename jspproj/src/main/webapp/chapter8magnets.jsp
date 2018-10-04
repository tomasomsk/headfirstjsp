<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:out value = "<b> </b> ${person.name}'s dog ${person.dog.name}'s toys are: ${person.dog.toys[0].name}, ${person.dog.toys[1].name}, ${person.dog.toys[2].name}"/>

</body>
</html>
