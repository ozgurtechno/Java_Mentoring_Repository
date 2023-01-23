package Static_Demo;

public class Bicycle {

    public String type;
    public int gear;
    public static int bicycleCount;

    public Bicycle(String type, int gear) {
        this.type = type;
        this.gear = gear;
        bicycleCount++;
    }

    public void changeGear(){
        gear++;
    }

    public static int countBcycles(){
        return bicycleCount;
    }
}
