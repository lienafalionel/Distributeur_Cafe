package ingredients;
import java.util.List;

import boissons.Boisson;

public abstract class DecorateurIngredient extends Boisson {

	protected Boisson boisson;

	public DecorateurIngredient(Boisson uneBoisson) {
		boisson = uneBoisson;
	}
	
	@Override
	public void recupereIngredient(List<DecorateurIngredient> list) {
		list.add(this);
		boisson.recupereIngredient(list);
	}

}
