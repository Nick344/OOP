package creational.prototype;

public class Runner {
    public static void main(String[] args) {
         Project master = new Project(1, "Live Casino","Source Code...");
        System.out.println(master);


        ProjectFactory projectFactory = new ProjectFactory(master);
        Project cloneMaster = projectFactory.cloneProject();
        System.out.println(cloneMaster);
    }
}
