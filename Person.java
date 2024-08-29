public class Person{

    // prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it
 private int id;
 private String name;
 private int salary;
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getSalary() {
    return salary;
}
public void setSalary(int salary) {
    this.salary = salary;
}
public Person(int id, String name, int salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
}
public Person() {
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + salary;
    return result;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Person other = (Person) obj;
    if (id != other.id)
        return false;
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;
    if (salary != other.salary)
        return false;
    return true;
}
@Override
public String toString() {
    return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
 
}

