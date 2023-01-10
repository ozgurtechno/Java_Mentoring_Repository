package Inheritance;

import interfaces.Floatable;

public class Tank extends ArmoredVehicle implements Floatable {

    private String battleField;
    private int personnelCount;
    private int desructionPower;


    public Tank(String name, int range, String fuelType, boolean hasPalette, String battleField, int personnelCount, int desructionPower) {
        super(name, range, fuelType, hasPalette);
        this.battleField = battleField;
        this.personnelCount = personnelCount;
        this.desructionPower = desructionPower;
    }

//    @Override
//    public void transformToFloat() {
//        System.out.println("Override da edilebilir");
//    }
}
