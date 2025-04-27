package test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/add")
public class AddProductServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		ProductBean pb = new ProductBean();
		pb.setpCode(req.getParameter("pcode"));
		pb.setpName(req.getParameter("pname"));
		pb.setpPrice(Double.parseDouble(req.getParameter("pprice")));
		pb.setpStock(Integer.parseInt(req.getParameter("pstock")));

		int k = new AddProductDAO().insert(pb);
		if (k > 0) {
			req.setAttribute("msg", "Product Added Successfully!<br>");
			RequestDispatcher rd = req.getRequestDispatcher("AddProduct.jsp");
			rd.forward(req, res);
		}
	}

}
