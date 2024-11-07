package histoires;

import personnages.Humain;

public class MonHistoire {
	public static void main(String[] args) {
		System.out.println("hello world");
		
		Humain h1 = new Humain("Kenji", "sakeaveclesdeuxsabresdansledos", 1000); 
		
		String parlerh1 = h1.parler("je vends des sushis et j'ai plein de dettes");
		
		System.out.println(parlerh1);
	}
}
