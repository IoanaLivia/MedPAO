package entities.specialists;
import entities.Medic;
import java.util.Objects;

public class Cardiolog extends Medic {

    private int noSurg;
    private int comissionPercentage;

    //constructor
    public Cardiolog(String name, String surname, int age, String id, String specialitate, int year, int month, int day, int nrSurgeries)
    {
        super(name, surname, age, id, specialitate, year, month, day);
        this.noSurg = nrSurgeries;
        this.comissionPercentage = 20;
    }

    //getters & setters
    public int getNoSurg() { return noSurg;}
    public void setNoSurg(int noSurg) {
        this.noSurg = noSurg;
    }
    public int getComissionPercentage() { return comissionPercentage;}
    public void setComissionPercentage(int comissionPercentage) {
        this.comissionPercentage = comissionPercentage;
    }

    // @Override
    public int compareTo(Cardiolog c) {
        return this.getId().compareTo(c.getId()); // ordonare crescatoare
    }

    //Override for toString()
    @Override
    public String toString() {
        return "Cardiolog{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname()+ '\'' +
                ", age=" + getAge() +
                ", id=" + getId() +
                ", specialitate=" + getSpecialitate() +
                ", dateHired=" + getDateHired() +
                ", nrSurgeries=" + noSurg +
                ", commissionPercentage= " + comissionPercentage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (!(o instanceof Cardiolog)) return false;
        //if (!this.equals(o)) return false;
        Cardiolog c = (Cardiolog) o;
        if(Objects.equals(this.comissionPercentage, c.comissionPercentage) && Objects.equals(this.noSurg, c.noSurg) && Objects.equals(this.getId(), c.getId()) && Objects.equals(this.getName(), c.getName())  && Objects.equals(this.getSurname(), c.getSurname())
                && Objects.equals(this.getAge(), c.getAge())  && Objects.equals(this.getSpecialitate(), c.getSpecialitate())
                && Objects.equals(this.getDateHired(), c.getDateHired()))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNoSurg(), getComissionPercentage());
    }


}
