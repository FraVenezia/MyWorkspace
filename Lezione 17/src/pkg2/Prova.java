package pkg2;

public class Prova 
{

	public static void main(String[] args) 
	{
		FriendShip status1=new StatusMessage("Mario Bianchi","Bologna","<<Mario Bianchi è felice>>");
		FriendShip status2=new StatusMessage("Michele Rossi","Bologna","<<pensa che oggi non può andare peggio di così>>");
		FriendShip status3=new StatusMessage("Aldo Verdi","Milano","<<si diverte un sacco!>>");
		
		if(status1.isNearTo(status2))
			stampa(status1,status2);
		if(status1.isNearTo(status3))
			stampa(status1,status3);
		if(status2.isNearTo(status3))
			stampa(status2,status3);
		
		if(((StatusMessage)status1).compareTo(status2)==0)
			stampa(status1,status2);
		if(((StatusMessage)status1).compareTo(status3)==0)
			stampa(status1,status3);
		if(((StatusMessage)status2).compareTo(status3)==0)
			stampa(status2,status3);
	}

	public static void stampa(FriendShip x,FriendShip y)
	{
		System.out.println(x.toString()+" "+y.toString());
	}
}
