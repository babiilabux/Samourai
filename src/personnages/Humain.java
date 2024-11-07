package personnages;

public class Humain {
	private String blaze;
	private String alcoolPref;
	private int bourse;
	
	public Humain(String name, String bestdrink, int gold) {
		this.blaze = name;
		this.alcoolPref = bestdrink;
		this.bourse = gold;
	}
	
	public String parler(String texte) {
		return this.blaze + " - " + texte;
	}
	
	
	
}
