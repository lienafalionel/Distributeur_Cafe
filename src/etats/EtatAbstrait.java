package etats;

import distributeur.Distributeur;

public abstract class EtatAbstrait {
	
	protected Distributeur distributeur;
	
	public EtatAbstrait(Distributeur unDistributeur) {
		distributeur = unDistributeur;
	}

	public abstract void insererUnePiece();
	public abstract void ejecterPiece();
	public abstract void doserSucre();
	public abstract void ajouterIngredient();
	public abstract void choisirBoisson();
	public abstract void confirmerBoisson();
	public abstract void rendrePiece();
	public abstract void prendreGobelet();
}
