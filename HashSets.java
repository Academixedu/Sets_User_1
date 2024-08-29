import java.util.HashSet;
import java.util.Set;
public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each
    public static void main(String[] args) {
        Set<Person> s=new HashSet<>();
        s.add(new Person(1,"Revathi", 'F', 50000));
        s.add(new Person(1,"Revathi", 'F', 50000));
        s.add(new Person(3,"Lavanya", 'F', 60000));
        s.add(new Person(2,"Ram", 'M', 40000));
        for (Person p : s) {
            System.out.println(p);
        }
    }
}
