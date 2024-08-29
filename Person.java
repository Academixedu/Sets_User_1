public class Person{
// prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it
private String name;
private int age;
private char gender;
//constuctor
public Person(String name, int age, char gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
}
public Person(String name2, int age2, String string) {
    //TODO Auto-generated constructor stub
}
//getters and setters
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
public char getGender() {
    return gender;
}
public void setGender(char gender) {
    this.gender = gender;
}
//tostring
@Override
public String toString() {
    return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
}
//override hashcode
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + age;
    result = prime * result + gender;
    return result;
}
//equalsto
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
    if (gender != other.gender)
        return false;
    return true;
}




}

