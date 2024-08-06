import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<Person> personSet = new LinkedHashSet<>();
        personSet.add(new Person(1, "Alice", 50000, "Engineer"));
        personSet.add(new Person(2, "Bob", 60000, "Manager"));
        personSet.add(new Person(3, "Charlie", 70000, "Director"));

        Iterator<Person> iterator = personSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
