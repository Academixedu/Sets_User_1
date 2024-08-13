import java.util.*;

public class LinkedHashSets
{
public static void main(String[]args)
{
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop


  LinkedHashSet <Object> set=new LinkedHashSet<>();

  set.add("Java");
  set.add(25);
  set.add(null);
  set.add(25);
  set.add(56);

  Iterator<Object> i=set.iterator();

  while (i.hasNext()) 
  {
    System.out.println(i.next());
  }
}
}