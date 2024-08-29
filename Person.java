public class Person{

    Person(int i, String string){}


    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Person(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", getId()=" + getId() + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
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
        return true;
    }
    

// prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it
}
