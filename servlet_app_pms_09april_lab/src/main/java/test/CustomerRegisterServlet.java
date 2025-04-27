package test;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/cregister")
public class CustomerRegisterServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException,IOException{
		CustomerBean cb =new CustomerBean();
		cb.setcUserName(req.getParameter("cuname"));
		cb.setcPassword(req.getParameter("cpass"));
		cb.setcFirstName(req.getParameter("cfname"));
		cb.setcLastName(req.getParameter("clname"));
		cb.setcMailId(req.getParameter("cmid"));
		cb.setcPhNo(Long.parseLong(req.getParameter("cphno")));
		
		int k=new CustRegisterDAO().register(cb);
		if(k>0) {
			req.getRequestDispatcher("CustRegister.jsp").forward(req, res);
		}else {
		    req.setAttribute("msg", "Registration Failed!");
		    req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		
	}

}
