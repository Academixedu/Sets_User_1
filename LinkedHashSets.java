 package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
//public class LinkedHashSets{
   // public static void main(String[]args){
      // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
    
    
public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<Person> p=new LinkedHashSet<>();
        p.add(new Person("Ammu", 18));
        p.add(new Person("Queen", 100));
        p.add(new Person("Bharath", 22));
        Iterator<Person> Iterator = p.iterator();
        while(Iterator.hasNext()){
            Person person = Iterator.next();
            System.out.println(p);
        }
         
    }
}
