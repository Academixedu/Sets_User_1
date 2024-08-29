import java.util.HashSet;

public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each
@SuppressWarnings("unchecked")
public static void main(String[] args) {
    


HashSet m =new HashSet<>();
    m.add(new Person(22,"shoeb"));
    m.add(new Person(24,"mirza" ));

    for (Object  p:m){
        System.out.println(p);
    }

}
}
