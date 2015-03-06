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

	Sankari s = new Sankari("KILLERMASTER", 100, 30, 10, 2, 6, '@', taso);
	
	//Grafiikka g = new Grafiikka();
	
	
	taso.asetaHahmoKartalle(s.getXKoord(), s.getYKoord(), s);
	taso.paivitaTaso();
	// s.liiku(new KeyEvent());		Miten t‰m‰ tehd‰‰n???
	
	taso.paivitaTaso();
	s.liikuOikealle(taso);
	taso.paivitaTaso();
	s.liikuOikealle(taso);
	taso.paivitaTaso();
	s.liikuOikealle(taso);
	taso.paivitaTaso();
	s.liikuOikealle(taso);

	taso.paivitaTaso();
	s.liikuOikealle(taso);
	taso.paivitaTaso();
	s.liikuAlas(taso);
	taso.paivitaTaso();
	s.liikuAlas(taso);
	taso.paivitaTaso();
	s.liikuVasemmalle(taso);
	taso.paivitaTaso();
	s.liikuVasemmalle(taso);
	taso.paivitaTaso();
	s.liikuYlos(taso);
	taso.paivitaTaso();
	}
}
