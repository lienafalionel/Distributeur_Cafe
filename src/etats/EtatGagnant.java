package etats;

import distributeur.Distributeur;

public class EtatGagnant extends EtatAbstrait {

    public EtatGagnant(Distributeur unDistributeur) {
        super(unDistributeur);
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
        System.out.println("Votre boisson est en cours de livraison.");
    }

    @Override
    public void prendreGobelet() {
        System.out.println("Votre boisson est en cours de livraison.");
    }

    @Override
    public void confirmerChoixBoisson() {
        System.out.println("Votre boisson est en cours de livraison.");
    }

    @Override
    public void delivrerChocolat() {
        System.out.println("Félicitations ! Vous avez gagné un chocolat !");
        distributeur.changeEtat(EnumEtat.LIVRAISON);
    }
}
