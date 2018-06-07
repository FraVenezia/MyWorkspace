package pkg1;

public class prova {

	public static void main(String[] args) 
	{
		String str="ciao";
		int num=str.length();
	    String a="a";
	    String e="e";
	    String i="i";
	    String o="o";
	    String u="u";
	    int j=0;
	    while (j<4)
	    {
	    char s=str.charAt(j);
	    j++;
	    if (s=='e'|| s=='i')
		System.out.println(s);
	    }
	}
}
