import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
  Set<Person> list=new LinkedHashSet<Person>();
  list.add(new Person("Ranjith", 200000.0, "Developer"));
  list.add(new Person("Ranjith", 200000.0, "Developer"));
  list.add(new Person("C", 30000.0, "HR"));
  Iterator<Person> itr=list.iterator();

  while (itr.hasNext()) {
    System.out.println(itr.next());
    
  }

}
}
