import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Main {
    public static void main(String[] args) throws Exception {
        int port = 8080;

        Server server = new Server(port);

        ServletContextHandler handler = new ServletContextHandler();
        handler.setContextPath("/");

        // HelloServlet
        ServletHolder helloHolder = handler.addServlet(HelloServlet.class, "/hello");
        helloHolder.setInitOrder(1);

        // CountServlet
        ServletHolder countHolder = handler.addServlet(CountServlet.class, "/count");
        countHolder.setInitOrder(2);

        server.setHandler(handler);

        server.start();
        server.join();
    }
}
