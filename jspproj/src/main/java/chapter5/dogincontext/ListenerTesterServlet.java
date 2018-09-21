package chapter5.dogincontext;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ListenerTesterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("test context attributes set by listener<br>");
        out.println("<br>");
        Dog dog = (Dog) getServletContext().getAttribute("dog");
        out.println("The breed is " + dog.getBreed());
    }
}
