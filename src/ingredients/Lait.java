package ingredients;

import boissons.Boisson;

public class Lait extends DecorateurIngredient {

	public Lait(Boisson uneBoisson) {
		super(uneBoisson);
	}

	@Override
	public double cout() {
		return super.boisson.cout() + 0.5;
	}
	
	@Override
	public String getDescription() {
		return super.boisson.getDescription() + "avec du lait ";
	}
}
