import Motion.Parts.Wheels;
import Motion.Parts.Wings;
import Motion.Types.Drivable;
import Motion.Types.Flyable;
import Power.PowerSource;

public class RoadAirCar extends CarBase implements Drivable, Flyable {
    Wheels wheels;
    Wings wings;

    public RoadAirCar(String brand, String model, Integer cost, PowerSource powerSource, Wheels wheels, Wings wings) {
        super(brand, model, cost, powerSource);
        this.wheels = wheels;
        this.wings = wings;
    }

    //  TODO Is there a way to make this neater?
    //  For every interface implemented a new drive and steer method must be added..
    //  If you make a generic drive and steer for MotionPart, you can't ensure the concrete parts are being added

    @Override
    public void drive(PowerSource powerSource, Wheels wheels) {
        wheels.move(powerSource);
    }

    @Override
    public void steerDrive(Wheels wheels) {
        wheels.steer();
    }

    @Override
    public void fly(PowerSource powerSource, Wings wings) {
        wings.move(powerSource);
    }

    @Override
    public void steerFly(Wings wings) {
        wings.steer();
    }
}
