
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each


    public static void main(String[] args) {
        System.out.println("HashSets");
        Set<Person> p=new HashSet<>();
        
        p.add(new Person("X",1,'F'));
        p.add( new Person("Y", 2, 'M'));
       
        for (Person person : p) {
            System.out.println(person);
        }
    }
}