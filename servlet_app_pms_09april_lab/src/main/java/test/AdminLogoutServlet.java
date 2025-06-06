package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/logout")
public class AdminLogoutServlet extends HttpServlet
{
	@Override
   protected void doGet(HttpServletRequest req,HttpServletResponse res)throws
   ServletException,IOException
   {
	   HttpSession hs = req.getSession(false);
	   if(hs==null) {
		  req.setAttribute("msg", "Session Expired...<br>");
		  req.getRequestDispatcher("msg.jsp").forward(req, res);
	   }else {
		  req.getRequestDispatcher("AdminLogout.jsp").forward(req, res); 
	   }
   }
}
