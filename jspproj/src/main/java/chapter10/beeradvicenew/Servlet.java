package chapter10.beeradvicenew;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> colorList = new ArrayList<>();
        colorList.add("light");
        colorList.add("amber");
        colorList.add("brown");
        colorList.add("dark");

        getServletContext().setAttribute("colorList", colorList);

        req.getRequestDispatcher("chapter10newbeer.jsp").forward(req, resp);
    }

}
