package main;

import pattern.*;

public class StrategyClient {
    Vehicle vehicle;
    TollCalculator calculator;

    public StrategyClient(Vehicle vehicle,TollCalculator calculator) {
        this.vehicle = vehicle;
        this.calculator = calculator;
    }

    private double doCalc() {
        return calculator.calculate(5, vehicle);
    }

    public static void main(String[] args) {
        var strategy = new StrategyClient(new HeavyVehicle(4), new HeavyVehicleCalculator());
        System.out.println(strategy.doCalc());
    }
}
