package Services;
import entities.Medic;

public class MedicService{

    //function that generates CV
    public String generateCV(Medic m){
        int years_worked = 2022 - m.getDateHired().getYear();
        return "We are honored to present our fellow associate: " +
                "Name : " + m.getName() + '\'' +
                ", Surname : " + m.getSurname()+ '\'' +
                ", Age: " + m.getAge() +
                ", CNP: " + m.getId() +
                ", Domain: " + m.getSpecialitate() +
                ", Years of experience at our company: " + years_worked +
                '}';
    }
}
