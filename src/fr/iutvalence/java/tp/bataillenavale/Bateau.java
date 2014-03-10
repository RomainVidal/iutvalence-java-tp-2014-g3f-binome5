package fr.iutvalence.java.tp.bataillenavale;

import org.omg.CORBA.portable.IndirectionException;

/**
 * Permet de donner un type aux bateaux qui seront définis par la suite.
 * 
 */
public class Bateau {

	/**
	 * Taille du bateau (nombre de cases qu'il occupe sur la grille).
	 */
	private int taille;

	/**
	 * Orientation du bateau.
	 */
	private Orientation orientation;

	/**
	 * Position de la première case du bateau.
	 */
	private Position positionProue;

	private TypeBateau type;
	
	public Bateau(TypeBateau type, Position positionProue, Orientation orientation)
	{
		this.type = type;
		this.positionProue = positionProue;
		this.orientation = orientation;
		this.taille = this.type.getTaille();
	}
	/**
	 * @return
	 */
	public boolean estTouche(Position positionTir) {

		Position positionCourante = this.positionProue;
		int indicePosition = 1;
		
		while (true)
		{
			if (positionCourante == positionTir) return true;
			if (indicePosition == this.taille) break;
			positionCourante = positionCourante.voisine(this.orientation);
			indicePosition++;
			
		}
		if (positionTir == this.positionProue)
			return true;
		

	}
}
