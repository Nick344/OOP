package creational.factory;


public class TestDriveRunner {
    public static void main(String[] args) {
        MachineFactory machineFactory = createMachineByEmblem("audi");
        Machine machine = machineFactory.create();

        machine.testDrive();
    }


     static MachineFactory createMachineByEmblem(String emblem) {
if (emblem.equalsIgnoreCase("audi")) {
    return new AudiMachineFactory();
} else if (emblem.equalsIgnoreCase("lexus")) {
    return new LexusMachineFactory();
} else throw new RuntimeException(emblem + " is not available for now!");
    }
}
