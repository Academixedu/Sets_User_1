public class Person{
    // prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it
    int id;
    String name;
    public Person(int id, String name, int salary) {
        this.id = id;
        this.name = name;
    }
  
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

 
    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "}";
    }
  }