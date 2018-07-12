package ProvHibernate.ProvHibernate.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import ProvHibernate.ProvHibernate.model.Persona;

public class PersonaManager {
	protected static SessionFactory sessionFactory;

	public void setup() {

		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();																				// hibernate.cfg.xml

		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception ex) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	public void exit() {
		sessionFactory.close();
	}


	public void create() {
		Persona pers = new Persona();
		pers.setiD_Pers(1);
		pers.setNome("Francesco");
		pers.setCognome("Venezia");
		pers.setEt‡(31);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(pers);
		session.getTransaction().commit();
		session.close();
	}

	public void read() {
		Session session = sessionFactory.openSession();
		int id = 2;
		
		Persona pers = session.get(Persona.class, id);
		System.out.println("Nome: " + pers.getNome());
		System.out.println("Cognome: " + pers.getCognome());
		System.out.println("Et√†: " + pers.getEt‡());
		session.close();
	}

	public void update() {
		Persona pers = new Persona();
		pers.setiD_Pers(2);
		pers.setNome("Francesco2");
		pers.setCognome("Venezia2");
		pers.setEt‡(311);
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(pers);
		session.getTransaction().commit();
		session.close();
	}

	public void delete() {
		Persona pers = new Persona();
		pers.setiD_Pers(2);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(pers);
		session.getTransaction().commit();
		session.close();
	}
}
