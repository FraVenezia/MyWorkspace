package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Login;

public class CrudLogin {
	private static Connection conn;
	private static PreparedStatement stmt;  
	private static ResultSet rs;

	public static int readLogin(Login usr){
		String usrResult="";
		try {
			conn = SqlConnection.getConnection();
			stmt = conn.prepareStatement("SELECT Password FROM login WHERE Username = ?");
			stmt.setString(1, usr.getUsername());
			rs = stmt.executeQuery();
			while(rs.next()) {
				usrResult=rs.getString("Password");
				if (usr.getPassword().equals(usrResult))
					return 1;
			}
		}
		catch (SQLException e) {
			System.out.println("Problema nel readLogin");
			e.printStackTrace();
		}
		finally
		{
			try {
				System.out.println("Connessione chiusa");
				conn.close();
			}
			catch (SQLException e){
				System.out.println("Problema nella chiusura della connesione");
				e.printStackTrace();
			}
		}

		return 0;
	}

	public static List<Login> readListLogin(){
		List<Login> usrList=new ArrayList<>();
		try {
			conn = SqlConnection.getConnection();
			stmt = conn.prepareStatement("SELECT * FROM login");
			rs = stmt.executeQuery();
			while(rs.next()) {
				usrList.add(new Login(rs.getString("Username"),rs.getString("Password")));
			}
		}
		catch (SQLException e) {
			System.out.println("Problema nel readListLogin");
			e.printStackTrace();
		}
		finally
		{
			try {
				System.out.println("Connessione chiusa");
				conn.close();
			}
			catch (SQLException e){
				System.out.println("Problema nella chiusura della connesione");
				e.printStackTrace();
			}
		}
		return usrList;
	}
}

