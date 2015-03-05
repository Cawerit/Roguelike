import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Taso {
	private Kartta kartta;
	
	/**
	 * @return the kartta
	 */
	public Kartta getKartta() {
		return kartta;
	}


	/**
	 * @param kartta the kartta to set
	 */
	public void setKartta(Kartta kartta) {
		this.kartta = kartta;
	}


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
	} catch (IOException e) {
	       e.printStackTrace();
	   }
	}
	
	public void asetaHahmoKartalle(int x, int y, Hahmo hahmo){
		kartta.asetaArvo(x, y, hahmo.getSymboli());
	}
	
	public void paivitaTaso(){
		System.out.println(kartta.karttaRuudulle());
	}
	
}
