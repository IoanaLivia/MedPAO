package user;

import interfaces.IGeneral;
import entities.*;
import entities.specialists.*;


public class Service implements IGeneral {

    public void start(){
        if(IGeneral.boot()){
            this.demo();
        }
        IGeneral.begin();
    }

    //TO DO: de terminat
    public void demo(){
        //Clients
        Client c1 = new Client("Popescu", "Daniela", 30, "111");
        //
        IGeneral.e.addNewCli(new Client("Daniela", "Popescu", 30, "1"));
        IGeneral.e.addNewCli(new Client("Dan", "Ionescu", 45, "2"));
        IGeneral.e.addNewCli(new Client("Alina", "Popescu", 22, "4"));
        IGeneral.e.addNewCli(new Client("Rosalinda", "Moraru", 12, "3"));
        IGeneral.e.addNewCli(new Client("Alin", "Munteanu", 56, "5"));
        //Medics
        Medic m1 = new Medic("Tache", "Anna", 36, "90", "ORL", 2020, 1, 1);
        //
        IGeneral.e.addNewMed(new Medic("Camelia", "Marinache", 23, "10", "chirurgie", 2020, 7, 2));
        IGeneral.e.addNewMed(new Medic("Radu", "Luca", 42, "12", "ortopedie", 2018, 3, 5));
        IGeneral.e.addNewMed(new Medic("Mihai", "Popa", 35, "11", "chirurgie", 2022, 2, 15));
        IGeneral.e.addNewMed(new Medic("Ana", "Danila", 40, "13", "chirurgie", 2021, 5, 20));
        IGeneral.e.addNewMed(new Medic("Elena", "Georgescu", 28, "14", "ortopedie", 2008, 8, 10));
        IGeneral.e.addNewMed(new Medic("Teodora", "Tache", 31, "15", "ORL", 2020, 2, 12));
        IGeneral.e.addNewMed(new Medic("Mircea", "Radu", 41, "18", "dermatologie", 2017, 3, 15));
        IGeneral.e.addNewMed(new Medic("Cristina-Liliana", "Stan", 33, "17", "ORL", 2021, 3, 25));
        IGeneral.e.addNewMed(new Medic("Vlad", "Popa", 29, "16", "dermatologie", 2016, 5, 27));
        IGeneral.e.addNewMed(new Medic("Raluca", "Grigorescu", 29, "19", "ginecologie", 2010, 8, 12));
        //Cardiologists
        IGeneral.e.addNewCard(new Cardiolog("Ana", "Popa", 30, "100", "cardiologie", 2022, 7, 12, 9));
        IGeneral.e.addNewCard(new Cardiolog("Georgiana", "Tudor", 22, "1000", "cardiologie", 2022, 2, 12, 12));
        IGeneral.e.addNewCard(new Cardiolog("Gabriela", "Sandu", 54, "10000", "cardiologie", 2022, 7, 30, 12));
        IGeneral.e.addNewCard(new Cardiolog("Eric", "Nastase", 54, "100000", "cardiologie", 2022, 7, 12, 9));
        IGeneral.e.addNewCard(new Cardiolog("Matei", "Gemcea", 46, "100000", "cardiologie", 2022, 2, 16, 50));
        //Oncologists
        IGeneral.e.addNewOnc(new Oncolog("Ana", "Popa", 23, "1001", "oncologie", 2019, 7, 12, 9));
        IGeneral.e.addNewOnc(new Oncolog("Mihai", "Surdu", 40, "1002", "oncologie", 2022, 5, 2, 20));
        IGeneral.e.addNewOnc(new Oncolog("Vlad", "Anghel", 38, "1003", "oncologie", 2018, 7, 11, 20));
        IGeneral.e.addNewOnc(new Oncolog("Vlad", "Anghelache", 38, "1004", "oncologie", 2016, 3, 10, 50));
        //Appointments
        IGeneral.e.addNewApp(new Appointment(2022, 8, 2, c1, m1, "Romania", "Bucuresti", "Aleea 1", "098762", 3));
        IGeneral.e.addNewApp(new Appointment(2022, 5, 10, c1, m1, "Romania", "Bucuresti", "Aleea 1", "098762", 3));
        //Conditions
        IGeneral.e.addNewAf(new Afectiune("Auch", 1));
        IGeneral.e.addNewAf(new Afectiune("Auchh", 3));
        IGeneral.e.addNewAf(new Afectiune("Bau", 1));
        IGeneral.e.addNewAf(new Afectiune("Auu", 2));
        //Admins
        IGeneral.e.addNewAdmin(new Administrator("admin2022"));
        IGeneral.e.addNewAdmin(new Administrator("admin2021"));
        IGeneral.e.addNewAdmin(new Administrator("admin2020"));

    }

}
