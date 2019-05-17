package sql_operation_examples;

//Step1. Import required packages
import java.sql.*;

public class CreateDB {
	//JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/";
	
	//Database credentials
	static final String USER = "root";
	static final String PASS = "Zakir@12345";
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//Step 2. Register JDBC driver
			Class.forName(JDBC_DRIVER);
			
			//Step 3. Open connection
			System.out.println("Connecting to Database..");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			//Step 4. Execute query
			System.out.println("Creating Database..");
			stmt = conn.createStatement();
			
			String sql = "CREATE DATABASE STUDENTS";
			stmt.execute(sql);
			
			System.out.println("Database created successfully.");
		}
		//Note: First SQLException catch should be placed.
		catch (SQLException se) {
			//Handle errors for JDBC
			se.printStackTrace();
		}
		catch(Exception e) {
			//Handle errors for Class.forName
			e.printStackTrace();
		}
		finally {
			//finally block used to close resources
			try {
				if(stmt!=null) {
					stmt.close();
				}
			}
			catch (SQLException se) {
			}//nothing to do.
			try {
				if(conn!=null) {
					conn.close();
				}
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		}
		System.out.println("Check the Database. Good Bye!");
	}

}
