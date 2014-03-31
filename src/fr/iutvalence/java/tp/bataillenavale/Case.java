package fr.iutvalence.java.tp.bataillenavale;

/**
 * Case de la grille représentée par ses deux coordonnées x et y.
 * 
 */
public class Case {

	/**
	 * Permet de savoir si une case a déjà été ciblée par un tir.
	 */
	private boolean caseDejaCiblee;

	/**
	 * Définition d'une case selon ses coordonnées.
	 * 
	 * @param position
	 *            Coordonnées de la case.
	 */
	public Case(Position position) {
		this.caseDejaCiblee = false;
	}

	/**
	 * Indique si il est possible de tirer sur la case visée.
	 * 
	 * @return Vrai si la case n'a jamais été ciblée, faux sinon.
	 */
	public boolean peutEtreVisee() {
		if (this.caseDejaCiblee == true)
			return false;
		this.caseDejaCiblee = true;
		return true;
	}

	public String toString() {
		if (this.caseDejaCiblee) {
			return "x";
		}
		for (int ligne = 0; ligne < Grille.NOMBRE_DE_CASES_X; ligne++) {
			for (int colonne = 0; colonne < Grille.NOMBRE_DE_CASES_Y; colonne++) {

			}
		}
		return "o";
	}
}
