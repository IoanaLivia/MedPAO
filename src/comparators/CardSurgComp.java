package comparators;
import entities.specialists.Cardiolog;
import java.util.Comparator;

public class CardSurgComp implements Comparator<Cardiolog> {
    @Override
    public int compare(Cardiolog c1, Cardiolog c2) {
        int result = c2.getNoSurg() - c1.getNoSurg();

        if (result != 0)
            return result;
        else
            return c1.getId().compareTo(c2.getId());
    }
}
