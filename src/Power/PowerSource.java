package Power;

import Fuel.Fuel;

public interface PowerSource {
    int generatePower();
    void consumeFuel(Fuel fuel, int amount);
}
