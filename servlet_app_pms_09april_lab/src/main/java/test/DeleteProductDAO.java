package test;

import java.sql.*;

public class DeleteProductDAO {
	public int k = 0;

	public int delete(String pCode) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
					("delete from Product40 where ProductCode=?");
			ps.setString(1, pCode);
			k = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}