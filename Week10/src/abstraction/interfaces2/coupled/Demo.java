package abstraction.interfaces2.coupled;

public class Demo {

    public static void main(String[] args) {

        RacingCar honda = new RacingCar(300);

        Driver driver = new Driver();
        driver.increaseSpeed();
    }
}
