package abstraction.interfaces2.coupled;


/**
 * Created by bsferreira on 17-04-2016.
 */
public class Driver {

    private RacingCar vehicle; // Tightly coupled

    public Driver(){
        this.vehicle = new RacingCar(100);
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
}
