import java.util.HashSet;

public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each
public static void main(String[] args) {
    HashSet<Person> myHashSet = new HashSet<>();
    myHashSet.add(new Person("person 1",20,"address 1","9087654321","person1@gmail.com",3456.98));
    myHashSet.add(new Person("person 1",20,"address 1","9087654321","person1@gmail.com",3456.98));
    myHashSet.add(new Person("person 1",20,"address 1","9087654321","person1@gmail.com",3456.98));
    myHashSet.add(new Person("person 2",20,"address 2","9087654321","person2@gmail.com",3456.98));
    myHashSet.add(new Person("person 3",20,"address 3","9087654321","person3@gmail.com",3456.98));
    myHashSet.add(new Person("person 4",20,"address 4","9087654321","person4@gmail.com",3456.98));

    for(Person i : myHashSet){
        System.out.println("Name : "+i.getName()+" Age : " + i.getName() + " Address : " + i.getAddress() + " PhoneNumber : " + i.getPhoneNumber() + " Email : " + i.getEmail() + " Salary : " + i.getSalary());
    }
}
}
