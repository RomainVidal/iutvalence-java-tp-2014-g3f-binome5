package fr.iutvalence.java.tp.bataillenavale;

/**
 * Plateau de jeu comportant deux grilles identiques (une pour chaque joueur),
 * cachées du joueur adverse par un cache placé au milieu.
 */
public class Plateau {

	/**
	 * Grille de jeu du joueur 1, où il va placer ses bateaux. Le joueur 2 va
	 * tirer sur cette grille, mais ne pourra pas la voir.
	 */
	private Grille grilleJoueur1;

	/**
	 * Grille de jeu du joueur 2, où il va placer ses bateaux. Le joueur 1 va
	 * tirer sur cette grille, mais ne pourra pas la voir.
	 */
	private Grille grilleJoueur2;

	/**
	 * Le plateau de jeu est initialisé avec deux grilles (une par joueur) où
	 * les joueurs placerons leurs bateaux.
	 */
	public Plateau() {
		try {
			this.grilleJoueur1 = new Grille();
			this.grilleJoueur2 = new Grille();
		} catch (ExceptionCoordonneesNonValides e) {
			e.printStackTrace();
		}

	}

}
