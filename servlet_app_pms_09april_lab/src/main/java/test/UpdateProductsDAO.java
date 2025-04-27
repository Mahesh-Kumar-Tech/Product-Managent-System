package test;

import java.sql.*;
public class UpdateProductsDAO {
    public int k=0;
    public int update(ProductBean pb) {
    	try {
    		Connection con = DBConnection.getCon();
    		PreparedStatement ps = con.prepareStatement
    	   ("update Product40 Set PRODUCTPRICE=?,PRODUCTSTOCK=? where PRODUCTCODE=?");
    		
    		ps.setDouble(1, pb.getpPrice());
    		ps.setLong(2, pb.getpStock());
    		ps.setString(3, pb.getpCode());
    		
    		k=ps.executeUpdate();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return k;
    }
}
