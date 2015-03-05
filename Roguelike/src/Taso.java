import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Taso {
	private Kartta kartta;
	
	public Taso(){
		kartta = new Kartta();
	}
	
	public void lueKartta() throws IOException{
	File tiedosto = new File("Kartta2.txt");
	
	try{
		Scanner lukija = new Scanner(tiedosto);
		int riviNumero = 0;

		while(riviNumero < kartta.annaRivienLkm()){
			String rivi = lukija.nextLine();
			for(int i = 0; i < rivi.length(); i++){
				kartta.asetaArvo(riviNumero, i, rivi.charAt(i));
			}
			riviNumero++;
		}
		lukija.close();
	} catch (IOException e) {
	       e.printStackTrace();
	   }
	}
	
	public void asetaHahmoKartalle(int x, int y, Hahmo hahmo){
		kartta.asetaArvo(x, y, hahmo.getSymboli());
	}
	
	public void paivitaTaso(){
		/*
		 * Ennen kartan uudelleenpäivitystä edellinen täytyy poistaa. 
		 * Komento on käyttöjärjestelmäkohtainen, joten käytetään try-catch - ominaisuutta avuksi. 
		 */
		try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        System.out.println("Virhe!");
	    }
		kartta.karttaRuudulle();
	}
	
}
