
public class Hahmo implements Liikkuminen {
	protected String nimi;
	protected int healthPoints;
	protected int strength;
	protected int accuracy;
	protected int xKoord;
	protected int yKoord;
	protected char symboli;
	protected char allaOleva;
	
	
	
	/**
	 * @param nimi
	 * @param healthPoints
	 * @param strength
	 * @param accuracy
	 * @param xKoord
	 * @param yKoord
	 * @param symboli
	 */
	public Hahmo(String nimi, int healthPoints, int strength, int accuracy,
			int xKoord, int yKoord, char symboli, Taso t) {
		super();
		this.nimi = nimi;
		this.healthPoints = healthPoints;
		this.strength = strength;
		this.accuracy = accuracy;
		this.xKoord = xKoord;
		this.yKoord = yKoord;
		this.symboli = symboli;
		this.allaOleva = (t.annaKartta()).annaArvot()[xKoord][yKoord];
	}
	
	//Getterit ja Setterit
	/**
	 * @return the nimi
	 */
	public String getNimi() {
		return nimi;
	}
	/**
	 * @param nimi the nimi to set
	 */
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	/**
	 * @return the healthPoints
	 */
	public int getHealthPoints() {
		return healthPoints;
	}
	/**
	 * @param healthPoints the healthPoints to set
	 */
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}
	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}
	/**
	 * @return the accuracy
	 */
	public int getAccuracy() {
		return accuracy;
	}
	/**
	 * @param accuracy the accuracy to set
	 */
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	/**
	 * @return the xKoord
	 */
	public int getXKoord() {
		return xKoord;
	}
	/**
	 * @param xKoord the xKoord to set
	 */
	public void setXKoord(int xKoord) {
		this.xKoord = xKoord;
	}
	/**
	 * @return the yKoord
	 */
	public int getYKoord() {
		return yKoord;
	}
	/**
	 * @param yKoord the yKoord to set
	 */
	public void setYKoord(int yKoord) {
		this.yKoord = yKoord;
	}
	/**
	 * @return the symboli
	 */
	public char getSymboli() {
		return symboli;
	}
	/**
	 * @param symboli the symboli to set
	 */
	public void setSymboli(char symboli) {
		this.symboli = symboli;
	}
	/**
	 * @return the allaOleva
	 */
	public char getAllaOleva() {
		return allaOleva;
	}
	/**
	 * @param allaOleva the allaOleva to set
	 */
	public void setAllaOleva(Taso t) {
		char allaOleva = (t.annaKartta()).annaArvot()[this.getXKoord()][this.getYKoord()];
		this.allaOleva = allaOleva;
	}

	public boolean liikuOikealle(Taso taso){
		if(taso.onkoLaillinenPaikka(this.xKoord, this.yKoord+1)){
			(taso.annaKartta()).asetaArvo(this.getXKoord(), this.getYKoord(), this.getAllaOleva()); 
			taso.asetaHahmoKartalle(this.xKoord, this.yKoord+1, this);
			this.yKoord++;
			this.setAllaOleva(taso);
			return true;
		}
		return false;
	}
	public boolean liikuVasemmalle(Taso taso){
		if(taso.onkoLaillinenPaikka(this.xKoord, this.yKoord-1)){
			(taso.annaKartta()).asetaArvo(this.getXKoord(), this.getYKoord(), this.getAllaOleva());
			taso.asetaHahmoKartalle(this.xKoord, this.yKoord-1, this);
			this.yKoord--;
			this.setAllaOleva(taso);
			return true;
		}
		return false;
	}
	public boolean liikuYlos(Taso taso){
		if(taso.onkoLaillinenPaikka(this.xKoord-1, this.yKoord)){
			(taso.annaKartta()).asetaArvo(this.getXKoord(), this.getYKoord(), this.getAllaOleva());
			taso.asetaHahmoKartalle(this.xKoord-1, this.yKoord, this);
			this.xKoord--;
			this.setAllaOleva(taso);
			return true;
		}
		return false;
	}
	public boolean liikuAlas(Taso taso){
		if(taso.onkoLaillinenPaikka(this.xKoord+1, this.yKoord+1)){
			(taso.annaKartta()).asetaArvo(this.getXKoord(), this.getYKoord(), this.getAllaOleva());
			taso.asetaHahmoKartalle(this.xKoord+1, this.yKoord, this);
			this.xKoord++;
			this.setAllaOleva(taso);
			return true;
		}
		return false;
	}
	
}
	


	
	

