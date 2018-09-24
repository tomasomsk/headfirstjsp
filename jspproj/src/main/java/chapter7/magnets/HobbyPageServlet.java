package chapter7.magnets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HobbyPageServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("hobby");
        List<String> friends = new ArrayList<>();
        if (name.equals("extreme knitting")) {
            friends.add("fred");
            friends.add("pradip");
            friends.add("Philippe");
        }
        req.setAttribute("friends", friends);
        req.getRequestDispatcher("magnetjsp.jsp").forward(req, resp);
    }
}
