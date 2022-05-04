package entities.specialists;
import entities.Medic;
import java.util.Objects;

public class Oncolog extends Medic {
    private int noSurg;
    private int comissionPercentage;
    static final int MY_CONSTANT = 35;


    public Oncolog(String name, String surname, int age, String id, String specialitate, int year, int month, int day, int nrSurgeries) {
        super(name, surname, age, id, specialitate, year, month, day);
        this.noSurg = nrSurgeries;
        this.comissionPercentage = MY_CONSTANT;
    }

    public int getNoSurg() {
        return noSurg;
    }

    public void setNoSurg(int noSurg) {
        this.noSurg = noSurg;
    }

    public int getComissionPercentage() {
        return comissionPercentage;
    }

    public void setComissionPercentage(int comissionPercentage) {
        this.comissionPercentage = comissionPercentage;
    }

    public int compareTo(Oncolog o) {
        return this.getId().compareTo(o.getId()); // ordonare crescatoare
    }

    @Override
    public String toString() {
        return "Oncolog{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
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
        if (!(o instanceof Oncolog)) return false;
        //if (!this.equals(o)) return false;
        Oncolog c = (Oncolog) o;
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