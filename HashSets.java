import java.util.HashSet;

public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each
public static void main(String args[]){
    HashSet<Person> p=new HashSet<>();
    p.add(new Person(1,"syam",22));

    p.add(new Person(1,"kumar",22));
   
    p.add(new Person(2,"sri",22));

    //p.add(new Person(1,"kumar",22));

 for(Person i:p){
    System.out.println(i);
 }
}
}