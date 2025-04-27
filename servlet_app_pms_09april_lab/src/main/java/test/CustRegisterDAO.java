package test;
import java.sql.*;
public class CustRegisterDAO {
	public int k=0;
	public int register(CustomerBean cb) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps =con.prepareStatement
					("insert into customer40 values(?,?,?,?,?,?)");
			ps.setString(1, cb.getcUserName());
			ps.setString(2, cb.getcPassword());
			ps.setString(3, cb.getcFirstName());
			ps.setString(4, cb.getcLastName());
			ps.setString(5, cb.getcMailId());
			ps.setLong(6, cb.getcPhNo());
			
			k=ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}

}
