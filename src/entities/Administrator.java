package entities;
import java.util.Objects;

public class Administrator {
    private String secretCode;

    public Administrator(String secretCode){
        this.secretCode = secretCode;
    }

    public String getCode(){return secretCode;}
    public void setName(String secretCode){this.secretCode = secretCode;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (!(o instanceof Administrator)) return false;
        //if (!this.equals(o)) return false;
        Administrator a = (Administrator) o;
        if(Objects.equals(this.secretCode, a.secretCode))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }

    @Override
    public String toString() {
        return "Administrator : " + secretCode;
    }

}
