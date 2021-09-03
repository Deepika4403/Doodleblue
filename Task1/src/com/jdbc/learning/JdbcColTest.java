package com.jdbc.learning;
import java.sql.*;
public class JdbcColTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;

		 
		 String query = "Delete from store where store_name='store5'";
	      

		try {
			// get connection
			conn = DBConnect.getConnection();

			// create statement
			statement = conn.createStatement();

			int count = statement.executeUpdate(query);
			System.out.println("count: " + count);

			// close connection
			statement.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();

		}


	}

}
