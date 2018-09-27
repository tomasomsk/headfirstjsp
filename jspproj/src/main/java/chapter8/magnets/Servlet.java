package chapter8.magnets;

import chapter5.dogincontext.Dog;
import chapter8.propertyofproperty.Person;
import chapter8.propertyofproperty.Toy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Person p = new Person();
        p.setName("Leelu");
        Dog d = new Dog("poudel");
        d.setName("Clyde");
        Toy t1 = new Toy();
        t1.setName("stick");
        Toy t2 = new Toy();
        t2.setName("neighbor’s cat");
        Toy t3 = new Toy();
        t3.setName("Barbie™ doll head");
        d.setToys(new Toy[]{t1, t2, t3});
        p.setDog(d);
        req.setAttribute("person", p);

        req.getRequestDispatcher("chapter8magnets.jsp").forward(req, resp);
    }
}
