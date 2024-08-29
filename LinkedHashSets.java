import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSets{
public static void main(String[]args){
     LinkedHashSet<Person> p = new LinkedHashSet<>();
  p.add(new Person(1, "Manohar", 4000));
  p.add(new Person(2, "Hari", 5000));
  p.add(new Person(3, "Bhuvi", 4000));

  Iterator<Person> i = p.iterator();
  while (i.hasNext()) {
      System.out.println(i.next());
  }
}
}
