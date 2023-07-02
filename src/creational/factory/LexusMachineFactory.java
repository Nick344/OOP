package creational.factory;

public class LexusMachineFactory implements MachineFactory {
    @Override
    public Machine create() {
        return new LexusMachine();
    }
}
