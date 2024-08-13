import java.util.HashSet;
public class HashSets{
    public static void main(String[] args) {
        HashSet<Person> p = new HashSet();
        p.add(new Person("Karthik",21, "Eluru"));
        p.add(new Person("Sai",20, "Rajmundry"));
        p.add(new Person("Fayaz",21, "H.Junction"));
        p.add(new Person("Karthik", 21, "Eluru"));
        for(Person person:p){
            System.out.println(person);
        }
    }
}
