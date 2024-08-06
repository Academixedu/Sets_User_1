import java.util.Objects;

public class Person {
    private String name;
    private int roll;
    public Person(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", roll=" + roll + "]";
    }
    public int hashCode() {
        return Objects.hash(name, roll);
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return roll == person.roll&& Objects.equals(name, person.name);
    }
}