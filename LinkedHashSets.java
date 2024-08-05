import java.util.*;
public class LinkedHashSets{
public static void main(String[]args){
  LinkedHashSet <Person> lp1 = new LinkedHashSet<>();
  lp1.add(new Person(null, 0, '0'));
  lp1.add(new Person("hfdk",98770,'l' ));lp1.add(new Person(null, 0, '0'));
  lp1.add(new Person("hfdk",98770,'l' ));
  lp1.add(new Person(null, 0, '0'));
  lp1.add(new Person("hfdk",98770,'k' ));
  Iterator it = lp1.iterator();
  while (it.hasNext()) {
    System.out.println(it.next());
  }
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
}
}