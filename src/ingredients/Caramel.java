package ingredients;

import boissons.Boisson;

public class Caramel extends DecorateurIngredient {

    public Caramel(Boisson uneBoisson) {
        super(uneBoisson);
    }

    @Override
    public double cout() {
        return super.boisson.cout() + 1;
    }

    @Override
    public String getDescription() {
        return super.boisson.getDescription() + " avec du caramel";
    }
    
    @Override
    public String toString() {
        return "Caramel";
    }
}
