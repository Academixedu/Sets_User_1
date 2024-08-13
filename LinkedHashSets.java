
import java.util.*;

public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop

  
LinkedHashSet <Integer> s=new LinkedHashSet<>();

    s.add(1);
    s.add(5);
    s.add(3);
    s.add(9);
    s.add(5);
    for(int i:s){
        System.out.println(i);
    }



  LinkedHashSet<Person>p=new LinkedHashSet<>();

p.add(new Person(21, "sarvesh", 120000, "Dev"));
p.add(new Person(23, "saru", 120000, "Dev"));
p.add(new Person(23, "A", 120000, "Dev"));


Iterator in=p.iterator();
while(in.hasNext()){
  System.out.println(in.next());
}





}
}
