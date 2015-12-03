package etats;

import distributeur.Distributeur;

public abstract class EtatAbstrait {

    protected Distributeur distributeur;

    public EtatAbstrait(Distributeur unDistributeur) {
        distributeur = unDistributeur;
    }

    public abstract void insererUnePiece(double unePiece);

    public abstract void ejecterPiece();

    public abstract void ajouterDoseSucre();
    
    public abstract void enleverDoseSucre();

    public abstract void ajouterIngredient();

    public abstract void choisirBoisson();

    public abstract void confirmerChoixBoisson();
    
    public abstract void delivrerChocolat();

    public abstract void rendrePiece();

    public abstract void prendreGobelet();
}
