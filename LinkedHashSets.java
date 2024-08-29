import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {
        // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
        LinkedHashSet<Person> myLinkedHashSet = new LinkedHashSet<>();
        myLinkedHashSet.add(new Person("person 1",20,"address 1","9087654321","person1@gmail.com",3456.98));
        myLinkedHashSet.add(new Person("person 1",20,"address 1","9087654321","person1@gmail.com",3456.98));
        myLinkedHashSet.add(new Person("person 1",20,"address 1","9087654321","person1@gmail.com",3456.98));
        myLinkedHashSet.add(new Person("person 2",20,"address 2","9087654321","person2@gmail.com",3456.98));
        myLinkedHashSet.add(new Person("person 3",20,"address 3","9087654321","person3@gmail.com",3456.98));
        myLinkedHashSet.add(new Person("person 4",20,"address 4","9087654321","person4@gmail.com",3456.98));

        Iterator<Person> iterator = myLinkedHashSet.iterator();

        while(iterator.hasNext()){
            Person i = iterator.next();
            System.out.println("Name : "+i.getName()+" Age : " + i.getName() + " Address : " + i.getAddress() + " PhoneNumber : " + i.getPhoneNumber() + " Email : " + i.getEmail() + " Salary : " + i.getSalary());
        }
    }
}
