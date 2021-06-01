package web;

import dao.ProductDao;
import model.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/save-product", name = "saveProduct")
public class ProductController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String productName = (String)request.getParameter("productName");
        String price = (String)request.getParameter("price");
        ProductDao productDao = new ProductDao();

        // validate
        if(price.length() <= 0 || productName.length() <= 0){
            out.println("<h1>Product name or price must not be empty</h1>");
        }else {
            // save the product
            Product product = new Product(productName, price);
            productDao.saveProduct(product);
            out.println("<h1>Saved!</h1>");
        }
    }
}
