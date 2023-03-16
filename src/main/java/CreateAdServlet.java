import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {

    private Ads adsDao;

    @Override
    public void init() throws ServletException {
        DaoFactory daoFactory = new DaoFactory();
        adsDao = daoFactory.getAdsDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ads/create.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // get parameters from request
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        Long userId = 1L; // hardcoded for demonstration purposes; in practice, you would obtain the user ID from the currently logged in user

        // create new ad
        Ad ad = new Ad(title, description, userId);
        adsDao.insert(ad);

        // redirect to ads index page
        response.sendRedirect("/ads");
    }
}
