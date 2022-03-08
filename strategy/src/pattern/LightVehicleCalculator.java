package pattern;

public class LightVehicleCalculator implements TollCalculator{

    private static final double TAX = 1.54;
    @Override
    public double calculate(int period,Vehicle vehicle) {
        return period * TAX;
    }
}
