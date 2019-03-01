package dao;

import java.sql.*;

public class DbAdapter {
	
	/*- Variables ---------------------------------------- */
	String jdbUrl = "jdbc:postgresql://localhost:5432/agreements";
	String username = "postgres";
	String password = "postgre";
	
	/* Database variables --------------------------------- */
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	/* Constructor ----------------------------------------- */
	public DbAdapter() {
		
	}
	
	public void connect (){
		// Connect to DB
		try {
			conn = DriverManager.getConnection(jdbUrl, username, password);
			
			// Pront sucess
			System.out.println("Database connection established");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // connect
	
	public void disconnect() {
		try {
			if (stmt != null) {
				stmt.close();
			}
			
			if (rs != null) {
				rs.close();
			}
			
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	} // disconnect

}
