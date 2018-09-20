package chapter5;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class TestInitParams extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("Testing the init parameters <br>");
        Enumeration enumeration = getServletContext().getInitParameterNames();
        while (enumeration.hasMoreElements()) {
            pw.println("<br> param name: " + enumeration.nextElement() + "<br>");
        }
        pw.println("<br> main email = " + getServletConfig().getInitParameter("mainEmail") + "<br>");
        pw.println("<br> admin email = " + getServletConfig().getInitParameter("adminEmail"));
    }

}
