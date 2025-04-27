package test;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditProductServlet extends HttpServlet
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
			ArrayList<ProductBean> aL = (ArrayList<ProductBean>)hs.getAttribute("aList");
    		String pCode = req.getParameter("pcode");
    		Iterator<ProductBean> it = aL.iterator();
    		while(it.hasNext()) {
    			ProductBean pb = (ProductBean)it.next();
    			if(pCode.equals(pb.getpCode())) {
    				req.setAttribute("pbean", pb);
    				req.getRequestDispatcher("EditProducts.jsp").forward(req, res);
    				break;
    			}//end of if
    		}//end of loop
    	}
    }
}
