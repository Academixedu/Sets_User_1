import java.util.*;

import stack.para;

public class LinkedHashSets{
public static void main(String[]args){
  LinkedHashSet<Person> h= new LinkedHashSet<Person>();
  h.add(new Person(1,"rohit", 18000));
  h.add(new Person(12,"rohit",10000));
  h.add(new Person(45, "mohit", 111000));
  h.add(new Person(12,"rohit",10000));
  Iterator<Person> l=h.iterator();
  while (l.hasNext()) {
   System.out.println(l.next());
   
  }

  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
}
}
