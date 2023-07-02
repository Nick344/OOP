package behavioral.strategy;

public class HumanRunner {
    public static void main(String[] args) {
        Human human = new Human();
        human.setActivity(new Coding());
        human.executeActivity();

        human.setActivity(new Read());
        human.executeActivity();

        human.setActivity(new Speak());
        human.executeActivity();
    }
}
