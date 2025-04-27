package test;

import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@WebServlet("/buy")
public class CustBuyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        HttpSession hs = req.getSession(false);
        if (hs == null) {
            req.setAttribute("msg", "Session Expired..<br>");
            req.getRequestDispatcher("msg.jsp").forward(req, res);
            return;
        }

        String pCode = req.getParameter("pcode");
        @SuppressWarnings("unchecked")
        ArrayList<ProductBean> products = (ArrayList<ProductBean>) hs.getAttribute("aList");

        if (products == null) {
            req.setAttribute("msg", "No products available.<br>");
            req.getRequestDispatcher("msg.jsp").forward(req, res);
            return;
        }

        ProductBean pb = null;
        for (ProductBean p : products) {
            if (pCode.equals(p.getpCode())) {
                pb = p;
                break;
            }
        }

        if (pb != null) {
            req.setAttribute("pbean", pb);
            req.getRequestDispatcher("custbuy.jsp").forward(req, res);
        } else {
            req.setAttribute("msg", "Product not found.<br>");
            req.getRequestDispatcher("msg.jsp").forward(req, res);
        }
    }
}
