package it.begear.example.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

import it.begear.example.dao.DaoDipartimento;
import it.begear.ufficio.model.Dipartimento;
import it.begear.ufficio.util.CreateConnection;
import it.begear.ufficio.util.MioLog;

public class CrudDipartimento implements DaoDipartimento{

	private static Connection conn;	

	public CrudDipartimento() {
		super();
		MioLog.getIstanzaMioLogger().log(Level.INFO,"Creato CrudDipartimento");
	}

	@Override
	public void createDipartimento(Dipartimento dip) {
		conn=CreateConnection.getIstanzaCreateConnection().createConnection();
		System.out.println("Create Dipartimento");
		String sql = "INSERT INTO Dipartimento (Nome, Indirizzo, Citta) VALUES (?, ?, ?)";

		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, dip.getNome());
			prepareStatement.setString(2, dip.getIndirizzo());
			prepareStatement.setString(3, dip.getCitta());

			int rowsInserted = prepareStatement.executeUpdate();

			if (rowsInserted > 0) {
				System.out.println("New Dipartimento create!");
			}
		}
		catch (SQLException e) {
			System.out.println("Problem to createDipartimento");
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
				System.out.println("Connection close: createDipartimento");
			} 
			catch (SQLException e) {
				System.out.println("Connection close problem: createDipartimento");
				e.printStackTrace();
			}
		}	
	}

	@Override
	public void readDipartimento() {
		conn=CreateConnection.getIstanzaCreateConnection().createConnection();
		System.out.println("Read Diaprtimento");
		String sql = "SELECT * FROM Dipartimento";
		try 
		{
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			ResultSet result = preparedStatement.executeQuery();

			System.out.println("Nome "+"Indirizzo "+"Citta ");
			while (result.next())
			{
				String nome = result.getString(1);
				String indirizzo = result.getString(2);
				String citta = result.getString(3);
				String output = "%s - %s - %s";
				System.out.println(String.format(output, nome, indirizzo, citta));
			} 
		}
		catch (SQLException e) {
			System.out.println("Problem to readDipartimento");
			e.printStackTrace();
		}
		finally{
			try 
			{
				conn.close();
				System.out.println("Connection close: readDipartimento");
			} 
			catch (SQLException e) {
				System.out.println("Connection close problem: readDipartimento");
				e.printStackTrace();
			}
		}

	}

	@Override
	public void updateDipartimento(Dipartimento dip) {
		conn=CreateConnection.getIstanzaCreateConnection().createConnection();
		System.out.println("Update Dipartimento");
		String sql = "UPDATE Users SET indirizzo=?, citta=? WHERE nome=?";

		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, dip.getIndirizzo());
			prepareStatement.setString(2, dip.getCitta());
			prepareStatement.setString(3, dip.getNome());

			int rowsUpdated = prepareStatement.executeUpdate();
			if (rowsUpdated == 0) {
				System.out.println("Dipartimento not found");
			}else if(rowsUpdated>0) {
				System.out.println("Update done");
				System.out.println("Rows update: "+rowsUpdated);
			}
		} catch (SQLException e) {
			System.out.println("Problem to updateDipartimento");
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
				System.out.println("Connection close: updateDipartimento");
			} 
			catch (SQLException e) {
				System.out.println("Connection close problem: updateDipartimento");
				e.printStackTrace();
			}
		}	

	}

	@Override
	public void deleteDipartimento(String nome) {
		conn=CreateConnection.getIstanzaCreateConnection().createConnection();
		System.out.println("Delete Dipartimento");
		String sql = "DELETE FROM Dipartimento WHERE Nome=?";

		PreparedStatement prepareStatement;
		try {
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, nome);

			int rowsDeleted = prepareStatement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("Dipartimento was deleted successfully!");
			}
		} catch (SQLException e) {
			System.out.println("Problem to deleteDipartimento");
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
				System.out.println("Connection close: deleteDipartimento");
			} 
			catch (SQLException e) {
				System.out.println("Connection close problem: deleteDipartimento");
				e.printStackTrace();
			}
		}

	}
}
