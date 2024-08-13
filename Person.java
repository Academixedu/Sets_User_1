public class Person implements Comparable<Person>{
// prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it
private int id;
private String name;
private double sal;
private String desg;


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
public double getSal() {
    return sal;
}
public void setSal(double sal) {
    this.sal = sal;
}
public String getDesg() {
    return desg;
}
public void setDesg(String desg) {
    this.desg = desg;
}
public Person(int id, String name, double sal, String desg) {
    this.id = id;
    this.name = name;
    this.sal = sal;
    this.desg = desg;
}
@Override
public String toString() {
    return "Person [id=" + id + ", name=" + name + ", sal=" + sal + ", desg=" + desg + "]";
}
@Override
public int compareTo(Person o) {
    // TODO Auto-generated method stub
    return 0;
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    long temp;
    temp = Double.doubleToLongBits(sal);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + ((desg == null) ? 0 : desg.hashCode());
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
    if (Double.doubleToLongBits(sal) != Double.doubleToLongBits(other.sal))
        return false;
    if (desg == null) {
        if (other.desg != null)
            return false;
    } else if (!desg.equals(other.desg))
        return false;
    return true;
}






}
