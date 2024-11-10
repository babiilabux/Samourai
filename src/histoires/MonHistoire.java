package histoires;

import personnages.Humain;
import personnages.principaux.Yakuza;
import personnages.principaux.Commerçant;
import personnages.principaux.Ronin;
import personnages.principaux.Samourai;
import personnages.secondaires.Traitre;


public class MonHistoire {
	public static void main(String[] args) {
		
		  Traitre t = new Traitre("Itachi", "thé", 10, "Sasuke");
		  t.bonjour();

	}
}
