import java.util.*;

import stack.para;
public class HashSets{
    public static void main(String[] args) {
        Set<Person> j=new HashSet<Person>();
      j.add(new Person(2, "rohit", 12000));
      j.add(new Person(1, "rohit", 12000));
      j.add(new Person (2, "rohit", 12000));
      j.add(new Person (3, "mohit", 12000));
      j.add(new Person (4, "surendra", 12000));
      j.add(new Person (5, "nanda", 12000));
       for (Person person : j) {
        System.out.println(person);
        
       }
      } 
    }
   
// Prepare Hashset object here and add person class objects in them iterate it by using for each

