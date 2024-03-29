package abstraction.interfaces2.solution;


/**
 * Created by bsferreira on 10-04-2016.
 */
public class RacingCar implements Vehicle{

    private final int maxFuel;
    private int remainingFuel;
    private int power;

    public RacingCar(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    @Override
    public void accelerate() {
        power++;
        remainingFuel--;
    }
}
