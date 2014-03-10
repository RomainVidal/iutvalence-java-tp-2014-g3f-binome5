package fr.iutvalence.java.tp.bataillenavale;

/**
 * Longueur, en cases, des bateaux.
 *
 */
public enum Longueur {

	/**
	 * Bateau d'une longueur de 2 cases.
	 */
	torpilleur(2),
	
	/**
	 * Bateau d'une longueur de 3 cases.
	 */
	sousMarin(3),
	
	/**
	 * Bateau d'une longueur de 3 cases.
	 */
	contreTorpilleur(3),
	
	/**
	 * Bateau d'une longueur de 4 cases.
	 */
	croiseur(4),
	
	/**
	 * Bateau d'une longueur de 5 cases.
	 */
	porteAvion(5);
	
	private int longueur;
	
	private Longueur(int longueur){
		
		this.longueur=longueur;
	}

	/**
	 * @return la longueur du bateau.
	 */
	public int getLongueur() {
		return longueur;
	}
	
	
}


