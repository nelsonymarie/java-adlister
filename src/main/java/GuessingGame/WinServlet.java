package GuessingGame;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



public class WinServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = request.getAttribute("message").toString();
        request.setAttribute("message", message);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/outcome.jsp");
        dispatcher.forward(request, response);
    }

}
