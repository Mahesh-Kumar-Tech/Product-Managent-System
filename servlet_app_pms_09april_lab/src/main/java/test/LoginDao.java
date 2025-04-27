package test;

import java.sql.*;

public class LoginDao {

	public AdminBean ab = null;

	public AdminBean getLogin(String fullname, String password) {

		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
					("select * from admin40 where fullname=? and password=?");
			ps.setString(1, fullname);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ab = new AdminBean();
				
				ab.setaFullName(rs.getString(1));
				ab.setaEmail(rs.getString(2));
				ab.setaPhoneNo(rs.getLong(3));
				ab.setaPassword(rs.getString(4));
				ab.setaCPassword(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ab;

	}

}
