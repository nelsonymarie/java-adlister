package pizzaOrders;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizzaOrderForm.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String crustType = request.getParameter("crustType");
        String sauceType = request.getParameter("sauceType");
        String sizeType = request.getParameter("sizeType");
        String[] toppings = request.getParameterValues("toppings");
        String deliveryAddress = request.getParameter("deliveryAddress");

        System.out.println("Crust Type: " + crustType);
        System.out.println("Sauce Type: " + sauceType);
        System.out.println("Size Type: " + sizeType);
        System.out.println("Toppings: " + Arrays.toString(toppings));
        System.out.println("Delivery Address: " + deliveryAddress);

        response.sendRedirect("/pizza-order");
    }
}
