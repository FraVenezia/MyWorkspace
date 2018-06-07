package it.begear.example.main;

import it.begear.example.crud.Crud;
import it.begear.example.model.User;

public class Main {

	public static void main(String[] args) {
		
		User user1=new User(0,"Gigi1","12345","Luigi Rossi","luig.ross@libero.it");
		Crud.getInstanzaCrud().insertUser(user1);
		System.out.println(user1.toString());
	
//		Crud.getInstanzaCrud().searchUsers();
//		Crud.getInstanzaCrud().updateUser("FraVenezia");
//		Crud.getInstanzaCrud().deleteUser("FraVenezia");
		
		
		
		

	}
}
