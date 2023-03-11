package GuessingGame;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/guess")
public class GuessServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int guess = Integer.parseInt(request.getParameter("guess"));
        if (guess == 1 || guess == 2 || guess == 3) {
            if (guess == (int)(Math.random() * 3) + 1) {
                response.sendRedirect("correct");
            } else {
                response.sendRedirect("incorrect");
            }
        } else {
            response.sendRedirect("guess");
        }
    }
}
