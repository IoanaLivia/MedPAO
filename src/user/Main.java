package user;
import entities.Client;
import entities.Medic;
import repository.ConditionRepository;
import services.Service;
import services.SqlService;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Service s = new Service();
        try{
            if(s.sql()){
                s.beginsql();
            }
            else
            {
                if(s.boot()){
                    s.demo();
                    s.begin();
                }
            }
        }
        catch(IOException e){
            System.out.println("IO error caught during boot process");
        }


    }


}
