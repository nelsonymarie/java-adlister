



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowAdServlet", urlPatterns = "/ads/show")
public class ShowAdServlet extends HttpServlet {

    private Ads adsDao;

    @Override
    public void init() throws ServletException {
        DaoFactory daoFactory = new DaoFactory();
        adsDao = daoFactory.getAdsDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // get ad id from request
        Long id = Long.parseLong(request.getParameter("id"));

        // get ad by id from dao
        Ad ad = adsDao.findById(id);

        // set ad as request attribute and forward to jsp
        request.setAttribute("ad", ad);
        request.getRequestDispatcher("/WEB-INF/ads/show.jsp").forward(request, response);
    }
}
