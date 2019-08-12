package exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Account {

	public Connection getConn() throws SQLException {

		String url = "jdbc:mysql";
		String user = "asdf";
		String password = "1234";
		Connection conn = null;
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	}

	public void withdraw(int amount) throws SQLException {
		getConn();
	}

}
