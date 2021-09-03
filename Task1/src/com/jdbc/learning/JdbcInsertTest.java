package com.jdbc.learning;
import java.sql.*;

public class JdbcInsertTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;

		String query1 = "INSERT INTO STORE " + "VALUES ('store5', 'dev','97890687465','bobbili','2000-07-09')";

		try {
			// get connection
			conn = DBConnect.getConnection();

			// create statement
			statement = conn.createStatement();

			int count = statement.executeUpdate(query1);
			System.out.println("count: " + count);

			// close connection
			statement.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}