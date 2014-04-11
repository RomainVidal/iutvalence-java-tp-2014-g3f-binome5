import fr.iutvalence.java.tp.bataillenavale.BatailleNavale;
import fr.iutvalence.java.tp.bataillenavale.Orientation;
import fr.iutvalence.java.tp.bataillenavale.Position;
import fr.iutvalence.java.tp.bataillenavale.TypeBateau;

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

		System.out.println("Création d'une partie de Bataille Navale");

		BatailleNavale partieBatailleNavale = new BatailleNavale();

		Position position = new Position(5, 2);
		partieBatailleNavale.joueur1.placerBateau(TypeBateau.TORPILLEUR,
				position, Orientation.HORIZONTAL);

		position = new Position(2, 3);
		partieBatailleNavale.joueur1.placerBateau(TypeBateau.CROISEUR,
				position, Orientation.HORIZONTAL);

		partieBatailleNavale.joueur1.tirer(position);
		
		System.out.println(partieBatailleNavale.joueur1.toString());

		System.out.println("Démarrage de la partie");

		partieBatailleNavale.jouer();

		System.out.println("Fin de la partie");

	}

}