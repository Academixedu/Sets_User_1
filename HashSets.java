import java.util.Set;
import java.util.HashSet;

public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each
public static void main(String[]args){
    Set<Person> set= new HashSet<>();
     set.add(new Person("Kavya", 20, "Hyderabad"));
     set.add(new Person("Sai", 21, "Vizag"));
     set.add(new Person("Neha", 22, "Rajahmundry"));
     set.add(new Person("Bhavya", 23, "Hyderabad"));
     set.add(new Person("Sai", 21, "Vizag"));

     for(Person p:set)
     {
         System.out.println(p);
    }
}
}
