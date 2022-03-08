package main;

import pattern.*;

public class StrategyClient {
    Vehicle vehicle;
    TollCalculator calculator;

    public StrategyClient(Vehicle vehicle) {
        this.vehicle = vehicle;

        if (vehicle instanceof LightVehicle) calculator = new LightVehicleCalculator();
        if (vehicle instanceof HeavyVehicle) calculator = HeavyVehicleCalculator.getInstance();
    }

    private double doCalc() {
        return calculator.calculate(5, vehicle);
    }

    public static void main(String[] args) {
        var strategy = new StrategyClient(new HeavyVehicle(4));
        System.out.println(strategy.doCalc());
    }
}
