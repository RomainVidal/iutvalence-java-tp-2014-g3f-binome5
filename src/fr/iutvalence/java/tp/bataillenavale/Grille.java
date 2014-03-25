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
		Position positionCourante;
		cases = new Case[NOMBRE_DE_CASES_X][NOMBRE_DE_CASES_Y];
		for (int coordoneex = 0; coordoneex < NOMBRE_DE_CASES_X; coordoneex++) {
			for (int coordoneey = 0; coordoneey < NOMBRE_DE_CASES_Y; coordoneey++) {
				try {
					positionCourante = new Position(coordoneex, coordoneey);
					cases[coordoneex][coordoneey] = new Case(positionCourante);
				} catch (ExceptionCoordonneesNonValides e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public boolean tirer(Position position){
		this.cases[position.getX()][position.getY()].peutEtreVisee();
		return true;
	}
	
	public String toString() {
		String grille = "";
		for (int ligne=0; ligne < NOMBRE_DE_CASES_X; ligne++){
			for (int colonne = 0; colonne < NOMBRE_DE_CASES_Y; colonne++){
				grille += this.cases[ligne][colonne].toString();
			}
			grille += "\n";
		}
		return grille;
	}
}
