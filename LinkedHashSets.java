import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
  Set<Person> set = new LinkedHashSet<>();
  set.add(new Person("Nani", 25, "Vizag"));
  set.add(new Person("Hari", 20, "Vijayawada"));
  set.add(new Person("Lucky", 30, "Hyderabad"));
  set.add(new Person("Lucky", 30, "Hyderabad"));
  set.add(new Person("kiran", 27, "Rajamaundry"));
  Iterator<Person> iterator = set.iterator();
  while(iterator.hasNext()){
    System.out.println(iterator.next());
  }
  }
}
