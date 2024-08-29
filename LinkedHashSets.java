import java.util.*;
public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
  LinkedHashSet<Person> v=new LinkedHashSet<>();
  v.add(new Person(1,"hello2",10000000));
Iterator m=v.iterator();
while(m.hasNext()){
  System.out.println(m.next());
}

}
}