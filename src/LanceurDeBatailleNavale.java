import fr.iutvalence.java.tp.bataillenavale.BatailleNavale;



public class LanceurDeBatailleNavale {

	public static void main(String[] args) {
		
		System.out.println("Cr�ation d'une partie de Bataille Navale");
		
		BatailleNavale partieBatailleNavale = new BatailleNavale();
		
		System.out.println("D�marrage de la partie");
		
		partieBatailleNavale.jouer();
		
		System.out.println("Fin de la partie");	

	}

}
