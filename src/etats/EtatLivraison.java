package etats;

import distributeur.Distributeur;

public class EtatLivraison extends EtatAbstrait {

    private double[] pieces;

    public EtatLivraison(Distributeur unDistributeur) {
        super(unDistributeur);
        pieces = new double[] { 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01 };
    }

    @Override
    public void insererUnePiece(double unePiece) {
        System.out.println("Votre boisson est en cours de livraison.");
    }

    @Override
    public void ejecterPiece() {
        System.out.println("Votre boisson est en cours de livraison.");
    }

    @Override
    public void ajouterDoseSucre() {
        System.out.println("Votre boisson est en cours de livraison.");
    };

    @Override
    public void enleverDoseSucre() {
        System.out.println("Votre boisson est en cours de livraison.");
    };

    @Override
    public void ajouterIngredient() {
        System.out.println("Votre boisson est en cours de livraison.");
    }

    @Override
    public void choisirBoisson() {
        System.out.println("Votre boisson est en cours de livraison.");
    }

    @Override
    public void rendrePiece() {
        System.out.print("Rendu monnaie: ");
        double resteARendre = distributeur.getRenduMonnaie();
        for (double piece : pieces) {
            if (resteARendre / piece >= 1) {
                int nombrePiece = (int) (resteARendre / piece);
                System.out.print(nombrePiece + " x " + piece + "€ \t");
                resteARendre -= nombrePiece * piece;
            }
        }
        System.out.println("");
        distributeur.changeEtat(EnumEtat.LIVRAISON);
    }

    @Override
    public void prendreGobelet() {
        System.out.println("Biiiiiiiiiip. Vous pouvez prendre votre boisson.");
        distributeur.changeEtat(EnumEtat.PAS_DE_PIECE);
    }

    @Override
    public void confirmerChoixBoisson() {
        System.out.println("Votre boisson est en cours de livraison.");
    }

    @Override
    public void delivrerChocolat() {

    }

}
