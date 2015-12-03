package ingredients;

import boissons.Boisson;

public class Chantilly extends DecorateurIngredient {

    public Chantilly(Boisson uneBoisson) {
        super(uneBoisson);
    }

    @Override
    public double cout() {
        return super.boisson.cout() + 2;
    }

    @Override
    public String getDescription() {
        return super.boisson.getDescription() + " avec de la chantilly";
    }
    
    @Override
    public String toString() {
        return "Chantilly";
    }
}
