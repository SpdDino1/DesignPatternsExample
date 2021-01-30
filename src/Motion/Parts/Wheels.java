package Motion.Parts;

import Power.PowerSource;

public class Wheels implements MotionPart {
    //  Could add more wheel properties

    @Override
    public void move(PowerSource powerSource) {
        powerSource.generatePower();
        //  logic to move
    }

    @Override
    public void steer() {
        //  Logic to steer
    }
}
