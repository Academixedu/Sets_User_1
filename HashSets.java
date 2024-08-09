import java.util.HashSet;

class Person {
    private String name;
    private int age;

   
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

   
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

   
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}

public class HashSets {
    public static void main(String[] args) {
        
        HashSet<Person> personSet = new HashSet<>();

      
        personSet.add(new Person("Alice", 30));
        personSet.add(new Person("Bob", 25));
        personSet.add(new Person("Charlie", 35));

      
        System.out.println("Person HashSet:");
        for (Person person : personSet) {
            System.out.println(person);
        }
    }
}
