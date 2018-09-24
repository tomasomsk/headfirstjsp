package chapter3.beer.web;

import chapter3.beer.model.BeerExpert;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class BeerSelect extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String c = request.getParameter("color");
        BeerExpert beerExpert = new BeerExpert();
        List<String> result = beerExpert.getBrands(c);
        request.setAttribute("styles", result);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
