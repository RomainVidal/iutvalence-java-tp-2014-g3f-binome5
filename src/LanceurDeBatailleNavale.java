import fr.iutvalence.java.tp.bataillenavale.BatailleNavale;

/**
 * Ceci est une application permettant de lancer et de jouer une partie de
 * bataille navale. De plus celle-ci affiche des commentaires à la création, au
 * démarrage et à la fin de la partie.
 */
public class LanceurDeBatailleNavale {

	/**
	 * Point d'entrée de l'application.
	 * 
	 * @param args
	 *            paramètres de la ligne de commandes (on ne les utilise pas)
	 */
	public static void main(String[] args) {

		System.out.println("Création d'une partie de Bataille Navale \n");

		BatailleNavale partieBatailleNavale = new BatailleNavale();

		System.out.println("Démarrage de la partie \n");

		partieBatailleNavale.jouer();

		System.out.println("Grille de Joueur1 \n");
		System.out.println(partieBatailleNavale.joueur1.toString());

		System.out.println("Grille de Joueur2 \n");
		System.out.println(partieBatailleNavale.joueur2.toString());

		System.out.println("Fin de la partie");

	}

}