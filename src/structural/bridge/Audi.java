package structural.bridge;

public class Audi extends Vehicle{
    public Audi(Driver driver) {
        super(driver);
    }

    @Override
    public void developVehicle() {
        System.out.println("Audi car is ready to use...");
    }
}
