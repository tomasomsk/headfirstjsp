package chapter8.propertyofproperty;

import chapter5.dogincontext.Dog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Person p = new Person();
        p.setName("Sergey");

        Dog d = new Dog("poudel");
        d.setName("Rex");

        p.setDog(d);

        req.setAttribute("person", p);

        Map musicMap = new HashMap();
        musicMap.put("Ambient", "Zero 7");
        musicMap.put("Surf", "Tahiti 80");
        musicMap.put("DJ", "BT");
        musicMap.put("Indie", "Frou Frou");
        req.setAttribute("musicList", musicMap);

        req.setAttribute("fuck", "Ambient");
        
        req.getRequestDispatcher("chapter8propinprop.jsp").forward(req, resp);

    }
}
