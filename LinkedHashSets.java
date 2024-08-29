import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop

  LinkedHashSet<Person> sm = new LinkedHashSet();
  sm.add(new Person(22,"hello"));
  sm.add(new Person(24,"mirza"));
  sm.add(new Person(1,"Academix"));

  Iterator a =sm.iterator();
  while(a.hasNext()){
    System.err.println(a.next());
  }
}
}
