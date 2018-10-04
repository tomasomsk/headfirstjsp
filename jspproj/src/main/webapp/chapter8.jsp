<%@ page import="chapter8.firstexample.Person" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:useBean empId="person" type="chapter8.firstexample.Person" class="chapter8.firstexample.Employee" scope="request">
    <jsp:setProperty name="person" property="name" value="Fred"/>
</jsp:useBean>

Person created by servlet: <jsp:getProperty name="person" property="name"/>

</body>
</html>
