package com.studentmanagsys.dob;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionData {
	
	private static Connection connection;
	
	public static Connection getconnection() {
		String url = "jdbc:postgresql://localhost:5432/StudentMS";
		String user = "postgres";
		String password = "root";
		try {
			Class.forName("org.postgresql.Driver");
			try {
				connection = DriverManager.getConnection(url,user,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}

}
