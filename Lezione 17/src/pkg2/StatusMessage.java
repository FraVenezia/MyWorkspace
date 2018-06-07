package pkg2;

public class StatusMessage implements FriendShip,Comparable 
{
	private String username,city,text;
	
	public StatusMessage(String username,String city,String text)
	{
		this.username=username;
		this.city=city;
		this.text=text;
	}

	public boolean isNearTo(Object x) 
	{
		if(city.equals(((StatusMessage) x).getCity()))
			return true;
		else
			return false;
	}
	
	public int compareTo(Object x)
	{
		return city.compareTo(((StatusMessage) x).getCity());
	}
	
	@Override
	public boolean equals(Object x)
	{
		return false;
		
	}
	
	@Override
	public String toString() {return text;}
	public String getCity() {return city;}
	public String getText() {return text;}
}
