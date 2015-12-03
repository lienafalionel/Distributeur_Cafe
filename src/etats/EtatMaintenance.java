package etats;

import distributeur.Distributeur;

public class EtatMaintenance extends EtatAbstrait {

    public EtatMaintenance(Distributeur unDistributeur) {
        super(unDistributeur);
    }

    @Override
    public void insererUnePiece(double unePiece) {
        System.out.println("Appareil en maintenance.");
    }

    @Override
    public void ejecterPiece() {
        System.out.println("Appareil en maintenance.");
    }

    @Override
    public void ajouterDoseSucre() {
        System.out.println("Appareil en maintenance.");
    };

    @Override
    public void enleverDoseSucre() {
        System.out.println("Appareil en maintenance.");
    };

    @Override
    public void ajouterIngredient() {
        System.out.println("Appareil en maintenance.");
    }

    @Override
    public void choisirBoisson() {
        System.out.println("Appareil en maintenance.");
    }

    @Override
    public void rendrePiece() {
        System.out.println("Appareil en maintenance.");
    }

    @Override
    public void prendreGobelet() {
        System.out.println("Appareil en maintenance.");
    }

    @Override
    public void confirmerChoixBoisson() {
        System.out.println("Appareil en maintenance.");
    }

    @Override
    public void delivrerChocolat() {
        System.out.println("Appareil en maintenance.");
    }
}
