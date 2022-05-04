package entities;
import java.util.Objects;


public class Client implements Comparable<Client> {
    private String name;
    private String surname;
    private int age;
    private String id; //corespunde CNP-ului -> garanteaza unicitatea

    public Client(String name, String surname, int age, String id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id; //va fi echivalent cu cnp-ul
    }

    public Client(Client c)
    {
        this.name = c.getName();
        this.surname = c.getSurname();
        this.age = c.getAge();
        this.id = c.getId();
    }


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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public int compareTo(Client c) {
        return this.id.compareTo(c.id); // ordonare crescatoare
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (!(o instanceof Client)) return false;
        //if (!this.equals(o)) return false;
        Client c = (Client) o;
        if(Objects.equals(this.name, c.name) && Objects.equals(this.surname, c.surname) && Objects.equals(this.age, c.age) && Objects.equals(this.id, c.id))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname(), getAge());
    }


}


