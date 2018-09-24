<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>magnets from chapter 7</title>
</head>
<body>

The friends who share your hobby of

<%= request.getParameter("hobby") %>

are:

<br>

<%
    List<String> friends = (List) request.getAttribute("friends");
    for (String s : friends) {
%>

<%= s %>

<br>

<%
    }
%>

</body>
</html>
