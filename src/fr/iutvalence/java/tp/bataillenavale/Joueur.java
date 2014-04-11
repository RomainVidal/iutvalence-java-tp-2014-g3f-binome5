package fr.iutvalence.java.tp.bataillenavale;

/**
 * Un joueur qui a une grille ou il place ses bateaux.
 * 
 */
public class Joueur {

	/**
	 * Nombre de bateaux disponibles par défaut, pour chaque joueur.
	 */
	private static final int BATEAUX_PAR_JOUEUR = 5;

	/**
	 * Grille attribuée au joueur, elle permettra de noter les posision qu'il a
	 * déjà ciblé.
	 */
	private Grille grille;

	/**
	 * Tableau permettant de stocker les bateaux attribués aux joueurs.
	 */
	private Bateau[] bateaux;

	/**
	 * Un joueur qui posséde une grille et des bateau.
	 */
	public Joueur() {
		this.grille = new Grille();
		this.bateaux = new Bateau[BATEAUX_PAR_JOUEUR];
		for (int i = 0; i < BATEAUX_PAR_JOUEUR; i++) {
			this.bateaux[i] = null;
		}
	}

	/**
	 * Permet de placer les bateaux sur la grille en indiquant la position de sa
	 * première case, son orientation et son type.
	 * 
	 * @param typebateau
	 *            Type du bateau, défini par un nom et une taille.
	 * @param positionProue
	 *            Position de la première case du bateau.
	 * @param orientation
	 *            Orientation du bateau sur la grill : horizontal ou vertical.
	 */
	public void placerBateau(TypeBateau typebateau, Position positionProue,
			Orientation orientation) {
		Bateau bateau = new Bateau(typebateau, positionProue, orientation);
		for (int debutTableau = 0; debutTableau < BATEAUX_PAR_JOUEUR; debutTableau++) {
			if (this.bateaux[debutTableau] == null) {
				this.bateaux[debutTableau] = bateau;
			}
		}
	}

	public boolean unBateauEstTouche(Position position) {
		for (int bateauCourant = 0; bateauCourant < BATEAUX_PAR_JOUEUR; bateauCourant++) {
			if (this.bateaux[bateauCourant].occupePosition(position) == true)
				return true;
		}
		return false;
	}

	public String toString() {

		String grille = "";

		for (int ligne = 0; ligne < Grille.NOMBRE_DE_CASES_X; ligne++) {
			for (int colonne = 0; colonne < Grille.NOMBRE_DE_CASES_Y; colonne++) {
				if (unBateauEstTouche(new Position(ligne, colonne)))
					grille += "B";
				else
					grille += "o";
			}
			grille += "\n";
		}

		return grille;
	}
}
