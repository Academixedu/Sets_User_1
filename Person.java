import java.util.Objects;

public class Person {
    private String name;
    private int day;

    // Constructor
    public Person(String name, int day) {
        this.name = name;
        this.day = day;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return "Person{name='" + name + "', day=" + day + '}';
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(name, day);
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return day == person.day && Objects.equals(name, person.name);
    }
}
