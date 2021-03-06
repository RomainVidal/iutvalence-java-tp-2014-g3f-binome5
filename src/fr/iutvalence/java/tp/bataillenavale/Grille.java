package fr.iutvalence.java.tp.bataillenavale;

/**
 * Grille de jeu représentée par un tableau de cases d'une taille de 10*10 sur
 * laquelle seront placés les bateaux. En outre chaque joueur possède sa propre
 * grille non visible par le joueur adverse.
 */
public class Grille {

	/**
	 * Constante représentant le nombre de lignes d'une grille.
	 */
	public static final int NOMBRE_DE_CASES_X = 10;

	/**
	 * Constante représentant le nombre de colonnes d'une grille.
	 */
	public static final int NOMBRE_DE_CASES_Y = 10;

	/**
	 * Un tableau de cases en deux dimensions représentant chacune des cases
	 * d'une grille de jeu.
	 */
	private Case[][] cases;

	/**
	 * Grille de jeu initialisée en tant que carré de 10*10 cases vides.
	 */
	public Grille() {
		cases = new Case[NOMBRE_DE_CASES_X][NOMBRE_DE_CASES_Y];
		for (int coordoneex = 0; coordoneex < NOMBRE_DE_CASES_X; coordoneex++) {
			for (int coordoneey = 0; coordoneey < NOMBRE_DE_CASES_Y; coordoneey++) {
				cases[coordoneex][coordoneey] = new Case();
			}
		}
	}

	/**
	 * La grille est visée par un joueur.
	 * 
	 * @param position
	 *            la position qui est visée
	 * @return Vrai le tir à réussi a toucher une case.
	 */
	public boolean subitUnTir(Position position) {
		this.cases[position.obtenirNumeroDeLigne()][position
				.obtenirNumeroDeLigne()].estVisee();
		return true;
	}

	/**
	 * @param position
	 *            La position de la case.
	 * @return Vrai si la case peut être visée.
	 */
	public boolean obtenirEtatCase(Position position) {
		return this.cases[position.obtenirNumeroDeLigne()][position
				.obtenirNumeroDeColonne()].peutEtreVisee();
	}

}
