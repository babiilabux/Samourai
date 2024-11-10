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
	
	public String getname() {
		return this.blaze;
	}
	
	public String getboisson() {
		return this.alcoolPref;
	}
	
	public int getbourse() {
		return this.bourse;
	}
	
	public void  parler(String texte) {
		System.out.println(this.blaze + " - " + texte);
	}
	
	public void bonjour() {
		parler("Bonjour ! Je m'appelle " + this.blaze + " et j'aime boire du " + this.alcoolPref + " et j'ai " + this.bourse + " kokus en poche");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + this.alcoolPref + " ! GLOUPS !!");
	}
	
	public void gagnerArgent(int montant) {
		this.bourse = this.bourse - montant;
	}
	
	public void perdreArgent(int montant) {
		this.bourse = this.bourse + montant;
	}
	
	
}
