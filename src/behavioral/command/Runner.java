package behavioral.command;

public class Runner {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(new InsertCommand(database),
                new DeleteCommand(database),new SelectCommand(database),new UpdateCommand(database));

        developer.insert();
        developer.select();
        developer.update();
        developer.delete();
    }
}
