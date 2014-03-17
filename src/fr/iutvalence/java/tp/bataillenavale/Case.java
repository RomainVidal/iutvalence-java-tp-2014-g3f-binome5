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
	 * @param x
	 *            Coordonnée verticale.
	 * @param y
	 *            Coordonnée horizontale.
	 */
	public Case(int x, int y) {
		try {
			this.coordonnees = new Position(x, y);
		} catch (ExceptionCoordonneesNonValides e) {
			e.printStackTrace();
		}
	}

}
