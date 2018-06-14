package Util;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class SqlConnection {

	public static Connection getConnection() {
		try {
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/TestDB");
		Connection conn = ds.getConnection();
		System.out.println("Connessione eseguita");
		return conn;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
