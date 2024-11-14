package personnages.secondaires;

import personnages.principaux.Commerçant;

public class Colporteur extends Commerçant{
	
	public Colporteur(String nom, int bourse) {
		super(nom, bourse);
	}
	
	@Override
	public int seFaireExtorquer() {
		parler("Il a pas vu l'argent caché dans ma chaussette");
		perdreArgent((getbourse()/2)); // getbourse représente la quantité totale de la bourse du commerçant 
		return getbourse();
	}

}
