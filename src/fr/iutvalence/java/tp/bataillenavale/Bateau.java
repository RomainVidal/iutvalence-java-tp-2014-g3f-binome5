package fr.iutvalence.java.tp.bataillenavale;

/**
 * Classe abstraite permettant de donner un type aux bateaux qui seront définis
 * par la suite.
 * 
 */
public abstract class Bateau {

	/**
	 * Taille du bateau (nombre de cases qu'il occupe sur la grille).
	 */
	private Longueur taille;
	
	/**
	 * Orientation du bateau.
	 */
	private Orientation orientation;
	
	/**
	 * Position de la première case du bateau.
	 */
	private Position positionPremiereCase;
	
	


}
