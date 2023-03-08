import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("name");
        if (name != null && !name.isEmpty()) {
            resp.getWriter().write("<h1>Hello, " + name + "!</h1>");
        } else {
            resp.getWriter().write("<h1>Hello, World!</h1>");
        }
    }
}
