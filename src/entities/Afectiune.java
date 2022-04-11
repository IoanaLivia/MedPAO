package entities;

import java.util.Objects;

public class Afectiune implements Comparable<Afectiune> {
    private String name;
    private int gradeRisk;

    public Afectiune(String name, int gradeRisk)
    {
        this.name = name;
        this.gradeRisk = gradeRisk;
    }

    public String getName(){return name;}
    public int getGradeRisk(){return gradeRisk;}
    public void setName(String name){this.name = name;}
    public void setGradeRisk(int gradeRisk){this.gradeRisk = gradeRisk;}

    //sorting using Comparable in ascending order by gradeRisk
    @Override
    public int compareTo(Afectiune a) {
        return this.gradeRisk - a.gradeRisk; // ordonare crescatoare
    }

    @Override
    public String toString() {
        return "Afectiune{" +
                "name='" + name + '\'' +
                ", grad de risc='" + gradeRisk + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (!(o instanceof Afectiune)) return false;
        if (!this.equals(o)) return false;
        Afectiune a = (Afectiune) o;
        if(Objects.equals(this.name, a.name) && Objects.equals(this.gradeRisk, a.gradeRisk))
        {
            return true;

        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGradeRisk(), getName());
    }

}
