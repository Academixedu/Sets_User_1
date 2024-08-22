import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
   LinkedHashSet<Person> a=new LinkedHashSet<>();
 a.add(new Person(54,"Mani",21));
 a.add(new Person(5,"yogi",23));
 a.add(new Person(96,"sai",22));
 Iterator<Person> i=a.iterator();
 while(i.hasNext()){
  System.out.println(i.next());
 }

}
}

