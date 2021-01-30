package Motion.Types;

import Motion.Parts.Wheels;
import Power.PowerSource;

public interface Drivable {
    void drive(PowerSource powerSource, Wheels wheels);
    void steerDrive(Wheels wheels);
}
