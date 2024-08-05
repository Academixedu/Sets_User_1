import java.util.HashSet;
import java.util.Set;

public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each
       public static void main(String[] args){
       Set<Person> p =new HashSet<>();

       p.add(new Person(1,"Srinadh",2000.25,"Developer"));
       p.add(new Person(1, "Srinadh", 2000.25, "Developer"));
       p.add(new Person(2,"ABC",2000.25,"HR"));
       p.add(new Person(3, "XYZ", 2000.25, "Team lead"));

      for(Person pp:p){

        System.out.println(pp);
      }

       
}
}
