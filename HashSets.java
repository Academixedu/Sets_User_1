import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        // Create HashSet object
        HashSet<Person> personSet = new HashSet<>();

        // Add Person objects to the HashSet
        personSet.add(new Person("Double Ismart", 15));
        personSet.add(new Person("Devara", 27));
        personSet.add(new Person("Pushpa", 8));

        // Iterate over the HashSet using an Iterator and while loop
        Iterator<Person> iterator = personSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
