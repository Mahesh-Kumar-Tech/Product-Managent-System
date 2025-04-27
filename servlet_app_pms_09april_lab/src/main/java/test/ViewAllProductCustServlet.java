package test;

import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta .servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/viewall")
public class ViewAllProductCustServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException,IOException{
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired..<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}else {
			ArrayList<ProductBean> aL = new ViewAllProductDAO().retrieve();
			hs.setAttribute("aList",aL);
			
			req.getRequestDispatcher("ViewAllProductCust.jsp").forward(req, res);
		}
		
	}

}
