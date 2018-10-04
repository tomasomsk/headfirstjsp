package chapter13;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class BeerRequestFilter {

    private FilterConfig fc;

    public void init(FilterConfig config) throws ServletException {
        this.fc = config;
    }

    public void doFilter(ServletRequest req,
                         ServletResponse resp,
                         FilterChain chain)
            throws ServletException, IOException {
        HttpServletRequest httpReq = (HttpServletRequest) req;
        String name = httpReq.getRemoteUser();
        if (name != null) {
            fc.getServletContext().log("User " + name + " is updating");
        }
        chain.doFilter(req, resp);
    }

    public void destroy() {
// do cleanup stuff
    }

}
