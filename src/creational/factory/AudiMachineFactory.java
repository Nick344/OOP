package creational.factory;

public class AudiMachineFactory implements MachineFactory{
    @Override
    public Machine create() {
        return new AudiMachine();
    }
}
