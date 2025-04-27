package test;
import java.sql.*;
public class RegisterDao {
	public int k=0;
	public int register(AdminBean ab) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps =con.prepareStatement
					("insert into admin40 values(?,?,?,?,?)");
			ps.setString(1, ab.getaFullName());
			ps.setString(2, ab.getaEmail());
			ps.setLong(3, ab.getaPhoneNo());
			ps.setString(4, ab.getaPassword());
			ps.setString(5, ab.getaCPassword());
			
			k=ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}

}
