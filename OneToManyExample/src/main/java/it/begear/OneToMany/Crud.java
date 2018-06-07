package it.begear.OneToMany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Crud {
	protected static SessionFactory sessionFactory;

	protected void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();																			
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception ex) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	protected void exit() {
		sessionFactory.close();
	}

	protected void create(){
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Documento documento1=new Documento();
		Documento documento2=new Documento();
		Set<Documento> lista=new HashSet<Documento>();
		Utente utente=new Utente();

		documento1.setFormato("PDF");
		documento1.setTipo("Aziendale");

		documento2.setFormato("PDF");
		documento2.setTipo("Economia");

		utente.setNome("Francesco");
		utente.setCognome("Venezia");
		utente.setDocumenti(lista);

		session.save(documento1);
		session.save(documento2);
		session.save(utente);

		session.getTransaction().commit();
		session.close();

	}

	protected void read() {
		Session session = sessionFactory.openSession();
		int id=1;
		Utente utente=session.get(Utente.class, id);
		System.out.println(utente.getNome());
		System.out.println(utente.getCognome());
		for(Documento tmp: utente.getDocumenti())
			System.out.println(tmp.toString());
		session.close();
	}

	//	protected void update() {
	//		gioco.setTitolo("Planescape Torment");
	//		gioco.setAutore("Bocciato");
	//		gioco.setPrezzo(5000);
	//
	//		Session session = sessionFactory.openSession();
	//		session.beginTransaction();
	//		session.update(gioco);
	//		session.getTransaction().commit();
	//		session.close();
	//	}
	//
	//	protected void delete() {
	//		Session session = sessionFactory.openSession();
	//		session.beginTransaction();
	//		session.delete(gioco);
	//		session.getTransaction().commit();
	//		session.close();
	//	}

	public static void main(String[] args) {
		Crud crud=new Crud();
		crud.setup();
		crud.create();
//		crud.read();
		//		manager.update();
		//		manager.delete();
		crud.exit();
	}

}
