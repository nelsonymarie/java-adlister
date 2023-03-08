import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CountServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger(CountServlet.class.getName());
    private final AtomicInteger count = new AtomicInteger(0);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        HttpSession session = req.getSession(true);
        Integer sessionCount = (Integer) session.getAttribute("count");
        if (sessionCount == null) {
            sessionCount = 0;
        }
        sessionCount++;
        session.setAttribute("count", sessionCount);
        int totalCount = count.incrementAndGet();
        resp.getWriter().write("<h1>Total page views: " + totalCount + "</h1>");
        resp.getWriter().write("<h2>Session page views: " + sessionCount + "</h2>");
        logger.log(Level.INFO, "Total page views: {0}", totalCount);
    }
}
