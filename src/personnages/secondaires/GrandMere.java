package personnages.secondaires;
import personnages.Humain;

public class GrandMere extends Humain{
	private Humain [] memoire = new Humain [30];
	
	public GrandMere (String blaze, int bourse) {
		super(blaze, "tisane", bourse);		
	}
	
	public void faireConnaissance(Humain h) {
		
	}
}
