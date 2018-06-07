package it.begear.example.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Statement;

import it.begear.example.model.User;
import it.begear.example.util.CreateConnection;

public class Crud
{
	private static Connection conn;	
	private static Crud istanzaCrud=null;
	
	private Crud() {
		
	}

	public void insertUser(User utente){
		conn=CreateConnection.getIstanzaCreateConnection().createConnection();
		System.out.println("Insert User");
	    
		String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";

		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, utente.getUsername());
			preparedStatement.setString(2, utente.getPassword());
			preparedStatement.setString(3, utente.getFullname());
			preparedStatement.setString(4, utente.getEmail());

			int rowsInserted = preparedStatement.executeUpdate();
			
			ResultSet rs = preparedStatement.getGeneratedKeys();
			rs.next();
			utente.setUser_id(rs.getInt(1));
			
			if (rowsInserted > 0) {
				System.out.println("Nuovo utente inserito!");
			}
		}
		catch (SQLException e) {
			System.out.println("Catch of insertUser");
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
				System.out.println("Connection close: insertUser");
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	

	public void searchUsers(){
		conn=CreateConnection.getIstanzaCreateConnection().createConnection();
		System.out.println("Search User");
		String sql = "SELECT * FROM Users";
		try 
		{
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			ResultSet result = preparedStatement.executeQuery();

			int count = 0;

			while (result.next())
			{
				String name = result.getString(2);
				String pass = result.getString(3);
				String fullname = result.getString("fullname");
				String email = result.getString("email");
				String output = "User #%d: %s - %s - %s - %s";
				System.out.println(String.format(output, ++count, name, pass, fullname, email));
			} 
		}
		catch (SQLException e) {
			System.out.println("Catch of searchUsers");
			e.printStackTrace();
		}
		finally{
			try 
			{
				conn.close();
				System.out.println("Connection close: searchUsers");
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void updateUser(String username) {
		conn=CreateConnection.getIstanzaCreateConnection().createConnection();
		System.out.println("Update User");
		String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE username=?";
		
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, "123456789");
			prepareStatement.setString(2, "William Henry Bill Gates");
			prepareStatement.setString(3, "bill.gates@microsoft.com");
			prepareStatement.setString(4, username);

			int rowsUpdated = prepareStatement.executeUpdate();
			if (rowsUpdated == 0) {
				System.out.println("Utente non trovato");
			}else if(rowsUpdated>0) {
				System.out.println("Aggiornamento eseguito");
				System.out.println("Righe aggiornate: "+rowsUpdated);
			}
		} catch (SQLException e) {
			System.out.println("Catch of updateUser");
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
				System.out.println("Connection close: updateUser");
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}	
	}

	public void deleteUser(String username){
		conn=CreateConnection.getIstanzaCreateConnection().createConnection();
		System.out.println("Delete User");
		String sql = "DELETE FROM Users WHERE username=?";

		PreparedStatement prepareStatement;
		try {
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, username);

			int rowsDeleted = prepareStatement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A user was deleted successfully!");
			}
		} catch (SQLException e) {
			System.out.println("Catch of deleteUser");
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
				System.out.println("Connection close: deleteUser");
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public static Crud getInstanzaCrud() {
		if(istanzaCrud==null) {
			istanzaCrud=new Crud();
		}
		return istanzaCrud;
	}
	
	public User readUser(User utenteApp){
		User utente = null;
		conn=CreateConnection.getIstanzaCreateConnection().createConnection();
		System.out.println("Read User");
		
		String sql = "SELECT * FROM Users WHERE user_id=?";
		try 
		{
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, utenteApp.getUser_id());
			ResultSet result = preparedStatement.executeQuery();
			while(result.next()) {
				int user_id = result.getInt(1);
				String user = result.getString(2);
				String pass = result.getString(3);
				String fullname = result.getString(4);
				String email = result.getString(5);
				utente=new User(user_id,user,pass,fullname,email);
			}
	
		}
		catch (SQLException e) {
			System.out.println("Catch of readUsers");
			e.printStackTrace();
		}
		finally{
			try 
			{
				conn.close();
				System.out.println("Connection close: readUsers");
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return utente;	
	}

}
