package comparators;
import entities.specialists.Oncolog;
import java.util.Comparator;

public class OncSurgComp implements Comparator<Oncolog> {
    @Override
    public int compare(Oncolog c1, Oncolog c2) {
        int result = c2.getNoSurg() - c1.getNoSurg();

        if (result != 0)
            return result;
        else
            return c1.getId().compareTo(c2.getId());
    }
}
