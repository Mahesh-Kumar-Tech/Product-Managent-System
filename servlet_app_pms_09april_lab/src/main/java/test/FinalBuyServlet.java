package test;

import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@WebServlet("/finalBuy")
public class FinalBuyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        HttpSession hs = req.getSession(false);
        if (hs == null) {
            req.setAttribute("msg", "Session Expired..<br>");
            req.getRequestDispatcher("msg.jsp").forward(req, res);
            return;
        }
        int rqty = Integer.parseInt(req.getParameter("rqty"));
        String pCode = req.getParameter("pcode");
        
        int k = new BuyProductDAO().buyProduct(rqty, pCode);
        if(k>0) {
        	req.setAttribute("msg", "Payment Successfully Completed");
        	req.getRequestDispatcher("psuccess.jsp").forward(req, res);
        	
        }else {
        	req.setAttribute("msg", "Payment is not Completed");
        	req.getRequestDispatcher("msg.jsp").forward(req, res);
        }
    }
}