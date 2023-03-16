import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/ads")
public class AdServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ListAdsDao dao = new ListAdsDao();
        List<Ad> ads = dao.all();
        request.setAttribute("ads", ads);

        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
    }
}

