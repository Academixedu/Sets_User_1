import java.util.HashSet;
public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each

    public static void main(String[] args) {
        HashSet<Integer> p = new HashSet<>();
        p.add(1);
        p.add(2);
        p.add(4);
        p.add(3);
        for (Integer integer : p) {
            System.out.println(integer);
        }
    }
}