import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashSets{

  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop

public class main {
    public static void main(String[] args) {
        Set<Person> pe = new LinkedHashSet<>();

        pe.add(new Person("mello", 20));
        pe.add(new Person("ram", 21));
        pe.add(new Person("kittu", 23));

        Iterator<Person> iterator = pe.iterator();
        
        while (iterator.hasNext()) {
            Person p = iterator.next();
            System.out.println(p);
        }

    }
}

}

