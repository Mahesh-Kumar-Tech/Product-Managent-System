package test;

import java.sql.*;
import java.util.*;
public class ViewAllProductDAO {
	public ArrayList<ProductBean> al = new ArrayList<ProductBean>();
	public ArrayList<ProductBean>retrieve(){
		
		try
		{
			
			Connection con=DBConnection.getCon();
			PreparedStatement ps= con.prepareStatement("select * from product40");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				ProductBean pb= new ProductBean();
				pb.setpCode(rs.getString(1));
				pb.setpName(rs.getString(2));
				pb.setpPrice(rs.getDouble(3));
				pb.setpStock(rs.getLong(4));
				
				al.add(pb);
			}
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		return al;
	}

}
