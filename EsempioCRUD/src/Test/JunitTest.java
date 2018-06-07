package Test;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.begear.example.crud.Crud;
import it.begear.example.model.User;

public class JunitTest {
	private User utente;
//	Logger mioLog=Logger.getLogger("Test Log");
	//Logger log = Logger.getLogger(JunitTest.class);
	 Logger logger = Logger.getLogger(JunitTest.class.getName());

	@Before
	public void insertUse() {
//	    PropertyConfigurator.configure("log4j.properties");
//		DOMConfigurator.configure("log4j.xml");
		logger.log(Level.INFO, "Avviato insertUser");
		utente=new User(0, "FraVenezia", "12345", "Francesco Venezia", "fra.venezia@gmail.com");	
	}
	
	@Test
	public void testInsert() {
		logger.log(Level.INFO, "Avviato testUser");
		Crud.getInstanzaCrud().insertUser(utente);
		User utente2=Crud.getInstanzaCrud().readUser(utente);
		Assert.assertEquals(utente.toString(), utente2.toString());
	}
	
	@After
	public void deleteUser() {
		logger.log(Level.INFO, "Avviato deleteUser");
		Crud.getInstanzaCrud().deleteUser(utente.getUsername());
	}
}
