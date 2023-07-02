package structural.adapter;

public class Adapter extends OnlineMarket implements Database {
    @Override
    public void remove() {
        removeObject();
    }

    @Override
    public void save() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }
}
