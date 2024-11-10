package personnages.secondaires;
import personnages.principaux.Samourai;
import personnages.principaux.Commerçant;
import personnages.Humain;

public class Traitre extends Samourai{
	double traitrise;
	
	public Traitre(String blaze, String alcoolPref, int bourse, String seigneur) {
		super(blaze, alcoolPref, bourse, seigneur);
		this.traitrise = 0;
	}
	
	public void bonjour() {
		super.bonjour();
		parler("mon niveau de traitrise est de : " + this.traitrise);
	}
	
	public void extorquer(Commerçant c) {
		if (this.traitrise >= 3) {
			parler("Je suis un traitre et je t'extorque " + c.getname() + " ! ");
			int bourse = getbourse();
			bourse += c.getbourse();
			c.seFaireExtroquer();
			this.traitrise += 1;
			c.parler("Oh non je me suis fait extorquer par " + getname());
		} else {
			parler("Mon niveau de traitrise est trop haut je ne peux pas t'extorquer");
		}
		
	}
	
	public void faireLeGentil(Humain h, int montant) {
		parler("Faisons ami-ami" + h.getname());
		h.parler("Merci " + getname());
		perdreArgent(montant);
		double newtraitrise = (traitrise * 0.9);
		if (newtraitrise < 0) {
			traitrise = 0;
		} else {
			traitrise = newtraitrise;
		}
	}
	
}
