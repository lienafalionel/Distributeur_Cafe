package boissons;

import ingredients.DecorateurIngredient;

import java.util.List;

public abstract class Boisson {

	private String description;
	
	public abstract double cout();
	
	public String getDescription() {
		return description;
	}
	
	public void recupereIngredient(List<DecorateurIngredient> list) {

	}
}
