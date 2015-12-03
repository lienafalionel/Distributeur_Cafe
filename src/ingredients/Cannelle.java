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

    @Override
    public String getDescription() {
        return super.boisson.getDescription() + " avec de la cannelle";
    }
    
    @Override
    public String toString() {
        return "Cannelle";
    }
}
