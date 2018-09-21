package chapter6.cookiesExample;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookiesTestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        String username = req.getParameter("username");
        Cookie cookie = new Cookie("username", username);
        cookie.setMaxAge(20*60);
        resp.addCookie(cookie);

        RequestDispatcher view = req.getRequestDispatcher("cookieresult.jsp");
        view.forward(req, resp);
    }
}
