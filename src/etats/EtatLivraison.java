package etats;

import distributeur.Distributeur;

public class EtatLivraison extends EtatAbstrait {

	public EtatLivraison(Distributeur unDistributeur) {
		super(unDistributeur);
	}

	@Override
	public void insererUnePiece() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejecterPiece() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doserSucre() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ajouterIngredient() {
		// TODO Auto-generated method stub

	}

	@Override
	public void choisirBoisson() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rendrePiece() {
		// TODO Auto-generated method stub

	}

	@Override
	public void prendreGobelet() {
		distributeur.changeEtat(EnumEtat.PAS_DE_PIECE);
	}

	@Override
	public void confirmerBoisson() {
		// TODO Auto-generated method stub
		
	}

}
