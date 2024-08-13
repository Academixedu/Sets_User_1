public class Person{
// prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it
private String name;
private int age;
private int sal;
private String desg;
public Person(String name, int age, int sal, String desg) {
    this.name = name;
    this.age = age;
    this.sal = sal;
    this.desg = desg;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public int getSal() {
    return sal;
}
public void setSal(int sal) {
    this.sal = sal;
}
public String getDesg() {
    return desg;
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + age;
    result = prime * result + sal;
    result = prime * result + ((desg == null) ? 0 : desg.hashCode());
    return result;
}
@Override
public String toString() {
    return "Person [name=" + name + ", age=" + age + ", sal=" + sal + ", desg=" + desg + "]";
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
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;
    if (age != other.age)
        return false;
    if (sal != other.sal)
        return false;
    if (desg == null) {
        if (other.desg != null)
            return false;
    } else if (!desg.equals(other.desg))
        return false;
    return true;
}
public void setDesg(String desg) {
    this.desg = desg;
}
}
