import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
  LinkedHashSet<Person> p = new LinkedHashSet<>();
  p.add(new Person(1, "bal", 4000));
  p.add(new Person(2, "man", 5000));
  p.add(new Person(3, "ban", 4000));

  Iterator<Person> i = p.iterator();
  while (i.hasNext()) {
      System.out.println(i.next());
  }
}
}

