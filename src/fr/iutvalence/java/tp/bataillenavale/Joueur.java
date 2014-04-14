package fr.iutvalence.java.tp.bataillenavale;

import java.util.Scanner;

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
	 * Nombre de bateaux qu'a placé chaque joueur.
	 */
	private int nbDeBateaux = 0;

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

		this.bateaux[this.nbDeBateaux] = bateau;
		this.nbDeBateaux++;
	}

	/**
	 * Le joueur tire sur la grille.
	 * 
	 * @param position
	 *            La position sur laquelle on tire.
	 * @return Vrai si on peut tirer sur la case, faux sinon.
	 */
	public boolean tirer(Position position) {
		if (this.grille.obtenirEtatCase(position) == false)
			return false;
		if (this.bateauOccupeCase(position)) {
			this.bateauTouche(position);
			this.grille.subitUnTir(position);
			return true;
		}
		this.grille.subitUnTir(position);
		return false;
	}

	/**
	 * Si un bateau appartenant au joueur occupe la case.
	 * 
	 * @param position
	 *            La position qui va être testée
	 * @return Vrai si un des bateaux du joueur se trouve sur la position entrée
	 *         en paramètre, faux sinon.
	 */
	public boolean bateauOccupeCase(Position position) {
		for (int bateauCourant = 0; bateauCourant < this.nbDeBateaux; bateauCourant++) {
			if (this.bateaux[bateauCourant].occupePosition(position) == true)
				return true;
		}
		return false;
	}

	/**
	 * @return Vrai si le joueur a encore des bateaux non coulés, faux si tous
	 *         ses bateaux sont coulées.
	 */
	public boolean aEncoreDesBateaux() {
		for (int bateauCourant = 0; bateauCourant < nbDeBateaux; bateauCourant++) {
			if (this.bateaux[bateauCourant].estCoule() == false)
				return true;
		}
		return false;
	}

	/**
	 * @param positionTir
	 *            Position de la case visée par le tir.
	 * @return Vrai si le bateau est touché, faux sinon.
	 */
	public boolean bateauTouche(Position positionTir) {
		for (int bateauCourant = 0; bateauCourant < nbDeBateaux; bateauCourant++)
			if (this.bateaux[bateauCourant].estTouche(positionTir))
				return true;
		return false;
	}

	/**
	 * Obtenir les bateaux d'un joueur
	 * 
	 * @return les bateaux du joueur.
	 */
	public Bateau[] obtenirBateau() {
		return this.bateaux;
	}

	public String toString() {

		String grille = "";

		for (int ligne = 0; ligne < Grille.NOMBRE_DE_CASES_X; ligne++) {
			for (int colonne = 0; colonne < Grille.NOMBRE_DE_CASES_Y; colonne++) {
				if (bateauOccupeCase(new Position(ligne, colonne)))
					grille += "B";
				else if (this.grille.obtenirEtatCase(new Position(ligne,
						colonne)) == false)
					grille += "X";
				else
					grille += "~";
			}
			grille += "\n";
		}

		return grille;
	}

	/**
	 * Chaque joueur va placer tous ses bateaux un par un.
	 */
	public void placerTousLesBateaux() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bateau : TORPILLEUR \n");
		System.out.println("Veuillez saisir les coordonnées de la proue : \n");
		int coordonneeX = sc.nextInt();
		int coordonneeY = sc.nextInt();
		System.out
				.println("Veuillez saisir l'orientation (1 - Verticale ; 2 - Horizontale) : \n");
		int orientation = sc.nextInt();
		if (orientation == 1)
			this.placerBateau(TypeBateau.TORPILLEUR, new Position(coordonneeX,
					coordonneeY), Orientation.VERTICAL);
		else
			this.placerBateau(TypeBateau.TORPILLEUR, new Position(coordonneeX,
					coordonneeY), Orientation.HORIZONTAL);

		System.out.println("Bateau : SOUSMARIN \n");
		System.out.println("Veuillez saisir les coordonnées de la proue :\n");
		coordonneeX = sc.nextInt();
		coordonneeY = sc.nextInt();
		System.out
				.println("Veuillez saisir l'orientation (1 - Verticale ; 2 - Horizontale) :\n");
		orientation = sc.nextInt();
		if (orientation == 1)
			this.placerBateau(TypeBateau.SOUSMARIN, new Position(coordonneeX,
					coordonneeY), Orientation.VERTICAL);
		else
			this.placerBateau(TypeBateau.SOUSMARIN, new Position(coordonneeX,
					coordonneeY), Orientation.HORIZONTAL);

		System.out.println("Bateau : CONTRETORPILLEUR\n");
		System.out.println("Veuillez saisir les coordonnées de la proue :\n");
		coordonneeX = sc.nextInt();
		coordonneeY = sc.nextInt();
		System.out
				.println("Veuillez saisir l'orientation (1 - Verticale ; 2 - Horizontale) :\n");
		orientation = sc.nextInt();
		if (orientation == 1)
			this.placerBateau(TypeBateau.CONTRETORPILLEUR, new Position(
					coordonneeX, coordonneeY), Orientation.VERTICAL);
		else
			this.placerBateau(TypeBateau.CONTRETORPILLEUR, new Position(
					coordonneeX, coordonneeY), Orientation.HORIZONTAL);

		System.out.println("Bateau : CROISEUR\n");
		System.out.println("Veuillez saisir les coordonnées de la proue :\n");
		coordonneeX = sc.nextInt();
		coordonneeY = sc.nextInt();
		System.out
				.println("Veuillez saisir l'orientation (1 - Verticale ; 2 - Horizontale) :\n");
		orientation = sc.nextInt();
		if (orientation == 1)
			this.placerBateau(TypeBateau.CROISEUR, new Position(coordonneeX,
					coordonneeY), Orientation.VERTICAL);
		else
			this.placerBateau(TypeBateau.CROISEUR, new Position(coordonneeX,
					coordonneeY), Orientation.HORIZONTAL);

		System.out.println("Bateau : PORTEAVION\n");
		System.out.println("Veuillez saisir les coordonnées de la proue :\n");
		coordonneeX = sc.nextInt();
		coordonneeY = sc.nextInt();
		System.out
				.println("Veuillez saisir l'orientation (1 - Verticale ; 2 - Horizontale) :\n");
		orientation = sc.nextInt();
		if (orientation == 1)
			this.placerBateau(TypeBateau.PORTEAVION, new Position(coordonneeX,
					coordonneeY), Orientation.VERTICAL);
		else
			this.placerBateau(TypeBateau.PORTEAVION, new Position(coordonneeX,
					coordonneeY), Orientation.HORIZONTAL);
	}
}
