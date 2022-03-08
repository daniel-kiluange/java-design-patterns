package pattern;

public class HeavyVehicleCalculator implements TollCalculator{

    private static final HeavyVehicleCalculator instance = new HeavyVehicleCalculator();

    private static final double TAX = 5.73;
    private static final double AXLE_TAX = 3.10;

    static public HeavyVehicleCalculator getInstance() {
        return instance;
    }

    @Override
    public double calculate(int period,Vehicle vehicle) {
        var heavyVehicle = (HeavyVehicle) vehicle;
        var totalAxleTax = heavyVehicle.axles > 1 ? heavyVehicle.axles * AXLE_TAX : 0;
        return period * TAX + totalAxleTax;
    }
}
