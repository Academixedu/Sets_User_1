import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop

       Set<Person> l = new LinkedHashSet<>();

       l.add(new Person(1, "ABC", 2220.25, "Developer"));
       l.add(new Person(2, "xyz", 2420.85, "HR"));
       l.add(new Person(1, "ABC", 2220.25, "Developer"));
       l.add(new Person(4, "PQR", 5020.00, "Team Lead"));

       Iterator<Person> ll = l.iterator();

       while(ll.hasNext()){

        System.out.println(ll.next());
       }




}
}
