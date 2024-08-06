public class Person{
// prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it

    private String name;
    private int age;
    private String email;

    
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return email != null ? email.equals(person.email) : person.email == null;
    }
}


