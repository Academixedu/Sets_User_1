import java.util.*;
public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each
public static void main(String[] args) {
    

Set<Person>m=new HashSet<>();
m.add(new Person(1,"hello",1000000));
for(Person k:m){
    System.out.println(k);
}
}
}