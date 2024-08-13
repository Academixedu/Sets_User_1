import java.util.HashSet;

public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each
public static void main(String[] args) {

HashSet<Person> per = new HashSet<>();
per.add(new Person("fayaz",21,22000,"dev"));
per.add(new Person("sai",21,25000,"hr"));
per.add(new Person("karthik",21,27000,"dev"));

for(Person person:per){
    System.out.println(person);
}

}
}
