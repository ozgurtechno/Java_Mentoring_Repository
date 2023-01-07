package Inheritance;

import interfaces.Flyable;

public class Aircraft extends ArmoredVehicle implements Flyable {

    private String airToAirMissiles;


    // ------------------------------ Constructor --------------------------------------------------------

    public Aircraft(String name, int range, String fuelType, boolean hasPalette, String airToAirMissiles) {
        super(name, range, fuelType, hasPalette);
        this.airToAirMissiles = airToAirMissiles;
    }


    // ------------------------------ Methods --------------------------------------------------------

    @Override
    public void fly() {
        System.out.println("Ucak kanatlariyla ucar...");
    }
}
