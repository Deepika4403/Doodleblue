package com.jdbc.learning;

import java.sql.*;

public class JdbcUpdateTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;

		 String query2 = "ALTER TABLE store Drop owner_name";
	      

		try {
			// get connection
			conn = DBConnect.getConnection();

			// create statement
			statement = conn.createStatement();

			int count = statement.executeUpdate(query2);
			System.out.println("count: " + count);

			// close connection
			statement.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
