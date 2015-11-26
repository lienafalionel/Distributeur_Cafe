package etats;

import distributeur.Distributeur;

public class EtatPasDePiece extends EtatAbstrait {

	public EtatPasDePiece(Distributeur unDistributeur) {
		super(unDistributeur);
	}

	@Override
	public void insererUnePiece() {
		distributeur.changeEtat(EnumEtat.SELECTION);
	}

	@Override
	public void ejecterPiece() {
		System.out.println(this + " Il n'y a pas de pi�ces !");
	}

	@Override
	public void doserSucre() {
		System.out.println(this + " Ins�rez d�j� une pi�ce");
	}

	@Override
	public void ajouterIngredient() {
		System.out.println(this + " Ins�rez d�j� une pi�ce");
	}

	@Override
	public void choisirBoisson() {
		System.out.println(this + " Ins�rez d�j� une pi�ce");
	}

	@Override
	public void rendrePiece() {
		System.out.println(this + " Ins�rez d�j� une pi�ce");
	}

	@Override
	public void prendreGobelet() {
		System.out.println(this + " Ins�rez d�j� une pi�ce");
	}

	@Override
	public void confirmerBoisson() {
		System.out.println(this + " Ins�rez d�j� une pi�ce");
	}
}
