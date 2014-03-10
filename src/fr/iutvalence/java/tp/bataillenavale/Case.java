package fr.iutvalence.java.tp.bataillenavale;

// TODO Changer le type des coordonnées par un type Position.

/**
 * Case de la grille représentée par ses deux coordonnées x et y.
 *
 */
public class Case {

	/**
	 * Coordonnée X, verticale, de la case.
	 * Correspond a la ligne de la case.
	 */
	private int coordonneeX;
	
	/**
	 * Coordonnée Y, horizontale, de la case.
	 * Correspond à la colonne de la case.
	 */
	private int coordonneeY;
	
	/**
	 * Définition d'une case selon ses coordonnées.
	 * @param x 
	 * @param y 
	 */
	public Case(int x, int y) {
		this.coordonneeX = x;
		this.coordonneeY = y;
	}
	
}
