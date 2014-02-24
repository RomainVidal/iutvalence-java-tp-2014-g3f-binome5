import fr.iutvalence.java.tp.bataillenavale.BatailleNavale;

// TODO écrire un commentaire
public class LanceurDeBatailleNavale
{
	// TODO écrire un commentaire
	// TODO corriger les accents
	public static void main(String[] args)
	{

		System.out.println("Cr�ation d'une partie de Bataille Navale");

		BatailleNavale partieBatailleNavale = new BatailleNavale();

		System.out.println("D�marrage de la partie");

		partieBatailleNavale.jouer();

		System.out.println("Fin de la partie");

	}

}
