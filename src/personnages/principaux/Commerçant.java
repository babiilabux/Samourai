package personnages.principaux;
import personnages.Humain;

public class Commerçant extends Humain {
	
	public Commerçant(String blaze, int bourse) {
		super(blaze, "thé", bourse);
	}
	
	public int seFaireExtorquer() {
		parler("Le monde est vraiment trop injuste !!");
		perdreArgent(getbourse()); // getbourse représente la quantité totale de la bourse du commerçant 
		return getbourse();
	}
	
	public int recevoir(int montant) {
		parler("Trop bien j'ai reçu " + montant + " kokus !");
		gagnerArgent(montant);
		return getbourse();
	}
}
