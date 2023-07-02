package creational.builder;

public class Runner {
    public static void main(String[] args) {
        Person person = new PersonBuilderImpl().setName("Nik").setAge(20).build();
        System.out.println(person);
    }
}
