import java.util.*;

public class HashSets{
    public static void main(String[] args) {
        Set<Person> p1 = new HashSet<>();
        p1.add(new Person("pradeep",254.4,'M'));
        p1.add(new Person("pradeep",254.4,'M'));
        p1.add(new Person("pradeep",254.4,'M'));
        for(Person p:p1)
        System.out.println(p);
    }
// Prepare Hashset object here and add person class objects in them iterate it by using for each
}
