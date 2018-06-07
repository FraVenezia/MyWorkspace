package it.begear.example.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

import it.begear.example.dao.DaoImpiegato;
import it.begear.ufficio.model.Impiegato;
import it.begear.ufficio.util.CreateConnection;
import it.begear.ufficio.util.MioLog;

public class CrudImpiegato implements DaoImpiegato {

	private static Connection conn;	

	public CrudImpiegato() {
		super();
		MioLog.getIstanzaMioLogger().log(Level.INFO,"Creato CrudImpiegato");
	}

	@Override
	public void createImpiegato(Impiegato imp) {
		conn=CreateConnection.getIstanzaCreateConnection().createConnection();
		System.out.println("Create Impiegato");
		String sql = "INSERT INTO Impiegato (Nome, Cognome, Dipartimento, Ufficio, Stipendio) VALUES (?, ?, ?, ?, ?)";

		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, imp.getNome());
			prepareStatement.setString(2, imp.getCognome());
			prepareStatement.setString(3, imp.getDipartimento());
			prepareStatement.setInt(4, imp.getUfficio());
			prepareStatement.setInt(5, imp.getStipendio());

			int rowsInserted = prepareStatement.executeUpdate();

			if (rowsInserted > 0) {
				System.out.println("New Impiegato create!");
			}
		}
		catch (SQLException e) {
			System.out.println("Problem to createImpiegato");
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
				System.out.println("Connection close: createImpiegato");
			} 
			catch (SQLException e) {
				System.out.println("Connection close problem: createImpiegato");
				e.printStackTrace();
			}
		}	
	}

	@Override
	public void readImpiegato() {
		conn=CreateConnection.getIstanzaCreateConnection().createConnection();
		System.out.println("Read Impiegato");
		String sql = "SELECT * FROM Impiegato";
		try 
		{
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			ResultSet result = preparedStatement.executeQuery();

			System.out.println("ID_imp "+"Nome "+"Cognome "+"Dipartimento "+"Ufficio "+"Stipendio ");
			while (result.next())
			{
				int id_imp = result.getInt(1);
				String nome = result.getString(2);
				String cognome = result.getString(3);
				String dipartimento = result.getString(4);
				int ufficio = result.getInt(5);
				int stipendio = result.getInt(6);
				String output = "%d - %s - %s - %s - %d - %d";
				System.out.println(String.format(output, id_imp, nome, cognome, dipartimento, ufficio, stipendio));
			} 
		}
		catch (SQLException e) {
			System.out.println("Problem to readImpiegato");
			e.printStackTrace();
		}
		finally{
			try 
			{
				conn.close();
				System.out.println("Connection close: readImpiegato");
			} 
			catch (SQLException e) {
				System.out.println("Connection close problem: readImpiegato");
				e.printStackTrace();
			}
		}
	}

	@Override
	public void updateImpiegato(Impiegato imp) {
		conn=CreateConnection.getIstanzaCreateConnection().createConnection();
		System.out.println("Update Impiegato");
		String sql = "UPDATE Users SET nome=?, cognome=?, dipartimento=?, ufficio=?, stipendio=? WHERE id_imp=?";

		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, imp.getNome());
			prepareStatement.setString(2, imp.getCognome());
			prepareStatement.setString(3, imp.getDipartimento());
			prepareStatement.setInt(4, imp.getUfficio());
			prepareStatement.setInt(5, imp.getStipendio());
			prepareStatement.setInt(6, imp.getId_Imp());

			int rowsUpdated = prepareStatement.executeUpdate();
			if (rowsUpdated == 0) {
				System.out.println("Impiegato not found");
			}else if(rowsUpdated>0) {
				System.out.println("Update done");
				System.out.println("Rows update: "+rowsUpdated);
			}
		} catch (SQLException e) {
			System.out.println("Problem to updateImpiegato");
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
				System.out.println("Connection close: updateImpiegato");
			} 
			catch (SQLException e) {
				System.out.println("Connection close problem: updateImpiegato");
				e.printStackTrace();
			}
		}	
	}

	@Override
	public void deleteImpiegato(int id_imp) {
		conn=CreateConnection.getIstanzaCreateConnection().createConnection();
		System.out.println("Delete Impiegato");
		String sql = "DELETE FROM Impiegato WHERE ID_Imp=?";

		PreparedStatement prepareStatement;
		try {
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setInt(1, id_imp);

			int rowsDeleted = prepareStatement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("Impiegato was deleted successfully!");
			}
		} catch (SQLException e) {
			System.out.println("Problem to deleteImpiegato");
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
				System.out.println("Connection close: deleteImpiegato");
			} 
			catch (SQLException e) {
				System.out.println("Connection close problem: deleteImpiegato");
				e.printStackTrace();
			}
		}	
	}
}
