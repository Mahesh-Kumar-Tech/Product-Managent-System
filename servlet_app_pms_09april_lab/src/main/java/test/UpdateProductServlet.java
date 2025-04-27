package test;

import java.io.*;
import java.util.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession hs = req.getSession(false);
		if (hs == null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		} else {
			ArrayList<ProductBean> aL = (ArrayList<ProductBean>) hs.getAttribute("aList");
			String pCode = req.getParameter("pcode");
			Iterator<ProductBean> it = aL.iterator();
			while (it.hasNext()) {
				ProductBean pb = (ProductBean) it.next();
				if (pCode.equals(pb.getpCode())) {
					pb.setpPrice(Float.parseFloat(req.getParameter("pprice")));
					pb.setpStock(Integer.parseInt(req.getParameter("pstock")));
					int k = new UpdateProductsDAO().update(pb);
					if (k > 0) {
						req.setAttribute("msg", "Product Updated Successfully...<br>");
						req.getRequestDispatcher("UpdateProducts.jsp").forward(req, res);
					}//end of if
					break;
				}//end of if
			}//end of while loop
		}//end of else

	}
}
