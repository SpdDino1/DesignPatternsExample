package Power;

import Fuel.Fuel;
import Fuel.Petrol;

public class PetrolEngine implements PowerSource{
    @Override
    public int generatePower() {
        return 0;
    }

    @Override
    public void consumeFuel(Fuel fuel, int amount) {
        if (!(fuel instanceof Petrol)){
            //  Could create a custom exception
            throw new RuntimeException();
        }
    }
}
