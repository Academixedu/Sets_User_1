import java.util.HashSet;
import java.util.Set;
public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each




    public static void main(String[] args) {
        
        Set<Person> personSet = new HashSet<>();

       
        personSet.add(new Person("John Doe", 30, "john.doe@example.com"));
        personSet.add(new Person("Jane Smith", 25, "jane.smith@example.com"));
        personSet.add(new Person("Alice Johnson", 28, "alice.johnson@example.com"));
        personSet.add(new Person("Bob Brown", 35, "bob.brown@example.com"));

        
        for (Person person : personSet) {
            System.out.println(person);
        }
    }
}

