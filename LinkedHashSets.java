import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets{
public static void main(String[]args){
  LinkedHashSet<Person>p=new LinkedHashSet<>();
  p.add(new Person(1,"pavs",14000));
  p.add(new Person(1,"sai",20000));
  p.add(new Person(1,"pavan",20000));
  Iterator<Person> i=p.iterator();
while(i.hasNext()){
    System.out.println(i.next());
}
        


  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
}}
