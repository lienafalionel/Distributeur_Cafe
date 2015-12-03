package etats;

import distributeur.Distributeur;

public class EtatSelection extends EtatAbstrait {

    public EtatSelection(Distributeur unDistributeur) {
        super(unDistributeur);
    }

    @Override
    public void insererUnePiece(double unePiece) {
        if (unePiece == 2 || unePiece == 1 || unePiece == 0.5 || unePiece == 0.2 || unePiece == 0.1) {
            distributeur.setAccompte(distributeur.getAccompte() + unePiece);
            distributeur.changeEtat(EnumEtat.SELECTION);
        } else {
            System.out.print("Pièce non acceptée. ");
        }
        System.out.println("Accompte: " + distributeur.getAccompte() + "€");
    }

    @Override
    public void ejecterPiece() {
        distributeur.changeEtat(EnumEtat.PAS_DE_PIECE);
        distributeur.setAccompte(0);
        System.out.println("Pièce(s) éjectée(s). Accompte: 0€");
    }

    @Override
    public void ajouterDoseSucre() {
        distributeur.setNombreDoseSucre(distributeur.getNombreDoseSucre() + 1);
        System.out.print("Vous avez " + distributeur.getNombreDoseSucre() + " dose");
        if (distributeur.getNombreDoseSucre() > 1) {
            System.out.print("s");
        }
        System.out.println(" de sucre.");
    };

    @Override
    public void enleverDoseSucre() {
        distributeur.setNombreDoseSucre(distributeur.getNombreDoseSucre() - 1);
        System.out.print("Vous avez " + distributeur.getNombreDoseSucre() + " dose");
        if (distributeur.getNombreDoseSucre() > 1) {
            System.out.print("s");
        }
        System.out.println(" de sucre.");
    };

    @Override
    public void ajouterIngredient() {
        distributeur.changeEtat(EnumEtat.SELECTION);
        System.out.println("Vous avez ajouté un ingrédient: " + distributeur.getBoisson() + ". Prix: " + distributeur.getBoisson().cout() + "€.");
    }

    @Override
    public void choisirBoisson() {
        distributeur.changeEtat(EnumEtat.SELECTION);
        System.out.println("Vous avez sélectionné une boisson: " + distributeur.getBoisson().getDescription() + ". Prix: " + distributeur.getBoisson().cout() + "€.");
    }

    @Override
    public void rendrePiece() {
        System.out.println("Veuillez confirmer votre choix.");
    }

    @Override
    public void prendreGobelet() {
        System.out.println("Veuillez confirmer votre choix.");
    }

    @Override
    public void confirmerChoixBoisson() {
        int nombreAleatoire = 1 + (int) (Math.random() * ((10 - 1) + 1));
        if (nombreAleatoire == 1) {
            distributeur.changeEtat(EnumEtat.GAGNANT);
        } else {
            distributeur.changeEtat(EnumEtat.LIVRAISON);
        }
        System.out.println("Vous avez choisi " + distributeur.getBoisson().getDescription() + ". Prix: " + distributeur.getBoisson().cout() + "€.");
    }

    @Override
    public void delivrerChocolat() {

    }

}
