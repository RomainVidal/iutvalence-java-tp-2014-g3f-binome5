package fr.iutvalence.java.tp.bataillenavale;

//TODO Mettre en majuscule.
public enum TypeBateau
{
	/**
	 * Bateau d'une longueur de 2 cases.
	 */
	TORPILLEUR(2),

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

	private int taille;

	private TypeBateau(int taille)
	{

		this.taille = taille;
	}

	/**
	 * @return la longueur du bateau.
	 */
	public int getTaille()
	{
		return taille;
	}

}
