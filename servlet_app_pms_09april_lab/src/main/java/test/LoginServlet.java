package test;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/alogin")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String name=req.getParameter("aname");
		String pas=req.getParameter("apas");
		
		AdminBean ab=new LoginDao().getLogin(name, pas);
		
		if(ab==null)
		{
			req.setAttribute("msg", "Invalid Login..");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		}
		else {
			HttpSession hs = req.getSession();
			hs.setAttribute("abean", ab);
			req.getRequestDispatcher("Login.jsp").forward(req, resp);
		}
		
	}

}
