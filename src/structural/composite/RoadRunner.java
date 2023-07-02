package structural.composite;

public class RoadRunner {
    public static void main(String[] args) {
        Team team = new Team();

        Driver firstDriver = new LexusDriver();
        Driver secondDriver = new AudiDriver();

        team.add(firstDriver);
        team.add(secondDriver);

        team.competition();
    }
}
