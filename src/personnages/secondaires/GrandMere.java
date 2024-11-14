package personnages.secondaires;
import personnages.Humain;

public class GrandMere extends Humain{
	private Humain [] memoire = new Humain [30];
	// Permet de suivre quel est le premier index de libre dans la liste
	private int nbConnaissances = 0;
	
	public GrandMere (String blaze, int bourse) {
		super(blaze, "tisane", bourse);		
	}
	
	public void faireConnaissance(Humain h) {
		if(nbConnaissances < memoire.length) {
			memoire[nbConnaissances] = h;
			nbConnaissances++;
			parler("Ravi de faire ta connaissance mon petit");
		} else {
			parler("Ma mémoire me joue des tours, qui êtes-vous déjà ?");
		}
	}
}
