package structural.bridge;

public class Lexus extends Vehicle{
    public Lexus(Driver driver) {
        super(driver);
    }

    @Override
    public void developVehicle() {
        System.out.println("Lexus car is ready to use...");
    }
}
