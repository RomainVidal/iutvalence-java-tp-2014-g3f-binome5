package fr.iutvalence.java.tp.bataillenavale;

/**
 * Plateau de jeu comportant deux grilles identiques (une pour chaque joueur),
 * cachées du joueur adverse par un cache placé au milieu.
 */
public class Plateau {

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

	public Plateau() {
		cases = new Case[NOMBRE_DE_CASES_X][NOMBRE_DE_CASES_Y];
		for (int i = 0; i < NOMBRE_DE_CASES_X; i++) {
			for (int j = 0; j < NOMBRE_DE_CASES_Y; j++)
				cases[i][j] = new Case(i + 1, j + 1);
		}
	}
}
