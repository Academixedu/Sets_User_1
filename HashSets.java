import java.util.HashSet;

public class HashSets
{
// Prepare Hashset object here and add person class objects in them iterate it by using for each


public static void main(String[] args) 
{
    HashSet<Person> set=new HashSet<>();

    set.add(new Person("shubham",21 ));
    set.add(new Person("vikas", 21));
    set.add(new Person("atul", 23));


    for(Object obj :set)
    {
        System.out.println(obj);
    }


}




}


