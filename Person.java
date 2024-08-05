public class Person{
    public String passenger;
    public double ticket;
    public char gender;
    public Person(String passenger, double ticket, char gender) {
        this.passenger = passenger;
        this.ticket = ticket;
        this.gender = gender;
    }
    public String getPassenger() {
        return passenger;
    }
    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }
    public double getTicket() {
        return ticket;
    }
    public void setTicket(double ticket) {
        this.ticket = ticket;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Person [passenger=" + passenger + ", ticket=" + ticket + ", gender=" + gender + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((passenger == null) ? 0 : passenger.hashCode());
        long temp;
        temp = Double.doubleToLongBits(ticket);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + gender;
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
        if (passenger == null) {
            if (other.passenger != null)
                return false;
        } else if (!passenger.equals(other.passenger))
            return false;
        if (Double.doubleToLongBits(ticket) != Double.doubleToLongBits(other.ticket))
            return false;
        if (gender != other.gender)
            return false;
        return true;
    }
    
// prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it
}
