package test;

import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewAllProductServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException,IOException{
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired..<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}else {
			ArrayList<ProductBean> aL = new ViewAllProductDAO().retrieve();
			hs.setAttribute("aList",aL);
			
			req.getRequestDispatcher("ViewAllProduct.jsp").forward(req, res);
		}
		
	}

}
