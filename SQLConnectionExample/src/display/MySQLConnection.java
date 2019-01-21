package display;

import java.sql.*;

public class MySQLConnection {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDatabase","root","Zakir@1627");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
