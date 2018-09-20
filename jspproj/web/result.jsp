<%@ page import="java.util.*" %>
<html>
<body>
<h1 align=”center”>Beer Recommendations JSP</h1>
<p>
    <%

        List styles = (List) request.getAttribute("styles");
        for (Object style : styles) {
            out.print("<br>try: " + style);
        }
        out.print("<br>");
        out.print("<br>");
        out.print("<br>");
        out.print("admin email: " + getServletConfig().getServletContext().getInitParameter("adminEmail"));
    %>
</p>
</body>
</html>