package fr.iutvalence.java.tp.bataillenavale;

/**
 * Une position sur la grille, définie par les coordonnées x et y.
 * 
 */
public class Position {

	/**
	 * Coordonnée verticale sur la grille.
	 */
	private int x;
	
	/**
	 * Coordonnée horizontale sur la grille.
	 */
	private int y;

	/**
	 * @param X
	 * @param Y
	 * @throws ExceptionCoordonneesNonValides
	 * 
	 *             Créé un pointeur vers une position de case dans la grille.
	 */
	public Position(int X, int Y) throws ExceptionCoordonneesNonValides {
		if (x < 0 || x > 10 || y < 0 || y > 10)
			throw new ExceptionCoordonneesNonValides();

		this.x = X;
		this.y = Y;
	}

	/**
	 * @return la valeur de la coordonnée x de la position.
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return la valeur de la coordonnée y de la position.
	 */
	public int getY() {
		return y;
	}

	/**
	 * On recherche la position de la case voisine de la case courante en
	 * fonction de l'orientation du bateau.
	 * 
	 * @param orientation
	 *            Bateau orienté verticalement ou horizontalement.
	 * @return Position voisine de la position courante.
	 * @throws ExceptionCoordonneesNonValides
	 */

	public Position voisine(Orientation orientation)
			throws ExceptionCoordonneesNonValides {
		Position positionVoisine = new Position(this.x, this.y);

		if (orientation == Orientation.HORIZONTAL) {
			positionVoisine.y += 1;
		}

		if (orientation == Orientation.VERTICAL) {
			positionVoisine.x += 1;
		}

		return positionVoisine;
	}
}
