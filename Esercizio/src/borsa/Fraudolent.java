package borsa;

public class Fraudolent 
{
	public static void main(String[] args) 
	{
//		Utility.readFile();
//		Utility.iteratorList();
		String text="\"Apple 50.0 210 B\"";
		String newString=text.replaceAll("[^0-9.]", "");
		System.out.println(newString);
	}
}
