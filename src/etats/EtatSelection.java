package etats;

import distributeur.Distributeur;

public class EtatSelection extends EtatAbstrait {

	public EtatSelection(Distributeur unDistributeur) {
		super(unDistributeur);
	}

	@Override
	public void insererUnePiece() {
		distributeur.changeEtat(EnumEtat.SELECTION);
	}

	@Override
	public void ejecterPiece() {
		distributeur.changeEtat(EnumEtat.PAS_DE_PIECE);
		distributeur.setAccompte(0);
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void confirmerBoisson() {
		// TODO Auto-generated method stub
		
	}

}
