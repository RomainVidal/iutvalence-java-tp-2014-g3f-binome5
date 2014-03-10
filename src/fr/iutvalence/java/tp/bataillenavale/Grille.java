package fr.iutvalence.java.tp.bataillenavale;

/**
 * Grille de jeu représentée par un tableau de cases d'une taille de 10*10
 * sur laquelle seront placés les bateaux.
 * En outre chaque joueur possède sa propre grille
 * non visible par le joueur adverse.
 */
public class Grille {

	/**
	 * Constante représentant le nombre de lignes d'une grille.
	 */
	private static final int NOMBRE_DE_CASES_X = 10;
	/**
	 * Constante représentant le nombre de colonnes d'une grille.
	 */
	private static final int NOMBRE_DE_CASES_Y = 10;

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
		for (int i = 0; i < NOMBRE_DE_CASES_X; i++) {
			for (int j = 0; j < NOMBRE_DE_CASES_Y; j++)
				cases[i][j] = new Case(i + 1, j + 1);
		}
	}
}
