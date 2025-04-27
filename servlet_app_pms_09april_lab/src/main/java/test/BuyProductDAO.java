package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BuyProductDAO {

    public int buyProduct(int rqty, String pcode) {
        int rowsUpdated = 0;
        Connection con = null;
        PreparedStatement ps = null;

        try {
            // Get database connection
            con = DBConnection.getCon();
            
            // Prepare the SQL update statement
            String query = "UPDATE product40 SET productstock = productstock - ? WHERE productcode = ?";
            ps = con.prepareStatement(query);
            
            // Set the parameters
            ps.setInt(1, rqty);
            ps.setString(2, pcode);
            
            rowsUpdated = ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace(); 
        } finally {
            // Close the resources to avoid resource leaks
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();  // Handle exception during resource closing
            }
        }

        return rowsUpdated;  // Return the number of rows updated (should be 1 if successful)
    }
}
