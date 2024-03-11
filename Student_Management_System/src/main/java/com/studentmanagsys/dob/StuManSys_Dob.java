package com.studentmanagsys.dob;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StuManSys_Dob {

	public static void main(String[] args) {
		 String url = "jdbc:postgresql://localhost:5432/Student";
	        String user = "postgres";
	        String password = "root";
	        
	        try {
				Class.forName("org.postgresql.Driver");
				 Connection connection = DriverManager.getConnection(url, user, password);
		            Statement statement = connection.createStatement();
		            
		            String sqlQuery = "YOUR_SQL_QUERY_HERE";
		            statement.executeUpdate(sqlQuery); 
		            statement.close();
		            connection.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
