package model;

public class Utente {
	private String userName;
	private String pass;
	
	public Utente() {

	}
	
	public Utente(String userName, String pass) {
		super();
		this.userName = userName;
		this.pass = pass;
	}
	
	public Utente(String userName) {
		super();
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}


}
