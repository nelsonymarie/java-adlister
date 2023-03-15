package LoginServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
        } else {
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");
        HttpSession session = request.getSession();

        if (validAttempt) {
            session.setAttribute("user", true);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }

        System.out.println("2session.getAttribute(\"user\") = " + request.getSession().getAttribute("user"));


    }
}