package histoires;

import personnages.Humain;
import personnages.principaux.Yakuza;
import personnages.principaux.Commerçant;
import personnages.principaux.Ronin;
import personnages.principaux.Samourai;
import personnages.secondaires.Traitre;
import personnages.secondaires.Colporteur;


public class MonHistoire {
	public static void main(String[] args) {
		
		  Traitre t = new Traitre("Itachi", "thé", 10, "Sasuke");
		  t.bonjour();
		  
		  Colporteur c = new Colporteur("colporteur", 25);
		  c.bonjour();
		  
		  Commerçant f = new Commerçant("commercant",45);
		  
		  Yakuza y = new Yakuza("yaku", "sake", 30, "Uzumaki");
		  y.bonjour();
		  y.extorquer(c);
		  y.extorquer(f);
		  

	}
}
