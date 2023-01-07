package Inheritance;

import interfaces.Flyable;

public class Helicopter extends ArmoredVehicle implements Flyable {

    private String airToGroundMissiles;

    // ------------------------------ Constructor --------------------------------------------------------

    public Helicopter(String name, int range, String fuelType, boolean hasPalette, String airToGroundMissiles) {
        super(name, range, fuelType, hasPalette);
        this.airToGroundMissiles = airToGroundMissiles;
    }

    // ------------------------------ Methods --------------------------------------------------------
    @Override
    public void fly() {
        System.out.println("Helikopter pervane ile ucar...");
    }
}