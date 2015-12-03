package boissons;

public class Chocolat extends Boisson {

    @Override
    public double cout() {
        return 0.35;
    }

    @Override
    public String getDescription() {
        return "Chocolat";
    }
}
