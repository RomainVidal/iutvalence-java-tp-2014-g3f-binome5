package fr.iutvalence.java.tp.bataillenavale;

/**
 * Plateau de jeu comportant deux grilles identiques (une pour chaque joueur),
 * cachées du joueur adverse par un cache placé au milieu.
 */
public class Plateau {

	/**
	 * Joueur 1 il posséde une grille et des bateaux.
	 */
	public Joueur joueur1;

	/**
	 * Joueur 2 il posséde une grille et des bateaux.
	 */
	public Joueur joueur2;

	/**
	 * Le plateau de jeu est initialisé avec deux grilles (une par joueur) où
	 * les joueurs placerons leurs bateaux.
	 */
	public Plateau() {
			this.joueur1 = new Joueur();
			this.joueur2 = new Joueur();

	}

}
