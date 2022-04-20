package user;
import Services.Service2;
import interfaces.IGeneral;

public class Main2 {

    public static void main(String[] args) {
        Service2 s = new Service2();
        if(s.boot()){
            s.demo();
        }
        s.begin();
    }
}
