package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import Model.Login;
import Model.Utente;

public class CrudLogin {
	private static Connection conn;
	private static PreparedStatement stmt;  
	private static ResultSet rs;
	protected static SessionFactory sessionFactory;

	private static void setup() {

		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception ex) {
			ex.printStackTrace ();
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	private static void exit() {
		sessionFactory.close();
	}

	public static String createLogin(Utente usr,Login lgn){
		Session session=null;
		try {
			CrudLogin.setup();
			session = sessionFactory.openSession();
			session.beginTransaction();
			if((session.get(Login.class, lgn.getUsername())) != null) {

				return "Inserimento non riuscito.Username non disponibile";
			}
			session.save(lgn);
			session.save(usr);

			session.getTransaction().commit();
		}
		catch (Exception exc) {
			exc.printStackTrace();
			return "Inserimento non riuscito. Problema di connessione.";
		}
		finally {
			session.close();
			CrudLogin.exit();
		}
		return "Inserimento riuscito";
	}

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

	public static List<Utente> readListUtente(){
		List<Utente> usrList=new ArrayList<>();
		try {
			conn = SqlConnection.getConnection();
			stmt = conn.prepareStatement("SELECT * FROM Utente");
			rs = stmt.executeQuery();
			while(rs.next()) {
				usrList.add(new Utente(rs.getString("Username"),rs.getString("Nome"),rs.getString("Cognome"),rs.getString("Compleanno")));
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

