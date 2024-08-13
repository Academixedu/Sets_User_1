import java.util.HashSet;

public class HashSets{
    public static void main(String[] args) {
        HashSet<Person> h=new HashSet<>();
        h.add(new Person(1,"pavani",20000));
        h.add(new Person(2, "ganesh", 30000));
        h.add(new Person(1,"ramya",34000));
        for (Person person : h) {
            System.out.println(person);
        
    }
// Prepare Hashset object here and add person class objects in them iterate it by using for each
}
}