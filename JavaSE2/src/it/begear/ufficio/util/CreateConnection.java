package it.begear.ufficio.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {
	private static CreateConnection istanzaCreateConnection =null;
	private static String dbURL = "jdbc:mysql://localhost:3306/DB-Impiegati";
	private static String username = "root";
	private static String password = "root";
	private static Connection conn;

	private CreateConnection() {}


	public Connection createConnection(){

		try {
			conn = DriverManager.getConnection(dbURL, username, password);

			if (conn != null) {
				System.out.println("Connected");
			}
		} 
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		return conn;
	}

	public static CreateConnection getIstanzaCreateConnection() {
		if(istanzaCreateConnection==null) {
			istanzaCreateConnection=new CreateConnection();
		}
		return istanzaCreateConnection;
	}

}
