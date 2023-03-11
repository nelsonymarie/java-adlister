//package LoginServlet;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.Random;
//
//@WebServlet("/login")
//public class LoginServlet extends HttpServlet {
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        if (username.equals("admin") && password.equals("password")) {
//            response.sendRedirect("profile.jsp");
//        } else {
//            request.setAttribute("errorMessage", "Invalid username or password");
//            request.getRequestDispatcher("login.jsp").forward(request, response);
//        }
//    }
//}
//
//@WebServlet("/ads")
//
//public class AdsServlet extends HttpServlet {
//
//    private ListAdsDao listAdsDao = new ListAdsDao();
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        List<Ad> ads = listAdsDao.all();
//        request.setAttribute("ads", ads);
//
//        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
//    }
//}
//


package LoginServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("profile.jsp");
        } else {
            request.setAttribute("errorMessage", "Invalid username or password");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}

class ListAdsDao {
    public static List<Ad> all() {
        // Replace this with actual implementation
        return null;
    }
}

class Ad {
    private final String title;
    private final String description;
    private final int price;

    public Ad(String title, String description, int price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
