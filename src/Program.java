import ingredients.EnumIngredient;
import boissons.EnumBoisson;
import distributeur.Distributeur;

public class Program {

    public static void main(String[] args) {
        // Contexte contexte = new Contexte();
        Distributeur distributeur = new Distributeur();
        distributeur.finDeMaintenance();
        distributeur.insererPiece(0.20);
        distributeur.insererPiece(2);
        distributeur.insererPiece(1.5);
        distributeur.insererPiece(1);
        distributeur.insererPiece(2);
        distributeur.insererPiece(2);
//      distributeur.ejecterPiece();
        distributeur.ajouterDoseSucre();
        distributeur.ajouterDoseSucre();

        distributeur.selectionnerBoisson(EnumBoisson.CHOCOLAT);
        distributeur.ajouterIngredient(EnumIngredient.CANNELLE);
        distributeur.ajouterIngredient(EnumIngredient.CHANTILLY);

        distributeur.confirmerChoixBoisson();

        distributeur.delivrerChocolat();
        distributeur.rendrePiece();
        distributeur.prendreGobelet();
    }

}
