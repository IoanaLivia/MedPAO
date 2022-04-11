package entities;
import struct.Adresa;
import struct.Date;

import java.util.Objects;

public class Appointment implements Comparable<Appointment>  {
    private Date date;
    private Client client;
    private Medic medic;
    private Adresa adress;
    private boolean isOnGoing;
    private boolean completed;

    //constructor
    public Appointment (int year, int month, int day, Client c, Medic m, String country, String city, String street, String postalCode, int number)
    {
        this.date = new Date(year, month, day);
        this.client = c;
        this.medic = m;
        this.adress = new Adresa(country, city, street, postalCode, number);
        this.isOnGoing = true;
        this.completed = false;
    }

    //constructor 2
    public Appointment (int year, int month, int day, Client c, Medic m, Adresa a)
    {
        this.date = new Date(year, month, day);
        this.client = c;
        this.medic = m;
        this.adress = a;
        this.isOnGoing = true;
        this.completed = false;
    }



    //getters & setters
    public boolean getisOnGoing(){return isOnGoing;}
    public boolean getCompleted(){return completed;}
    public void setOnGoing(boolean x){this.isOnGoing = x;}
    public void setCompleted(boolean x){this.completed = x;}

    public Client getClient(){return client;}
    public Adresa getAdress(){return adress;}
    public Medic getMedic(){return medic;}
    public Date getDate(){return date;}

    //override for compareTo: in descending order by date
    @Override
    public int compareTo(Appointment a) {
        int result = a.date.getYear() - this.date.getYear();
        if (result != 0)
            return result;
        else {
            result = a.date.getMonth() - this.date.getMonth();
            if (result != 0)
                return result;
            else
                return a.date.getDay() - this.date.getDay();
        }
    }

    //override for toString()
    @Override
    public String toString() {
        return "Appointment{\n" +
                "Client: " + client.getName() + " " + client.getSurname() + " " + client.getAge() + " " + client.getId() + "\n" +
                "Medic: " + medic.getName() + " " + medic.getSurname() + " " + medic.getId() + "\n" +
                "Data: " + date.getDay() + "." + date.getMonth() + "." + date.getYear() + "\n" +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (!(o instanceof Appointment)) return false;
        //if (!this.equals(o)) return false;
        Appointment a = (Appointment) o;
        if(Objects.equals(this.date, a.date) && Objects.equals(this.adress, a.adress) && Objects.equals(this.client, a.client) && Objects.equals(this.medic, a.medic) &&
                Objects.equals(this.completed, a.completed) && Objects.equals(this.isOnGoing, a.isOnGoing))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getisOnGoing(), getCompleted(), getClient(), getAdress(), getDate(), getMedic());
    }


}
