package chapter8.firstexample;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Person p = new Person();
//        p.setName("Paul");
//        req.setAttribute("person", p);

        req.getRequestDispatcher("chapter8.jsp").forward(req, resp);
    }

}
