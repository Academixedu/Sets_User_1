import java.util.LinkedHashSet;

import java.util.Iterator;

public class LinkedHashSets{
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
  public static void main(String[] args) {
        LinkedHashSet<Person> p = new LinkedHashSet();
        p.add(new Person("Karthik",21, "Eluru"));
        p.add(new Person("Sai",20, "Rajmundry"));
        p.add(new Person("Fayaz",21, "H.Junction"));
        p.add(new Person("Karthik", 21, "Eluru"));
        Iterator<Person> iterator = p.iterator();
        while(iterator.hasNext()){
          System.out.println(iterator.next());
        }
    }
}
