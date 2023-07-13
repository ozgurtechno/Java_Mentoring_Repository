package Inheritance;

import interfaces.Flyable;

public class Aircraft extends ArmoredVehicle implements Flyable {

    private int airToAirMissiles;

    // ------------------------------ Constructor --------------------------------------------------------

    public Aircraft(String name, int range, String fuelType, boolean hasPalette, int airToAirMissiles) {
        super(name, range, fuelType, hasPalette);
        this.airToAirMissiles = airToAirMissiles;
    }

    // ------------------------------ Methods --------------------------------------------------------

    @Override
    public void fly() {
        // Bu oyunda ucagin ucma usulleri burada tanimlanacak...
        System.out.println("Ucak motor calistirdi ve ucusa basladi...");
    }

    @Override
    public void attack() {
        System.out.println("Havadan havaya fuze atildi");
    }

}
