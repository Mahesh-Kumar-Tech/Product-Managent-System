package test;

import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/addq")
public class BuyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        HttpSession hs = req.getSession(false);
        
        if (hs == null) {
            req.setAttribute("msg", "Session Expired..<br>");
            req.getRequestDispatcher("msg.jsp").forward(req, res);
            return;
        }
        
        // Handling qty parameter safely
        int qty = 0;
        try {
            qty = Integer.parseInt(req.getParameter("qty"));
        } catch (NumberFormatException e) {
            req.setAttribute("msg", "Invalid quantity entered. Please enter a valid number.");
            req.getRequestDispatcher("msg.jsp").forward(req, res);
            return;
        }

        String pCode = req.getParameter("pcode");
        
        // Retrieving products list from session
        ArrayList<ProductBean> products = (ArrayList<ProductBean>) hs.getAttribute("aList");

        // Check if products list exists
        if (products == null) {
            req.setAttribute("msg", "No products available.");
            req.getRequestDispatcher("msg.jsp").forward(req, res);
            return;
        }

        // Find the product matching the pCode
        ProductBean pb = null;
        for (ProductBean p : products) {
            if (pCode.equals(p.getpCode())) {
                pb = p;
                break;
            }
        }

        // If product is found, forward to the bill page, else show error
        if (pb != null) {
            req.setAttribute("pbean", pb);
            req.setAttribute("rqty", qty);
            req.getRequestDispatcher("productbill.jsp").forward(req, res);
        } else {
            req.setAttribute("msg", "Product not found.");
            req.getRequestDispatcher("msg.jsp").forward(req, res);
        }
    }
}
