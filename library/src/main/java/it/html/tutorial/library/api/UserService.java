package it.html.tutorial.library.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.hibernate.Session;

import it.html.tutorial.library.model.User;
import it.html.tutorial.library.util.Factory;

@Path("user")
public class UserService {
	
	    @GET
	    public List<User> readUser() {
	    	List<User> list=new ArrayList<User>();
	    	Session session = (Factory.getSessionFactory()).openSession();
			list=session.createCriteria(User.class).list();
			session.close();
			return list;
	    }
	    
	    @POST
	    public String insertUser(User user) {
	    	try {
	    	Session session = (Factory.getSessionFactory()).openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			session.close();
			return "Inserimento OK";
	    	}
	    	catch(Exception exc) {
	    		exc.printStackTrace();
	    		return "Inserimento fallito";
	    	}
	    }

}
