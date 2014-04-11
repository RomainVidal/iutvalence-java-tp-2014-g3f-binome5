package fr.iutvalence.java.tp.bataillenavale;

/**
 * Représente une partie de Bataille Navale.
 */
public class BatailleNavale
{
	
	/**
	 * Joueur 1 il posséde une grille et des bateaux.
	 */
	public Joueur joueur1;

	/**
	 * Joueur 2 il posséde une grille et des bateaux.
	 */
	public Joueur joueur2;
	
	/**
	 * Créé et renvoie une nouvelle partie de bataille navale. Création du
	 * plateau de jeu et des bateaux à placer.
	 */
	public BatailleNavale()
	{
		this.joueur1 = new Joueur();
		this.joueur2 = new Joueur();
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