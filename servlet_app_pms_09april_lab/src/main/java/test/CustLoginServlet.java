package test;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/clogin")
public class CustLoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String name=req.getParameter("cuname");
		String pas=req.getParameter("cpass");
		
		CustomerBean cb=new CustLoginDAO().getLogin(name, pas);
		
		if(cb==null)
		{
			req.setAttribute("msg", "Invalid Login..");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		}
		else {
			HttpSession hs = req.getSession();
			hs.setAttribute("cbean", cb);
			req.getRequestDispatcher("loginSuccess.jsp").forward(req, resp);
		}
		
	}

}
