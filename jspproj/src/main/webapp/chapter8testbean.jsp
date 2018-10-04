<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

We can even do it with scripting INSIDE a standard action:
<jsp:useBean id="person" type="chapter8.firstexample.Person" class="chapter8.firstexample.Employee">
    <jsp:setProperty name="person" property="*"/>
                     <%--value="<%= request.getParameter(\"userName\") %>"/>--%>
</jsp:useBean>
<br>
Here is a name:
<jsp:getProperty name="person" property="name"/>
<br>
Here is an id:
<jsp:getProperty name="person" property="empId"/>

</body>
</html>
