import java.util.LinkedHashSet;
import java.util.Iterator;

// Define the Person class
class Person {
    String name;
    int roll;

    // Constructor
    public Person(String name, int roll) {
        this.name = name;
        this.roll= roll;
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return "Person{name='" + name + "', roll=" + roll + '}';
    }
}

public class LinkedHashSets {
    public static void main(String[] args) {
        // Create LinkedHashSet object
        LinkedHashSet<Person> personSet = new LinkedHashSet<>();

        // Add Person objects to the LinkedHashSet
        personSet.add(new Person("Mekam", 5));
        personSet.add(new Person("John", 7));
        personSet.add(new Person("Mekam", 8));

        // Iterate over the LinkedHashSet using an Iterator and a while loop
        Iterator<Person> iterator = personSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}