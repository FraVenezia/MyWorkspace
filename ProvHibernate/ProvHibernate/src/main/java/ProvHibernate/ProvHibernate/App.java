package ProvHibernate.ProvHibernate;

import ProvHibernate.ProvHibernate.CRUD.PersonaManager;

public class App 
{
    public static void main( String[] args )
    {
    	PersonaManager manager = new PersonaManager();


		manager.setup();
//		manager.create();
		manager.read();
//		manager.update();
//		manager.delete();
		manager.exit();
    }
}
