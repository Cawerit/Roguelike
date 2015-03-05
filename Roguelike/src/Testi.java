import java.io.IOException;

import javax.swing.JFrame;

public class Testi {
	public static void main(String[] args){
		
		Taso taso = new Taso();
		try {
			taso.lueKartta();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	Sankari s = new Sankari("KILLERMASTER", 100, 30, 10, 2, 6, '@');
	taso.asetaHahmoKartalle(2, 7, s);
	taso.paivitaTaso();

	
	Grafiikka app = new Grafiikka();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.setVisible(true);
	app.piirra(taso.getKartta());
    
    
	}
}
