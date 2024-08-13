import java.util.HashSet;

public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each
public static void main(String[] args) {

HashSet<Person> p = new HashSet<>();
p.add(new Person("Sujatha",21,23456,"dev"));
p.add(new Person("Swarupa",21,234567,"hr"));
p.add(new Person("Kavitha",21,234562,"dev"));

for(Person person:p){
    System.out.println(person);
}

}
}
