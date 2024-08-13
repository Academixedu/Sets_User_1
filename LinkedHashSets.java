import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
  LinkedHashSet<Integer>per=new LinkedHashSet();
  per.add(1);
  per.add(2);
  per.add(3);
  per.add(2);
  Iterator i=per.iterator();
  while (i.hasNext()) {
    System.out.println(i.next());
  }



}}
