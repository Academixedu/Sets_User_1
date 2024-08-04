import java.util.Set;
import java.util.HashSet;

public class HashSets{
    public static void main(String[] args) {
// Prepare Hashset object here and add person class objects in them iterate it by using for each
Set<Person> set = new HashSet<Person>();
set.add(new Person("Nani", 25, "Vizag"));
set.add(new Person("Hari", 20, "Vijayawada"));
set.add(new Person("Lucky", 30, "Hyderabad"));
set.add(new Person("Lucky", 30, "Hyderabad"));
set.add(new Person("kiran", 27, "Rajamaundry"));
for(Person p : set){
    System.out.println(p);
}
    }
}
