package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import db.ConnectorMysql;
import model.Utente;

public class UtenteImplDao implements UtenteDao {

	private static UtenteImplDao istance = null;
	Connection conn = null;
	private static Logger logger = Logger.getLogger("Root");

	private UtenteImplDao() {

	}

	public static UtenteImplDao getIstance() {
		if (istance == null) {
			istance = new UtenteImplDao();
		}
		return istance;
	}

	@Override
	public void createUtente(Utente utente) {

		logger.log(Level.WARNING, "Call :  Check utente Method START...");
		if (checkUtente(utente.getUserName())) {

			logger.log(Level.WARNING, "Call : Inser User START");
			conn = ConnectorMysql.getConnection();
			logger.log(Level.WARNING, "Call : Inser User START");
			String sql = "INSERT INTO utente (userName, pass) values (?, ?)";

			PreparedStatement preparedStatement;
			try {

				preparedStatement = conn.prepareStatement(sql);
				preparedStatement.setString(1, utente.getUserName());
				preparedStatement.setString(2, utente.getPass());

				int check = preparedStatement.executeUpdate();
				if (check != 0) {
					logger.log(Level.WARNING, "Utente aggiunto!");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

	}

	@Override
	public void deleteUtente(Utente utente) {

		conn = ConnectorMysql.getConnection();

		String sql = "DELETE FROM utente WHERE userName = ?";

		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, utente.getUserName());

			int check = preparedStatement.executeUpdate();

			if (check != 0) {
				logger.log(Level.WARNING, "Utente eliminato!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public List<Utente> readListUtente() {

		conn = ConnectorMysql.getConnection();
		List<Utente> list = new ArrayList<Utente>();

		String sql = "SELECT * FROM utente";

		try {

			PreparedStatement preparedStatement = conn.prepareStatement(sql);

			ResultSet result = preparedStatement.executeQuery();

			while (result.next()) {
				Utente bucket = new Utente();
				bucket.setUserName(result.getString(1));
				bucket.setPass(result.getString(2));
				list.add(bucket);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				logger.log(Level.WARNING, "Utente letti!");
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	private boolean checkUtente(String nomeUtente) {

		conn = ConnectorMysql.getConnection();

		String sql = "SELECT * FROM utente WHERE userName = ?";

		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, nomeUtente);

			ResultSet result = preparedStatement.executeQuery();

			if (result.next()) {

				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				logger.log(Level.WARNING, "Call :  Check utente Method END...");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;

	}

	public Utente loginUtente(Utente utente) {

		conn = ConnectorMysql.getConnection();

		String sql = "SELECT * FROM utente WHERE userName = ? AND pass = ?";

		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, utente.getUserName());
			preparedStatement.setString(2, utente.getPass());

			ResultSet result = preparedStatement.executeQuery();

			if (result.next()) {

				return utente;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				logger.log(Level.WARNING, "Call :  Check utente Method END...");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;

	}

}
