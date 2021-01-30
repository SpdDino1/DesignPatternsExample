package Motion.Types;

import Motion.Parts.Wings;
import Power.PowerSource;

public interface Flyable {
    void fly(PowerSource powerSource, Wings wings);
    void steerFly(Wings wings);
}
