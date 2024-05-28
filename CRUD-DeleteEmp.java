package employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sample";
		String username = "root";
		String password = "root";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "DELETE FROM emptable WHERE emp_id=?";
		    String sql1="DELETE FROM emptable WHERE emp_id=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    PreparedStatement statement =  conn.prepareStatement(sql1);
		    
		    statement.setString(1, "567");
		    statement.setString(2,"123");
		     
		    int rowsDeleted = statement.executeUpdate();
		    int rowsDeleted1 = statement.executeUpdate();
		    
		    if (rowsDeleted > 0) {
		        System.out.println("first employee was deleted successfully!");
		    }
		    if (rowsDeleted > 0) {
		        System.out.println("second employee was deleted successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	

}
