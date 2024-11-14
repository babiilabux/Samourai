package personnages.principaux;
import personnages.Humain;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	
	public Yakuza (String blaze, String alcoolPref, int bourse, String clan) {
		super(blaze, alcoolPref, bourse);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public String getClan() {
		return this.clan;
	}
	
	public int getReputation() {
		return this.reputation;
	}
	
	public void extorquer(Commerçant c) {
		parler("Je t'attaque " + c.getname() + " mwahahaha !");
		gagnerArgent(c.getbourse());
		c.seFaireExtorquer();
		reputation += 1;
	}
	
	public void gagnerDuel() {
		parler("J'ai gagner le dududu dueeeeeel !!!");
		reputation += 1;
	}
	
	public void perdreDuel() {
		parler("J'ai perdu...");
		perdreArgent(getbourse());
		reputation -= 1;
	}
	
	@Override
	public void bonjour() {
		// Appel de la fonction bonjour() de la classe Humain
		super.bonjour();
		// Ajout de l'annonce du clan
		parler("Je fais partie du clan " + this.clan + " et j'en suis très fier !");		
	}
}
