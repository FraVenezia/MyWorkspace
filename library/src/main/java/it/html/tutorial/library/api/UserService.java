package it.html.tutorial.library.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

import it.html.tutorial.library.model.User;
import it.html.tutorial.library.util.Factory;
import net.minidev.json.JSONArray;

@Path("user")
public class UserService {

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<User> readUser() {
		List<User> list = new ArrayList<User>();
		Session session = (Factory.getSessionFactory()).openSession();
		list = session.createCriteria(User.class).list();
		session.close();
		return list;
	}

	@GET
	@Path("nomi")
	@Produces({ MediaType.APPLICATION_JSON })
	public String readUserName() {
		String name=null;
		List<User> list = new ArrayList<User>();
		Session session = (Factory.getSessionFactory()).openSession();
		list = session.createCriteria(User.class).list();
		session.close();
		ObjectMapper mapper = new ObjectMapper();
		try {
			name = mapper.writeValueAsString(list);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		JSONArray jsonArrayPDV = JsonPath.parse(name).read("$..name",JSONArray.class);
		return jsonArrayPDV.toJSONString();

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
		} catch (Exception exc) {
			exc.printStackTrace();
			return "Inserimento fallito";
		}
	}

}
