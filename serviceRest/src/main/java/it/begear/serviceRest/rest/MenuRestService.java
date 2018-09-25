package it.begear.serviceRest.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import it.begear.serviceRest.model.Menu;

@Path(value = "/rest")
public class MenuRestService {

	@GET
	@Path("/get")
	public String prova() {
		return "OK";
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/post")
	public String insertUser(Menu menu) {
		System.out.println(menu);
		return "ok";

	}

}