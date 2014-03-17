package fr.iutvalence.java.tp.bataillenavale;

/**
 * Type du bateau, défini par un nom et une taille.
 * 
 * @author brunetj
 * 
 */
public enum TypeBateau {
	/**
	 * Bateau d'une longueur de 2 cases.
	 */
	TORPILLEUR(2),

	/**
	 * Bateau d'une longueur de 3 cases.
	 */
	SOUSMARIN(3),

	/**
	 * Bateau d'une longueur de 3 cases.
	 */
	CONTRETORPILLEUR(3),

	/**
	 * Bateau d'une longueur de 4 cases.
	 */
	CROISEUR(4),

	/**
	 * Bateau d'une longueur de 5 cases.
	 */
	PORTEAVION(5);

	private int taille;

	private TypeBateau(int taille) {

		this.taille = taille;
	}

	/**
	 * @return la longueur du bateau.
	 */
	public int getTaille() {
		return taille;
	}

}
