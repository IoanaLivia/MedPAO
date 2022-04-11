package entities;
import struct.Date;
import interfaces.IGeneral;
import java.util.Objects;

//era general la implement
public class Medic implements Comparable<Medic>{
    private String name;
    private String surname;
    private int age;
    private String id; //corespunde CNP-ului -> garanteaza unicitatea
    private String specialitate;
    private Date dateHired;


    //constructor
    public Medic(String name, String surname, int age, String id, String specialitate, int year, int month, int day) //, EvidenceMedics ev)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
        this.specialitate = specialitate;
        this.dateHired = new Date(year, month, day);

    }

    //getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() { return age;}

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateHired() { return dateHired;}

    public void setDateHired(Date d) {
        this.dateHired = d;
    }

    public String getSpecialitate() {
        return specialitate;
    }

    public void setSpecialitate(String specialitate) {
        this.specialitate = specialitate;
    }

    @Override
    public int compareTo(Medic m) {
        return this.id.compareTo(m.id); // ordonare crescatoare
    }

    //Override for toString()
    @Override
    public String toString() {
        return "Medic{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", specialitate=" + specialitate +
                ", dateHired=" + dateHired +
                '}';
    }

    //function that generates CV
    public String generateCV(){
        int years_worked = 2022 - this.dateHired.getYear();
        return "We are honored to present our fellow associate: " +
                "Name : " + name + '\'' +
                ", Surname : " + surname + '\'' +
                ", Age: " + age +
                ", CNP: " + id +
                ", Domain: " + specialitate +
                ", Years of experience at our company: " + years_worked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (!(o instanceof Medic)) return false;
        //if (!this.equals(o)) return false;
        Medic m = (Medic) o;
        if(Objects.equals(this.name, m.name) && Objects.equals(this.surname, m.surname) && Objects.equals(this.age, m.age) && Objects.equals(this.id, m.id) &&
                Objects.equals(this.specialitate, m.specialitate) && Objects.equals(this.dateHired, m.dateHired))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname(), getSpecialitate(), getDateHired(), getAge());
    }
}
