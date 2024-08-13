package Sets_User_1;
import java.util.*;
public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
   LinkedHashSet <Object>h=new LinkedHashSet<>();
   h.add(new Person("Shre", 22));
   h.add(new Person("Abhi", 23));
   h.add(new Person("Rat", 21));
   Iterator <Object> it=h.iterator();
   for (Object object : h) 
   {
     System.out.println(object);
   }
   System.out.println("---------------");
   while (it.hasNext()) 
   {
      System.out.println(it.next()); 
   }

}
}
