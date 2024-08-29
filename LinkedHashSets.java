import java.util.LinkedHashSet;
public class LinkedHashSets{
  public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
    LinkedHashSet<Person> s=new LinkedHashSet<>();
    s.add(new Person(1,"Revathi", 'F', 50000));
    s.add(new Person(1,"Revathi", 'F', 50000));
    s.add(new Person(2,"Lavanya", 'F', 60000));
    s.add(new Person(3,"Raju",'M', 30000));
    for (Person p : s) {
      System.out.println(p);
    }
  }
}
