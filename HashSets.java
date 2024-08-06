import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        // Create HashSet object
        HashSet<Person> personSet = new HashSet<>();

        // Add Person objects to the HashSet
        personSet.add(new Person("manoj", 5));
        personSet.add(new Person("vijay", 7));
        personSet.add(new Person("suresh", 8));

        // Iterate over the HashSet using an Iterator and while loop
        Iterator<Person> iterator = personSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}