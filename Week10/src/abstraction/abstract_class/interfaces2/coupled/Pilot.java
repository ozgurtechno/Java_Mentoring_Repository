package abstraction.abstract_class.interfaces2.coupled;


/**
 * Created by bsferreira on 17-04-2016.
 */
public class Pilot {

    private RacingCar vehicle;

    public Pilot(){
        this.vehicle = new RacingCar(100);
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
}
