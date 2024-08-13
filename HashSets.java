package Sets_User_1;

import java.util.*;

public class HashSets
{                                                                                               
// Prepare Hashset object here and add person class objects in them iterate it by using for each
public static void main(String[] args) 
{
    HashSet<Person> h = new HashSet<>();
    h.add(new Person("Shreyash", 22));
    h.add(new Person("Abhishek", 21));
    h.add(new Person("Ratan", 24));
    for (Person person : h) 
    {
       System.out.println(person);    
    }
    
}
  
}
