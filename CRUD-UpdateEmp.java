package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Updateemp {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sample";
		String username = "root";
		String password = "root";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "UPDATE emptable SET emp_id=?,emp_name=? WHERE emp_sal=?";
		    String sql1="UPDATE emptable SET emp_id=?,emp_name=? WHERE emp_sal=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "897");
		    statement.setString(2, "rooja");
		    statement.setString(3, "20000");
		  
		    
		    PreparedStatement statement1 = conn.prepareStatement(sql);
		    statement.setString(1, "512");
		    statement.setString(2, "pooja");
		    statement.setString(3, "60000");
		  
		     
		     int rowsUpdated = statement.executeUpdate();
		     int rowsUpdated1 = statement.executeUpdate();

		    if (rowsUpdated > 0) {
		        System.out.println("An existing first employee was updated successfully!");
		    }
		    if (rowsUpdated > 0) {
		        System.out.println("An existing second employee was updated successfully!");
		    }

		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	

}
