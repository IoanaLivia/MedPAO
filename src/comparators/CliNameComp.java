package comparators;
import entities.Client;
import java.util.Comparator;
//dupa nume, dupa prenume, dupa id

public class CliNameComp implements Comparator<Client> {
    @Override
    public int compare(Client c1, Client c2) {
        int result = c1.getName().compareTo(c2.getName());

        if (result != 0)
            return result;
        else
        {
            result = c1.getSurname().compareTo(c2.getSurname());
            if (result != 0)
                return  result;
            else
            {
                return  c1.getId().compareTo(c2.getId());
            }
        }
    }
}
