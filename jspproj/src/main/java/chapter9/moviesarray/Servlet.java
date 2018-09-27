package chapter9.moviesarray;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] movies1 = {"Matrix Revolutions", "Kill Bill", "Boondock Saints"};
        String[] movies2 = {"Amelie", "Return of the King", "Mean Girls"};
        java.util.List movieList = new java.util.ArrayList();
        movieList.add(movies1);
        movieList.add(movies2);
        req.setAttribute("movies", movieList);
        req.getRequestDispatcher("chapter9movies.jsp").forward(req, resp);
    }
}
