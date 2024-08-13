import java.util.HashSet;

public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(5);
        h.add(5);
        h.add(3);
        for (Integer integer : h) {
            System.out.println(integer);
        }
}
}
