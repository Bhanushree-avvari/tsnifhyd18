package employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertemp {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sample";
		String username = "root";
		String password = "root";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "INSERT INTO emptable(emp_id, emp_name,emp_sal)VALUES(?,?,?)";
		    String sql1="INSERT INTO emptable(emp_id, emp_name,emp_sal)VALUES(?,?,?)";
		    String sql2="INSERT INTO emptable(emp_id, emp_name,emp_sal)VALUES(?,?,?)";
		    String sql3="INSERT INTO emptable(emp_id, emp_name,emp_sal)VALUES(?,?,?)";

		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "bhanu 567");
		    statement.setString(2, "bhanushree");
		    statement.setString(3, "80000");
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "rani 123");
		    statement.setString(2, "rani kumari");
		    statement.setString(3, "50000");
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "pavani 786");
		    statement.setString(2, "pavani sri");
		    statement.setString(3, "70000");
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "pallavi 345");
		    statement.setString(2, "pallavi");
		    statement.setString(3, "40000");

		     int rowsInserted = statement.executeUpdate();
		    int rowsInserted1= statement1.executeUpdate();
		    int rowsInserted2 = statement2.executeUpdate();
		    int rowsInserted3 = statement3.executeUpdate();
		    
		    		if (rowsInserted > 0) {
		        System.out.println("first employee was inserted successfully!");
		    }
		    		if (rowsInserted > 0) {
				        System.out.println("second employee was inserted successfully!");
				    }
		    		if (rowsInserted > 0) {
				        System.out.println("third employee was inserted successfully!");
				    }
		    		if (rowsInserted > 0) {
				        System.out.println("fourth employee was inserted successfully!");
				    }


		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}
