import java.util.HashSet;
import java.util.Iterator;

public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each

public static void main(String[] args) {
    
HashSet<Integer>p=new HashSet<>();
p.add(1);
p.add(2);
p.add(3);
p.add(6);
p.add(3);
for (Integer integer : p) {
    System.out.println(integer);
}
HashSet<String>h=new HashSet<>();
h.add("Abhishek");
h.add("Sarvesh");
h.add("Shreyash");
Iterator<String>i=h.iterator();
while (i.hasNext()) {
    System.out.println(i.next());
}
HashSet<Person>h1=new HashSet<>();
h1.add(new Person(1,"Abhishek",150000,"Dev"));
h1.add(new Person(2, "Shreyash", 10000, "Dev"));
h1.add(new Person(3, "Ratan", 120000, "Dev"));
for (Person person:h1){
    System.out.println(person);
}


}


}
