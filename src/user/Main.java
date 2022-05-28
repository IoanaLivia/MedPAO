package user;
import services.Service;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Service s = new Service();
        try{
            if(s.boot()){
                s.demo();
            }
        }
        catch(IOException e){
            System.out.println("IO error caught during boot process");
        }
        s.begin();
    }
}
