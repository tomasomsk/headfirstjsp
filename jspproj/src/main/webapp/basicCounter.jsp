<%@ page import="chapter7.counter.Counter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    private int count = 0;
%>

The page count is now:

<%= ++count %>

</body
</html>
