package behavioral.iterator;

public class Runner {
    public static void main(String[] args) {
        String[] skills = {"write","English","c++","JS","Java"};

        Developer developer = new Developer("Nik",skills);
        Iterator iterator = developer.getIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
