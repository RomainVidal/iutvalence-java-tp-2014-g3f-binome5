package fr.iutvalence.java.tp.bataillenavale;

/**
 * Une position sur la grille, définie par les coordonnées x et y.
 * 
 */
public class Position {

	/**
	 * Coordonnée verticale sur la grille.
	 */
	private int numeroDeColonne;
	
	/**
	 * Coordonnée horizontale sur la grille.
	 */
	private int numeroDeLigne;

	/**
	 * @param numeroDeLigne
	 * @param y
	 * 
	 *             Créé un pointeur vers une position de case dans la grille.
	 */
	public Position(int numeroDeLigne, int numeroDeColonne) {

		this.numeroDeColonne = numeroDeLigne;
		this.numeroDeLigne = numeroDeColonne;
	}

	/**
	 * @return la valeur de la coordonnée x de la position.
	 */
	public int obtenirNumeroDeColonne() {
		return numeroDeColonne;
	}

	/**
	 * @return la valeur de la coordonnée y de la position.
	 */
	public int obtenirNumeroDeLigne() {
		return numeroDeLigne;
	}

	/**
	 * On recherche la position de la case voisine de la case courante en
	 * fonction de l'orientation du bateau.
	 * 
	 * @param orientation
	 *            Bateau orienté verticalement ou horizontalement.
	 * @return Position voisine de la position courante.
	 * 
	 */

	public Position voisine(Orientation orientation)
		 {
		Position positionVoisine = new Position(this.numeroDeColonne, this.numeroDeLigne);

		if (orientation == Orientation.HORIZONTAL) {
			positionVoisine.numeroDeLigne += 1;
		}

		if (orientation == Orientation.VERTICAL) {
			positionVoisine.numeroDeColonne += 1;
		}

		return positionVoisine;
	}
}
