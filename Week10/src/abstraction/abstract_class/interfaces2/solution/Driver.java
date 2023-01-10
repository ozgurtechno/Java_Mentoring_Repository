package abstraction.abstract_class.interfaces2.solution;


/**
 * Created by bsferreira on 17-04-2016.
 */
public class Driver {
    private final Vehicle vehicle;

    public Driver(final Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
}


