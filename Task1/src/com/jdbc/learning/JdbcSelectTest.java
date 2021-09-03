package com.jdbc.learning;
import java.sql.*;

public class JdbcSelectTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;

		String query = "select * from STORE";

		try {
			// get connection
			conn = DBConnect.getConnection();

			// create statement
			statement = conn.createStatement();

			// execute query
			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				String store_name = rs.getString("store_name");
				String owner_name = rs.getString("owner_name");
				String mobile=rs.getString("mobile");

				System.out.println("storename : " + store_name);
				System.out.println("ownName : " + owner_name);
				System.out.println("mobile : " + mobile);
			}

			// close connection
			statement.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
