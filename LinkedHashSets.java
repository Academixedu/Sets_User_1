import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
LinkedHashSet<Person> p = new LinkedHashSet<>();
p.add(new Person("sujatha",21,22000,"developer"));
p.add(new Person("swarupa",21,25000,"developer"));
p.add(new Person("kavitha",21,27000,"developer"));
Iterator<Person> i = p.iterator();
while(i.hasNext()){
  System.out.println(i.next());
}
}
}
