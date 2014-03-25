package fr.iutvalence.java.tp.bataillenavale;

/**
 * Un joueur qui a une grille ou il place ses bateaux.
 *
 */
public class Joueur {
	
	private static final int BATEAUX_PAR_JOUEUR = 5;
	private Grille grille;
	private Bateau[] bateaux;
	
	/**
	 * Un joueur qui posséde une grille et des bateau.
	 */
	public Joueur(){
		this.grille = new Grille();
		this.bateaux = new Bateau[BATEAUX_PAR_JOUEUR];
		for (int i = 0; i < BATEAUX_PAR_JOUEUR; i++){
			this.bateaux[i] = null;
		}
	}
	
	public void placerBateau(TypeBateau typebateau, Position positionProue, Orientation orientation){
		Bateau bateau = new Bateau(typebateau, positionProue, orientation);
		for (int debutTableau = 0; debutTableau < BATEAUX_PAR_JOUEUR; debutTableau++){
			if (this.bateaux[debutTableau] == null){
				this.bateaux[debutTableau] = bateau;
			}
		}
	}
	
}
