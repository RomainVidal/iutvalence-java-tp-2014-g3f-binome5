package fr.iutvalence.java.tp.bataillenavale;

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
	 * Represente les positions du bateau, vaut vrai si la case est touchée.
	 */
	private boolean[] positionsTouchees;

	/**
	 * Orientation du bateau.
	 */
	private Orientation orientation;

	/**
	 * Position de la première case du bateau.
	 */
	private Position positionProue;

	/**
	 * Type du bateau, défini par son nom et sa taille.
	 */
	private TypeBateau type;

	/**
	 * Créé un nouveau bateau, défini par son type, la position de sa première
	 * case et son orientation.
	 * 
	 * @param type
	 *            Type du bateau
	 * @param positionProue
	 *            Position de la première case du bateau.
	 * @param orientation
	 *            Orientation horizontale ou verticale du bateau.
	 */
	public Bateau(TypeBateau type, Position positionProue,
			Orientation orientation) {
		this.type = type;
		this.positionProue = positionProue;
		this.orientation = orientation;
		this.taille = this.type.getTaille();

		this.positionsTouchees = new boolean[this.taille];
		for (int positionCourante = 0; positionCourante < this.taille; positionCourante++)
			this.positionsTouchees[positionCourante] = false;
	}

	/**
	 * On test si un bateau se trouve sur la position de la case ciblée par le
	 * tir.
	 * 
	 * @param positionTir
	 *            Position de la case visée par le tir.
	 * @return Vrai si un bateau se trouve à la position ciblée et faux si il
	 *         n'y en a pas.
	 */
	public boolean estTouche(Position positionTir) {

		for (int numeroPosition = 0; numeroPosition < this.taille; numeroPosition++)
			if (this.obtenirPosition(numeroPosition).equals(positionTir)) {
				this.positionsTouchees[numeroPosition] = true;
				return true;
			}
		return false;
	}

	/**
	 * Pour savoir si le bateau occupe une position.
	 * 
	 * @param position
	 *            la position ou l'on souhaite savoir si il y a un bateau.
	 * @return vrai si le bateau occupe la position rentré en paramètre.
	 */
	public boolean occupePosition(Position position) {
		for (int numeroPosition = 0; numeroPosition < this.taille; numeroPosition++)
			if (this.obtenirPosition(numeroPosition).equals(position))
				return true;
		return false;
	}

	/**
	 * Obtenirles position du bateau à partir de la proue.
	 * 
	 * @param numeroPosition
	 *            le numéro de la position du bateau.
	 * @return La position de la case se trouvant au numéro de position donné en
	 *         paramètre.
	 */
	private Position obtenirPosition(int numeroPosition) {

		if (numeroPosition >= this.taille)
			return null;
		Position positionCourante = this.positionProue;

		for (int indicePosition = 0; indicePosition < numeroPosition; indicePosition++)
			positionCourante = positionCourante.voisine(this.orientation);
		return positionCourante;

	}

	/**
	 * On test si le nombre de cases non touchées est égal à 0, et si c'est le
	 * cas, le bateau est coulé.
	 * 
	 * @return Vrai si le bateau est coulé, faux dans le cas contraire.
	 */
	public boolean estCoule() {
		for (int numeroPosition = 0; numeroPosition < this.taille; numeroPosition++)
			if (!(this.positionsTouchees[numeroPosition]))
				return false;
		return true;
	}
}
