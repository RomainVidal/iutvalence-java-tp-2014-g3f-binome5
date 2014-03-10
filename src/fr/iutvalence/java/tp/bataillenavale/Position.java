package fr.iutvalence.java.tp.bataillenavale;

/**
 * Une position sur la grille, définie par les coordonnées x et y.
 *  
 */
public class Position {

	private int x;
	private int y;
	
	/**
	 * @param X
	 * @param Y
	 * @throws ExceptionCoordonneesNonValides
	 * 
	 * Créé un pointeur vers une position de case dans la grille.
	 */
	public Position(int X, int Y) throws ExceptionCoordonneesNonValides{
		if (x<0 || x>10 || y<0 || y>10) throw new ExceptionCoordonneesNonValides();
		
		this.x = X;
		this.y = Y;
	}
	
	/**
	 * @return la valeur de la coordonnée x de la position.
	 */
	public int getX() {
		return x;
	}
	/**
	 * @return la valeur de la coordonnée y de la position.
	 */
	public int getY() {
		return y;
	}

	//TODO A finir.
	public Position voisine(Orientation orientation) {
		
		if (positionTir.getX() == this.positionProue.getX())
		{
			if (positionTir.getY() <= this.positionProue.getY()+this.taille &&  positionTir.getY() > this.positionProue.getY());
		}
			
		if (positionTir.getY() == this.positionProue.getY())
		{
			if (positionTir.getX() <= this.positionProue.getX()+this.taille &&  positionTir.getX() > this.positionProue.getX());
		}		
		return null;
	}
}
