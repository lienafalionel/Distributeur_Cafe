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
            System.out.println("Pi�ce non accept�e.");
        }
        System.out.println("Accompte: " + distributeur.getAccompte() + "�");
    }

    @Override
    public void ejecterPiece() {
        System.out.println("Il n'y a pas de pi�ces !");
    }

    @Override
    public void ajouterDoseSucre() {
        System.out.println("Ins�rez d�j� une pi�ce");
    };

    @Override
    public void enleverDoseSucre() {
        System.out.println("Ins�rez d�j� une pi�ce");
    };

    @Override
    public void ajouterIngredient() {
        System.out.println("Ins�rez d�j� une pi�ce");
    }

    @Override
    public void choisirBoisson() {
        System.out.println("Ins�rez d�j� une pi�ce");
    }

    @Override
    public void rendrePiece() {
        System.out.println("Ins�rez d�j� une pi�ce");
    }

    @Override
    public void prendreGobelet() {
        System.out.println("Ins�rez d�j� une pi�ce");
    }

    @Override
    public void confirmerChoixBoisson() {
        System.out.println("Ins�rez d�j� une pi�ce");
    }

    @Override
    public void delivrerChocolat() {
        System.out.println("Ins�rez d�j� une pi�ce");
    }
}
