package ingredients;

import boissons.Boisson;


public class Cannelle extends DecorateurIngredient {

	public Cannelle(Boisson uneBoisson) {
		super(uneBoisson);
	}

	@Override
	public double cout() {
		return super.boisson.cout() + 0.7;
	}

}
