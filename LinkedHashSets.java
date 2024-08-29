import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop

  LinkedHashSet l = new LinkedHashSet<>();
  l.add(new Person(1, "Salaar"));
  l.add(new Person(1, "Salaar"));
  l.add(new Person(2, "Kalki"));

  Iterator i = l.iterator();

  while (i.hasNext()) {
    System.out.println(i.next());
  }
}
}
