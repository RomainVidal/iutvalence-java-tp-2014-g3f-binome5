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

	private int caseRestante;
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
		this.caseRestante = this.type.getTaille();
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
	 * @throws ExceptionCoordonneesNonValides
	 */
	public boolean estTouche(Position positionTir)
			throws ExceptionCoordonneesNonValides {

		Position positionCourante = this.positionProue;
		int indicePosition = 1;

		while (true) {
			if (positionCourante == positionTir) {
				this.caseRestante--;
				return true;
			}
			if (indicePosition == this.taille)
				break;
			positionCourante = positionCourante.voisine(this.orientation);
			indicePosition++;

		}
		if (positionTir == this.positionProue) {
			this.caseRestante--;
			return true;
		}
		return false;

	}

	/**
	 * On test si le nombre de cases non touchées est égal à 0, et si c'est le
	 * cas, le bateau est coulé.
	 * 
	 * @return Vrai si le bateau est coulé, faux dans le cas contraire.
	 */
	public boolean estCoule() {
		if (this.caseRestante == 0)
			return true;
		return false;
	}
}
