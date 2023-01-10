package Inheritance;

public class ArmoredVehicle {

    private String name;
    private int range;
    private String fuelType;
    private boolean hasPalette;

    // ------------------------------ Constructor --------------------------------------------------------

    public ArmoredVehicle(String name, int range, String fuelType, boolean hasPalette) {
        this.setRange(range);
        this.name = name;
        this.fuelType = fuelType;
        this.hasPalette = hasPalette;
    }

    // ------------------------------ Getter Setter --------------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        if (range > 1000){
            //throw new IllegalArgumentException("Bu deger atanamaz");
        }
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isHasPalette() {
        return hasPalette;
    }

    public void setHasPalette(boolean hasPalette) {
        this.hasPalette = hasPalette;
    }
}
