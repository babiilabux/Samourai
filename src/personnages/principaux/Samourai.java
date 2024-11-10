package personnages.principaux;
import personnages.Humain;

public class Samourai extends Ronin{
	private String seigneur;
	
	public Samourai(String blaze, String boisson, int bourse, String seigneur) {
		super(blaze, boisson, bourse);
		this.seigneur = seigneur;
	}
	
	public void bonjour() {
		super.bonjour(); 
		parler("Mon seigneur est " + this.seigneur);
	}
	
	
	public void boire(String boisson) {
		parler("Mmmm, un bon verre de " + boisson + " ! Je bois ce que je veux");
	}
}
