import java.util.HashSet;
import java.util.Set;

public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each
public static void main(String[]args){
    Set<Person> set= new HashSet<>();
     set.add(new Person("Krishna", 20, "Hyderabad"));
     set.add(new Person("Sailu", 21, "Vizag"));
     set.add(new Person("mahathi", 22, "Rajahmundry"));
     set.add(new Person("Bhavya", 23, "Hyderabad"));
     set.add(new Person("Sailu", 21, "Vizag"));

     for(Person p:set)
     {
         System.out.println(p);
    }
}
}

