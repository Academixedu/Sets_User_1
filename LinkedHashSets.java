
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {

  public static void main(String[] args) {

    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

    linkedHashSet.add("Element1");
    linkedHashSet.add("Element2");
    linkedHashSet.add("Element3");
    linkedHashSet.add("Element4");

    System.out.println("LinkedHashSet: " + linkedHashSet);

    linkedHashSet.remove("Element2");
    System.out.println("After removal: " + linkedHashSet);

    Iterator<String> iterator = linkedHashSet.iterator();
    System.out.println("Iterating over LinkedHashSet:");
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    boolean containsElement3 = linkedHashSet.contains("Element3");
    System.out.println("LinkedHashSet contains 'Element3': " + containsElement3);

    linkedHashSet.clear();
    System.out.println("After clearing: " + linkedHashSet);
  }
}