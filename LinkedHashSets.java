import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
  Set<Person> set= new LinkedHashSet<>();
  set.add(new Person("Jahnavi", 20, "Hyderabad"));
  set.add(new Person("sudha", 21, "Vizag"));
  set.add(new Person("Manisha", 22, "Rajahmundry"));
  set.add(new Person("Kavya", 23, "Hyderabad"));
  set.add(new Person("Sudha", 21, "Vizag"));

  Iterator<Person> it= set.iterator();
  while(it.hasNext()){
    System.out.println(it.next());
}
}

}