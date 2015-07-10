package myapp;

import java.io.IOException;
import javax.servlet.http.*;

public class DemoServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("{ \"name\": \"GET METHOD\" }");
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("{ \"name\": \"POST METHOD\" }");
    }
    @Override
    public void doPut(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("{ \"name\": \"PUT METHOD\" }");
    }
    @Override
    public void doDelete(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("{ \"name\": \"DELETE METHOD\" }");
    }
}
