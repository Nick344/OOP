package structural.adapter;

public class MarketRunner {
    public static void main(String[] args) {
        Database database = new Adapter();

        database.remove();
        database.save();
        database.update();
    }
}
