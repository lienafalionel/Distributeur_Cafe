import ingredients.EnumIngredient;
import boissons.EnumBoisson;
import distributeur.Distributeur;


public class Program {

	public static void main(String[] args) {
//		Contexte contexte = new Contexte();
		Distributeur distributeur = new Distributeur();
		distributeur.finDeMaintenance();
		distributeur.insererPiece(0.20);
		distributeur.insererPiece(2);
//		distributeur.ejecterPiece();
		distributeur.doserSucre(2);
		
		distributeur.selectionnerBoisson(EnumBoisson.EXPRESSO);
		distributeur.ajouterIngredient(EnumIngredient.CANNELLE);
		distributeur.ajouterIngredient(EnumIngredient.CHANTILLY);
		
		distributeur.confirmerBoisson();
		
//		distributeur.delivrerBoisson();
		distributeur.rendrePiece();
		distributeur.prendreGobelet();
	}

}
