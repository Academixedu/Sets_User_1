import java.util.HashSet;
import java.util.*;

public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each

public static void main(String[]args){
    Set<Person> list = new HashSet<Person>();
    list.add(new Person("Ranjith", 20000.0, "developer"));
    list.add(new Person("Ranjith", 20000.0, "developer"));
    list.add(new Person("R", 20000.0, "HR"));

    for(Person p:list){
        System.out.println(p);
    }
}
}
