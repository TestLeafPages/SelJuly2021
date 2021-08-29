package challenges;

import java.sql.*;

public class DataBaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost:3306/training";

		final String user = "root";
		final String pass = "India@123";

		Connection conn = null;

		Statement stmt = null;

		Class.forName(JDBC_DRIVER);
		conn = DriverManager.getConnection(DB_URL, user, pass);

		stmt = conn.createStatement();
		String sql = "select * from persons where personid=300	";

		ResultSet queryResult = stmt.executeQuery(sql);

		while (queryResult.next()) {
			String value = queryResult.getString(1);
			System.out.println(value);
		}

	}

}
