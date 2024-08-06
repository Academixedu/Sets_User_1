import java.util.Objects;

public class Person {
    private int pid;
    private String pname;
    private double psal;
    private String pdesg;

    public Person(int pid, String pname, double psal, String pdesg) {
        this.pid = pid;
        this.pname = pname;
        this.psal = psal;
        this.pdesg = pdesg;
    }

    public Person() {
    }

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

    public double getPsal() {
        return psal;
    }

    public void setPsal(double psal) {
        this.psal = psal;
    }

    public String getPdesg() {
        return pdesg;
    }

    public void setPdesg(String pdesg) {
        this.pdesg = pdesg;
    }

    @Override
    public String toString() {
        return "Person [pid=" + pid + ", pname=" + pname + ", psal=" + psal + ", pdesg=" + pdesg + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(pid, pname, psal, pdesg);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return pid == person.pid &&
               Double.compare(person.psal, psal) == 0 &&
               Objects.equals(pname, person.pname) &&
               Objects.equals(pdesg, person.pdesg);
    }
}
