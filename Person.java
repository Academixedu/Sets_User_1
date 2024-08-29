public class Person{
// prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it

private int Id;
public int getId() {
    return Id;
}
public void setId(int id) {
    Id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
private String name;
public Person(int id, String name) {
    Id = id;
    this.name = name;
}
@Override
public String toString() {
    return "Person [Id=" + Id + ", name=" + name + "]";
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Id;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
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
    if (Id != other.Id)
        return false;
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;
    return true;
}



}
