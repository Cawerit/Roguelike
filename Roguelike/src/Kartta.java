
public class Kartta {
	private char[][] arvot;
	
	public Kartta(){
		arvot = new char[20][70];
	}


	public char annaArvo(int x, int y){
		return arvot[x][y];
	}
	public void asetaArvo(int x, int y, char merkki){
		arvot[x][y] = merkki;
	}
	public int annaRivienLkm(){
		return arvot.length;
	}
	public String karttaRuudulle(){
		String palaute = "";
		for(int i = 0; i < arvot.length; i++){
			palaute += "\n";
			for(int j = 0; j < arvot[i].length; j++){
				palaute += arvot[i][j];
			}
		}
		return palaute;
	}
}
