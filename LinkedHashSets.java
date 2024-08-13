import java.util.LinkedHashSet;
import java.util.Iterator;
public class LinkedHashSets{
public static void main(String[]args){

  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
  
 LinkedHashSet<Person> a=new LinkedHashSet<>();
 a.add(new Person(54,"sri",21));
 a.add(new Person(5,"syam",23));
 a.add(new Person(96,"keer",22));
 Iterator<Person> i=a.iterator();
 while(i.hasNext()){
  System.out.println(i.next());
 }
}
}