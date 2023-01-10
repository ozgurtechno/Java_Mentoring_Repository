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
        System.out.println("Ucak motor calistirdi ve ucusa basladi...");
    }

    public void attackEnemy(){
        System.out.println("Iskaladin..Bir daha dene...");
        this.airToAirMissiles--;
    }
}
