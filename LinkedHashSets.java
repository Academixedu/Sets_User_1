import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets{

 
 
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop

   public static void main(String[] args) {
        // Create a LinkedHashSet of Person objects
        Set<Person> personSet = new LinkedHashSet<>();

        // Add Person objects to the LinkedHashSet
        personSet.add(new Person("John Doe", 30, "john.doe@example.com"));
        personSet.add(new Person("Jane Smith", 25, "jane.smith@example.com"));
        personSet.add(new Person("Alice Johnson", 28, "alice.johnson@example.com"));
        personSet.add(new Person("Bob Brown", 35, "bob.brown@example.com"));

        // Iterate over the LinkedHashSet using an Iterator and a while loop
        Iterator<Person> iterator = personSet.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }
    }
}


