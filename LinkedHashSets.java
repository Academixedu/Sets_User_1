
  import java.util.Iterator;
  import java.util.LinkedHashSet;
  public class LinkedHashSets{
      // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
  public static void main(String[]args){
       LinkedHashSet<Person> d = new LinkedHashSet<>();
    d.add(new Person(1, "dinesh"));
    d.add(new Person(2, "vijay"));
    d.add(new Person(3, "rohan"));
  
    Iterator<Person> i = d.iterator();
    while (i.hasNext()) {
        System.out.println(i.next());
    }
  }
  }
