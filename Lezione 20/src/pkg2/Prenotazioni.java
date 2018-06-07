package pkg2;

import java.util.Scanner;

public class Prenotazioni 
{
	public static void main(String[] args)
	{
		GestionePrenotazioni sit = new GestionePrenotazioni();
		int scelta=0;	
		Scanner in=new Scanner (System.in);
		do
		{
			System.out.println("1.Inserimento");
			System.out.println("2.Esci");
			scelta=in.nextInt();
			in=new Scanner (System.in);

			switch (scelta)
			{
				case 1:
				{
					System.out.println("Inserisci il nome della persona che Prenota il posto");
					try
					{
						String nome=in.nextLine();
						if ((nome.equals("scemo"))|(nome.equals("cretino")))
								throw new EccezionePrenotazione(nome);
						else
							System.out.println(sit.InserimentoPrenotazione(nome));	
					}
					catch (EccezionePrenotazione exc)
					{
						System.out.println(exc.eccezioneParolacce());
					}
					catch (ArrayIndexOutOfBoundsException exc)
					{
						System.out.println("Inserimento Fallito.Posti finiti");
					}
					in=new Scanner (System.in);
				}
			}
		}
		while(scelta!=2);
	}
}