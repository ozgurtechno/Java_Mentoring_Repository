package abstraction.interfaces2.solution;

public class Demo {

    public static void main(String[] args) {

        Vehicle honda = new RacingCar(300);

        Driver driver = new Driver(honda);

        driver.increaseSpeed();

    }





}
