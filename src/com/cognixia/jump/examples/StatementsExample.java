package com.cognixia.jump.examples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

import com.cognixia.jump.jdbc.connection.ConnectionManager;

public class StatementsExample {
	
	public static void main(String[] args) {
		
		try {
			// create connection using ConnectionManager we just made
			Connection conn = ConnectionManager.getConnection();
			
			// Create statement
			Statement stmt = conn.createStatement();
			System.out.println("Created statement");
			
			// execute an update
			int count = stmt.executeUpdate("update student set credits = 85 where student_id = 10000");
			
			System.out.println("Statement returned: " + count);
			
			// STOP HERE, MOVE TO NEXT SLIDE TO DO EXERCISE BELOW
			
			/* ANSWER TO EXCERCISE */
			/*
			
			// execute an update with insert
			count = stmt.executeUpdate("insert into student values(null, 'Delete', 'Student', 'M', '1999-01-09', 0, 10008, 10008)");
			
			System.out.println("Modified " + count + " record(s) with insert statement.");
			
			
			// execute an update with delete
			count = stmt.executeUpdate("delete from student where first_name = 'Delete'");
			
			System.out.println("Modified " + count + " record(s) with delete statement.");
			*/
			
			
			// CUSTOM CODE
			/*
			ResultSet rs = stmt.executeQuery("SELECT * FROM student");
			
			while (rs.next()) {
				int id = rs.getInt(1); // get 1st field
				System.out.println("ID: " + id);
				String firstName = rs.getString(2);
				System.out.println("first name: " + firstName + "\n");
			}*/
			
			// RESULT SET EXERCISE
			/*
			ResultSet rs = stmt.executeQuery("SELECT * FROM student");
			System.out.println("STUDENTS\n--------------------------------");
			while (rs.next()) {
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String fullName = firstName + " " + lastName;
				LocalDate dateOfBirth = LocalDate.parse(rs.getString("date_of_birth"));
				int age = dateOfBirth.until(LocalDate.now()).getYears();
				System.out.println(String.format("Name: %-20s Age: %s", fullName, age));
			}
			*/
			
			// PREPARED STATEMENT EXERCISE
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter class standing (Freshman, Sophomore, Junior, Senior): ");
			String standing = scan.nextLine();
			int low = -1;
			int high = -1;
			if (standing.equalsIgnoreCase("freshman")) {
				low = 0;
				high = 30;
			}
			else if (standing.equalsIgnoreCase("sophomore")) {
				low = 31;
				high = 60;
			}
			else if (standing.equalsIgnoreCase("junior")) {
				low = 61;
				high = 90;
			}
			else if (standing.equalsIgnoreCase("senior")) {
				low = 91;
				high = 120;
			}
			else {
				System.out.println("Not a valid input. Terminating Program...");
			}
			PreparedStatement pstmt = conn.prepareStatement("SELECT first_name, last_name, credits FROM student WHERE credits BETWEEN ? AND ?;");
			pstmt.setInt(1, low);
			pstmt.setInt(2, high);
			ResultSet rs = pstmt.executeQuery();
			System.out.println(standing.toUpperCase()+"\n----------------------------");
			while (rs.next()) {
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String fullName = firstName + " " + lastName;
				int credits = rs.getInt("credits");
				System.out.println(String.format("Name: %-20s Credits: %d", fullName, credits));
			}
			
			
			// close everything
			stmt.close();
			conn.close();
			
		} catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}