import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;

public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
Set<Person> set= new LinkedHashSet<>();
  set.add(new Person("shanmukh", 21, "vizag"));
  set.add(new Person("prahaladh shetty", 27, "mangalore"));
  set.add(new Person("chaitanya", 22, "Rajahmundry"));
  set.add(new Person("mahathi", 20, "Hyderabad"));
  set.add(new Person("sarayu", 23, "maharastra"));

  Iterator<Person> it= set.iterator();
  while(it.hasNext()){
    System.out.println(it.next());
}
}
}

