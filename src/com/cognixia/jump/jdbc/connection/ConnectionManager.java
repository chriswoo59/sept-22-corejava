package com.cognixia.jump.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	//public static Connection connection = null;	// Not needed anymore, created in GetConnection
	
	private static final String URL = "jdbc:mysql://localhost:3306/university"; // Mac users require this extension to URL: ?serverTimezone=EST5EDT";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	// method for creating connection
	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);			
			System.out.println("Connected.");
			
		} catch(SQLException e) {
			System.out.println("Could not make connection.");
		}
		
		return conn;
	}
	
	// main is only here so we can test our method above
	public static void main(String[] args) {
		Connection conn = ConnectionManager.getConnection();
		
		try {
			conn.close();
			System.out.println("Connection closed.");
			
		} catch(SQLException e) {
			System.out.println("Could not close connection.");
		}
	}
}
