package personnages.principaux;
import personnages.Humain;

public class Ronin extends Humain {
	private int honneur;

	public Ronin(String blaze, String alcoolPref, int bourse) {
		super(blaze, alcoolPref, bourse);
		this.honneur = 1;
	}
	
	public void donnerArgent(Commerçant c, int montant) {
		parler("Voici " + montant + " kokus " + c.getname());
		c.parler("Merci " + getname());
		perdreArgent(montant);
	}
	
	public void provoquer(Yakuza y) {
		int doublehonneur = this.honneur * 2;
		// variable pour récupérer le montant de la bourse du Ronin
		int bourse = getbourse();
		if(doublehonneur > y.getReputation()) {
			bourse += y.getbourse();
			this.honneur += 2;
			parler("Je t'ai battu" + y.getname());
			y.perdreDuel();
		} else {
			this.honneur -= 1;
			parler("Mais d'oùùùùùùùùùùùù j'ai perdu !!!");
			y.gagnerDuel();
		}
	}
	
	
}
