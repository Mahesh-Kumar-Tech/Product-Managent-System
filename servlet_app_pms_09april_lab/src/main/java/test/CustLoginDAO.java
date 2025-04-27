package test;

import java.sql.*;

public class CustLoginDAO {

	public CustomerBean cb = null;

	public CustomerBean getLogin(String username, String password) {

		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
					("select * from customer40 where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				cb = new CustomerBean();
				
				cb.setcUserName(rs.getString(1));
				cb.setcPassword(rs.getString(2));
				cb.setcFirstName(rs.getString(3));
				cb.setcLastName(rs.getString(4));
				cb.setcMailId(rs.getString(5));
				cb.setcPhNo(rs.getLong(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cb;

	}

}
