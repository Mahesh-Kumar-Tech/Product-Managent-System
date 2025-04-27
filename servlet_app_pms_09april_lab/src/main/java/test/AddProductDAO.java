package test;

import java.sql.*;
public class AddProductDAO {
	public int k=0;
    public int insert(ProductBean pb) {
        try {
            Connection con = DBConnection.getCon();
            PreparedStatement ps = con.prepareStatement
            		("INSERT INTO product40 VALUES(?,?,?,?)");
            
            ps.setString(1, pb.getpCode());
			ps.setString(2, pb.getpName());
			ps.setDouble(3, pb.getpPrice());
			ps.setLong(4, pb.getpStock());

            k = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

}
