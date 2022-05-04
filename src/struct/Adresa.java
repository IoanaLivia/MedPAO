package struct;
import java.util.Objects;

public class Adresa {
    private String country;
    private String city;
    private String street;
    private String postalCode;
    private int number;

    public Adresa(String country, String city, String street, String postalCode, int number) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
        this.number = number;
    }

    public String getCountry() {
        return country;
    }
    public String getCity() { return city;}
    public String getStreet() { return street; }
    public String getPostalCode() { return postalCode;}
    public int getNumber(){return number;}

    public void setCountry(String country){this.country = country;}
    public void setCity(String city){this.city = city;}
    public void setStreet(String street){this.street = street;}
    public void setPostalCode(String postalCode){this.postalCode = postalCode;}
    public void setNumber(int number){this.number = number;}

    @Override
    public String toString() {
        return country + " " + city + " " + street + " " + postalCode + " " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (!(o instanceof Adresa)) return false;
        //if (!this.equals(o)) return false;
        Adresa a = (Adresa) o;
        if(Objects.equals(this.country, a.country) && Objects.equals(this.city, a.city) && Objects.equals(this.street, a.street) && Objects.equals(this.postalCode, a.postalCode) &&
                Objects.equals(this.number, a.number))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getCountry(), getNumber(), getPostalCode(), getStreet());
    }
}
