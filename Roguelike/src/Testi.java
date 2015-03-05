import java.io.IOException;


public class Testi {
	public static void main(String[] args){
		
		
		Taso taso = new Taso();
		try {
			taso.lueKartta();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	System.out.println("MOI");
	
	
	Sankari s = new Sankari("KILLERMASTER", 100, 30, 10, 2, 6, '@');
	taso.asetaHahmoKartalle(s.getXKoord(), s.getYKoord(), s);
	taso.paivitaTaso();
	// s.liiku(new KeyEvent());		Miten t‰m‰ tehd‰‰n???
	
	taso.paivitaTaso();
	}
}
