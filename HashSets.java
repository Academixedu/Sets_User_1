import java.util.HashSet;
import java.util.Set;
public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each


 public class person {
    public static void main(String[] args) {
        Set<Person> person1 = new HashSet<>();
        person1.add(new Person("vijay", 20));
        person1.add(new Person("tobi", 23));
        person1.add(new Person("marsh", 26));
   
        for(person kl:person1){
            System.out.println(kl);
        }
    }
    }
}


