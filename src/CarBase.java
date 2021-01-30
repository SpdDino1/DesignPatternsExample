import Fuel.Fuel;
import Motion.Parts.MotionPart;
import Power.PowerSource;

public class CarBase {
    //  Car details that every car must have. Could add more
    String brand;
    String model;
    Integer cost;

    PowerSource powerSource;

    public CarBase(String brand, String model, Integer cost, PowerSource powerSource) {
        this.brand = brand;
        this.model = model;
        this.cost = cost;
        this.powerSource = powerSource;
    }

    void refuel(Fuel fuel, int amount){
        //  TODO Should add 'FuelTank' and make it take it from there. This isn't a powerSource behaviour..
        powerSource.consumeFuel(fuel, amount);
    }

}