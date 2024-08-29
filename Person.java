public class Person{
// prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it
    private int pid;
    private String pname;
    private char pgen;
    private double sal;

    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public char getPgen() {
        return pgen;
    }
    public void setPgen(char pgen) {
        this.pgen = pgen;
    }
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
    public Person(int pid, String pname, char pgen, double sal) {
        this.pid = pid;
        this.pname = pname;
        this.pgen = pgen;
        this.sal = sal;
    }
    @Override
    public String toString() {
        return "Person [pid=" + pid + ", pname=" + pname + ", pgen=" + pgen + ", sal=" + sal + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + pid;
        result = prime * result + ((pname == null) ? 0 : pname.hashCode());
        result = prime * result + pgen;
        long temp;
        temp = Double.doubleToLongBits(sal);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        if (pid != other.pid)
            return false;
        if (pname == null) {
            if (other.pname != null)
                return false;
        } else if (!pname.equals(other.pname))
            return false;
        if (pgen != other.pgen)
            return false;
        if (Double.doubleToLongBits(sal) != Double.doubleToLongBits(other.sal))
            return false;
        return true;
    }  
}
