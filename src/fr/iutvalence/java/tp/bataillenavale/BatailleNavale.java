package fr.iutvalence.java.tp.bataillenavale;

/**
 * Représente une partie de Bataille Navale.
 */
public class BatailleNavale
{

	/**
	 * Plateau de jeu comportant deux grilles identiques (une pour chaque
	 * joueur), cachées du joueur adverse par un cache placé au milieu.
	 */
	public Plateau plateau;

	/**
	 * Créé et renvoie une nouvelle partie de bataille navale. Création du
	 * plateau de jeu et des bateaux à placer.
	 */
	public BatailleNavale()
	{
		this.plateau = new Plateau();
	}

	/**
	 * permet de jouer entierement une partie de Bataille Navale. Celle-ci se
	 * terminera par la victoire de l'un des deux joueurs. Pour l'instant elle
	 * simule une partie vide.
	 */
	public void jouer()
	{

	}

}