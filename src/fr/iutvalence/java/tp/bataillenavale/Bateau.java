package fr.iutvalence.java.tp.bataillenavale;

/**
 * Permet de donner un type aux bateaux qui seront définis par la suite.
 * 
 */
public class Bateau {

	/**
	 * Taille du bateau (nombre de cases qu'il occupe sur la grille).
	 */
	private int taille;

	/**
	 * Orientation du bateau.
	 */
	private Orientation orientation;

	/**
	 * Position de la première case du bateau.
	 */
	private Position positionProue;

	/**
	 * Type du bateau, défini par son nom et sa taille.
	 */
	private TypeBateau type;

	/**
	 * Créé un nouveau bateau, défini par son type, la position de sa première
	 * case et son orientation.
	 * 
	 * @param type
	 *            Type du bateau
	 * @param positionProue
	 *            Position de la première case du bateau.
	 * @param orientation
	 *            Orientation horizontale ou verticale du bateau.
	 */
	public Bateau(TypeBateau type, Position positionProue,
			Orientation orientation) {
		this.type = type;
		this.positionProue = positionProue;
		this.orientation = orientation;
		this.taille = this.type.getTaille();
	}

	/**
	 * On test si un bateau se trouve sur la position de la case ciblée par le
	 * tir.
	 * 
	 * @param positionTir
	 *            Position de la case visée par le tir.
	 * @return Vrai si un bateau se trouve à la position ciblée et faux si il
	 *         n'y en a pas.
	 */
	public boolean estTouche(Position positionTir) {

		Position positionCourante = this.positionProue;
		int indicePosition = 1;

		while (true) {
			if (positionCourante == positionTir)
				return true;
			if (indicePosition == this.taille)
				break;
			positionCourante = positionCourante.voisine(this.orientation);
			indicePosition++;

		}
		if (positionTir == this.positionProue)
			return true;
		return false;

	}
}
