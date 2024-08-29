import java.util.HashSet;

public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each

public static void main(String[] args) {
    HashSet H = new HashSet();
    H.add(new Person(1, "Salaar"));
    H.add(new Person(1, "Salaar"));
    H.add(new Person(2, "Kalki"));

    for (Object object : H) {
        System.out.println(object);
    }
}
}
