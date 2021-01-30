package Motion.Parts;

import Power.PowerSource;

public class Wings implements MotionPart {
    //  Could add more wing properties

    @Override
    public void move(PowerSource powerSource) {
        powerSource.generatePower();
        //  Logic to fly
    }

    @Override
    public void steer() {
        //  Logic to steer
    }
}
