package Motion.Parts;

import Power.PowerSource;

public interface MotionPart {
    void move(PowerSource powerSource);
    void steer();
}
