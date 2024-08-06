import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();

        personSet.add(new Person(1, "Alice", 50000.0, "Engineer"));
        personSet.add(new Person(2, "Bob", 60000.0, "Manager"));
        personSet.add(new Person(3, "Charlie", 70000.0, "Developer"));

        for (Person person : personSet) {
            System.out.println(person);
        }
    }
}

class Person {
    private int pid;
    private String pname;
    private double psal;
    private String pdesg;

    public Person(int pid, String pname, double psal, String pdesg) {
        this.pid = pid;
        this.pname = pname;
        this.psal = psal;
        this.pdesg = pdesg;
    }
    @Override
    public String toString() {
        return "Person [pid=" + pid + ", pname=" + pname + ", psal=" + psal + ", pdesg=" + pdesg + "]";
    }
}
