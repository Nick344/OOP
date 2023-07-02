package structural.bridge;

public class Runner {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Audi(new LexusDriver()),
                new Lexus(new LexusDriver())
        };

        for (Vehicle vehicle:vehicles) {
            vehicle.developVehicle();
        }
    }
}
