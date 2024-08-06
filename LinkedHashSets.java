import java.util.LinkedHashSet;
import java.util.Iterator;

// Define the Person class
class Person {
    String name;
    int day;

    // Constructor
    public Person(String name, int day) {
        this.name = name;
        this.day = day;
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return "Person{name='" + name + "', day=" + day + '}';
    }
}

public class LinkedHashSets {
    public static void main(String[] args) {
        // Create LinkedHashSet object
        LinkedHashSet<Person> personSet = new LinkedHashSet<>();

        // Add Person objects to the LinkedHashSet
        personSet.add(new Person("Double Ismart", 15));
        personSet.add(new Person("Devara", 27));
        personSet.add(new Person("Pushpa", 8));

        // Iterate over the LinkedHashSet using an Iterator and a while loop
        Iterator<Person> iterator = personSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
