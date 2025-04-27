package test;

import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteProductServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		HttpSession hs = req.getSession(false);
		if (hs == null) {
			req.setAttribute("msg", "Session Expired..<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}else {
			String pCode = req.getParameter("pcode");
			ArrayList<ProductBean> aL =
			(ArrayList<ProductBean>)hs.getAttribute("aList");
			 Iterator<ProductBean> it = aL.iterator();
			while(it.hasNext()) {
				ProductBean pb = (ProductBean)it.next();
				if(pCode.equals(pb.getpCode())) {
					aL.remove(pb);
					int k = new DeleteProductDAO().delete(pCode);
					if(k>0) {
						 req.setAttribute("msg","Product deleted Successfully...<br>");
						 req.getRequestDispatcher("DeleteProduct.jsp").forward(req, res);
					}
					break;
					
				}//end of if

			}
		}
	}
}
