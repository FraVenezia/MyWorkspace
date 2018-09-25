package it.html.tutorial.library.api;

import java.io.File;
import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import it.html.tutorial.library.model.Menu;

@Path("menu")
public class MenuService {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.TEXT_PLAIN})
	@Path("/post")
	public String insertUser(Menu menu){
		
		//ObjectMapper mapper = new ObjectMapper();
		 System.out.println("MenuID = "+menu.getMenuID());
	        System.out.println("MenuVersion  = "+menu.getMenuVersion());
		//Object to JSON in file
		//mapper.writeValue(new File("c:\\file.json"), menu);

		//Object to JSON in String
		//String jsonInString = mapper.writeValueAsString(menu);
//		ObjectMapper mapper = new ObjectMapper();
//		String result=null;
//		try {
//			result = new ObjectMapper().writeValueAsString(menu);
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String jsonTestataString = null;
//		try {
//			jsonTestataString = mapper.writeValueAsString(menu);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		String jsonPathExpression = "$";
//		System.out.println(menu);
//		JSONArray jsonArrayPDV = JsonPath.parse(jsonTestataString.toString()).read(jsonPathExpression, JSONArray.class);
		return "ok";

	}

}
