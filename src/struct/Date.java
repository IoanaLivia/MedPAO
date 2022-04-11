package struct;
import java.util.Objects;

public class Date {
    private int year;
    private int month;
    private int day;

    //constructor
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //getters & setters
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() { return day; }

    public void setYear(int year){this.year = year;}
    public void setMonth(int month){this.month = month;}
    public void setDay(int day){this.day = day;}


    //Override for toString
    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (!(o instanceof Date)) return false;
        //if (!this.equals(o)) return false;
        Date d = (Date) o;
        if(Objects.equals(this.year, d.year) && Objects.equals(this.month, d.month) && Objects.equals(this.day, d.day))
            return true;
        else
            return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(getYear(), getMonth(), getDay());
    }
}
