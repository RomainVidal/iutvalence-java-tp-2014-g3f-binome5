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

	private boolean caseDejaCiblee;

	/**
	 * Définition d'une case selon ses coordonnées.
	 * 
	 * @param position
	 *            Coordonnées de la case.
	 */
	public Case(Position position) {
		this.coordonnees = position;
		this.caseDejaCiblee = false;
	}

	/**
	 * Indique siil est possible de tirer sur la case visée.
	 * 
	 * @return Vrai si la case n'a jamais été ciblée, faux sinon.
	 */
	public boolean peutEtreVisee() {
		if (this.caseDejaCiblee == true)
			return false;
		return true;
	}

}
