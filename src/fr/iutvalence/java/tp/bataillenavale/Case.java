package fr.iutvalence.java.tp.bataillenavale;

/**
 * Case de la grille représentée par ses deux coordonnées x et y.
 * 
 */
public class Case {

	/**
	 * Position de la case sur la grille.
	 */
	private Position coordonnees;

	/**
	 * Définition d'une case selon ses coordonnées.
	 * 
	 * @param position
	 *            Coordonnées de la case.
	 */
	public Case(Position position) {
		this.coordonnees = position;
	}

}
