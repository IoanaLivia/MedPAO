package comparators;
import entities.Medic;
import java.util.Comparator;

//compares by speciality, in case of equality by id

public class MedSpecComp implements Comparator<Medic> {
    @Override
    public int compare(Medic o1, Medic o2) {
        int result = o1.getSpecialitate().compareTo(o2.getSpecialitate());

        if (result != 0)
            return result;
        else
            return o1.getId().compareTo(o2.getId());
    }
}
