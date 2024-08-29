import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
  Set<Person> person=new LinkedHashSet<Person>();
  person.add(new Person("A",20,'m'));
  person.add(new Person("B",23,'f'));
  Iterator<Person> iterator=person.iterator();
  while(iterator.hasNext()){
    Person Person=iterator.next();
    System.out.println(Person);
  }
}
}
