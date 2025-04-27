package test;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/aregister")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException,IOException{
		AdminBean ab =new AdminBean();
		ab.setaFullName(req.getParameter("aname"));
		ab.setaEmail(req.getParameter("amid"));
		ab.setaPhoneNo(Long.parseLong(req.getParameter("aphno")));
		ab.setaPassword(req.getParameter("apas"));
		ab.setaCPassword(req.getParameter("acpas"));
		
		int k=new RegisterDao().register(ab);
		if(k>0) {
			req.getRequestDispatcher("Register.jsp").forward(req, res);
		}else {
		    req.setAttribute("msg", "Registration Failed!");
		    req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		
	}

}
