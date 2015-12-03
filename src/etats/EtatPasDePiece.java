package etats;

import distributeur.Distributeur;

public class EtatPasDePiece extends EtatAbstrait {

    public EtatPasDePiece(Distributeur unDistributeur) {
        super(unDistributeur);
    }

    @Override
    public void insererUnePiece(double unePiece) {
        if (unePiece == 2 || unePiece == 1 || unePiece == 0.5 || unePiece == 0.2 || unePiece == 0.1) {
            distributeur.setAccompte(distributeur.getAccompte() + unePiece);
            distributeur.changeEtat(EnumEtat.SELECTION);
        } else {
            System.out.println("Pièce non acceptée.");
        }
        System.out.println("Accompte: " + distributeur.getAccompte() + "€");
    }

    @Override
    public void ejecterPiece() {
        System.out.println("Il n'y a pas de pièces !");
    }

    @Override
    public void ajouterDoseSucre() {
        System.out.println("Insérez déjà une pièce");
    };

    @Override
    public void enleverDoseSucre() {
        System.out.println("Insérez déjà une pièce");
    };

    @Override
    public void ajouterIngredient() {
        System.out.println("Insérez déjà une pièce");
    }

    @Override
    public void choisirBoisson() {
        System.out.println("Insérez déjà une pièce");
    }

    @Override
    public void rendrePiece() {
        System.out.println("Insérez déjà une pièce");
    }

    @Override
    public void prendreGobelet() {
        System.out.println("Insérez déjà une pièce");
    }

    @Override
    public void confirmerChoixBoisson() {
        System.out.println("Insérez déjà une pièce");
    }

    @Override
    public void delivrerChocolat() {
        System.out.println("Insérez déjà une pièce");
    }
}
