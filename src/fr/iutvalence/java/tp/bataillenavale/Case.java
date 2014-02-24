package fr.iutvalence.java.tp.bataillenavale;

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
	 */
	public Case(int x, int y) {
		this.coordonneeX = x;
		this.coordonneeY = y;
	}
	
}
