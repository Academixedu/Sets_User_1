import java.util.HashSet;
import java.util.Iterator;

public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each

public static void main(String[] args) {
    HashSet <Integer> s=new HashSet<>();

    s.add(1);
    s.add(8);
    s.add(5);
    s.add(9);
    s.add(5);
    for(int i:s){
        System.out.println(i);
    }



    
HashSet <Person> p=new HashSet<>();

p.add(new Person(20, "sarvesh", 120000, "Dev"));
p.add(new Person(22, "saru", 120000, "Dev"));
p.add(new Person(22, "A", 120000, "Dev"));

Iterator in=p.iterator();
while (in.hasNext()) {
    System.out.println(in.next());
    
}



}


}
