import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
  LinkedHashSet<Person> p = new LinkedHashSet<>();
p.add(new Person("fayaz",21,22000,"dev"));
p.add(new Person("sai",21,25000,"hr"));
p.add(new Person("karthik",21,27000,"dev"));
Iterator<Person> i = p.iterator();
while(i.hasNext()){
  System.out.println(i.next());
}
}
}
