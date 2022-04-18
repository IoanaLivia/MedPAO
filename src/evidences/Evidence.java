package evidences;
import comparators.CardSurgComp;
import comparators.MedSpecComp;
import comparators.OncSurgComp;
import comparators.CliNameComp;
import entities.*;
import entities.specialists.Cardiolog;
import entities.specialists.Oncolog;

import java.util.*;

public class Evidence {
    private ArrayList<Medic> evMed;
    private ArrayList<Client> evCli;
    private ArrayList<Cardiolog> evCard;
    private ArrayList<Oncolog> evOnc;
    private ArrayList<Administrator> evAdmin;
    private Set<Afectiune> evAf ;
    private Set<Appointment> evApp ;
    private ArrayList<Appointment> evAppArr;
    private ArrayList<Afectiune> evfArr;

    //constructor
    public Evidence()
    {
        this.evMed = new ArrayList<>();
        this.evCli = new ArrayList<>();
        this.evCard = new ArrayList<>();
        this.evOnc = new ArrayList<>();
        this.evAdmin = new ArrayList<>();
        this.evAf = new HashSet<>();
        this.evApp = new HashSet<>();
    }

    //getters
    public ArrayList<Medic> getEvM()
    {
        return evMed;
    }
    public ArrayList<Client> getEvCli()
    {
        return evCli;
    }
    public ArrayList<Cardiolog> getEvCard()
    {
        return evCard;
    }
    public ArrayList<Oncolog> getEvOnc() { return evOnc;}
    public ArrayList<Administrator> getEvAdmin() { return evAdmin;}
    public Set<Afectiune> getEvAf() { return evAf; }
    public Set<Appointment> getEvApp() { return evApp;}

    //add functions
    public void addNewMed(Medic m){
        evMed.add(m);
    }
    public void addNewCli(Client c){
        evCli.add(c);
    }
    public void addNewCard(Cardiolog c){
        evCard.add(c);
    }
    public void addNewAdmin(Administrator a){
        evAdmin.add(a);
    }
    public void addNewOnc(Oncolog o){
        evOnc.add(o);
    }
    public void addNewAf(Afectiune a){
        evAf.add(a);
    }
    public void addNewApp(Appointment a){
        evApp.add(a);
    }

    //empty() functions
    public void emptyEvMed(){
        evMed.removeAll(evMed);
    }
    public void emptyEvCli(){
        evCli.removeAll(evCli);
    }
    public void emptyEvAdmin(){
        evAdmin.removeAll(evAdmin);
    }
    public void emptyEvCard(){
        evCard.removeAll(evCard);
    }
    public void emptyEvOnc(){
        evOnc.removeAll(evOnc);
    }
    public void emptyEvAf(){
        evAf.removeAll(evAf);
    }
    public void emptyEvApp(){
        evApp.removeAll(evApp);
    }

    //sort() functions: by different criteria using comparators

    //sorts evCli (ArrayList) by id in ascending order
    public void sortsEvCliById(){
        Collections.sort(evCli);
    }

    //sorts evCli (ArrayList) by name in alphabetical order and if equal, sorts by surname and if equal, by id in ascending order
    public void sortsEvCliAlpha(){
        CliNameComp cliComp = new CliNameComp();
        Collections.sort(evCli, cliComp);
    }

    //sorts evMed (ArrayList) by id in ascending order
    public void sortsEvMedById(){
        Collections.sort(evMed);
    }

    //sorts evMed (ArrayList) by specialitate in alphabetical order and if equal, by id in ascending order
    public void sortsEvMedBySpec(){
        MedSpecComp medComp = new MedSpecComp();
        Collections.sort(evMed, medComp);
    }

    //sorts evCard by id in ascending order
    public void sortsEvCardById(){
        Collections.sort(evCard);
    }

    //sorts evCard by number of surgeries performed in descending order and if equal, by id in ascending order
    public void sortsEvCardBySurg(){
        CardSurgComp cardComp = new CardSurgComp();
        Collections.sort(evCard, cardComp);
    }

    //sorts evOnc by id in ascending order
    public void sortsEvOncById(){
        Collections.sort(evOnc);
    }

    //sorts evOnc by number of surgeries performed in descending order and if equal, by id in ascending order
    public void sortsEvOncBySurg(){
        OncSurgComp oncComp = new OncSurgComp();
        Collections.sort(evOnc, oncComp);
    }


    //sorts evApp (set) by date in descending order
    public ArrayList<Appointment> sortedEvApp() {
        ArrayList<Appointment> evAppArr  = new ArrayList<Appointment>(evApp);
        Collections.sort(evAppArr);
        return evAppArr;
    }

    //sorts evAf (set) by grade of risc in ascending order
    public ArrayList<Afectiune> sortedEvAf() {
        ArrayList<Afectiune> evAfArr = new ArrayList<Afectiune>(evAf);
        Collections.sort(evAfArr);
        return evAfArr;
    }

    //print functions: to display the evidences
    public void printEvCli(){
        for(Client x: evCli){
            System.out.print(x + "\n");
        }
    }

    public void printEvMed(){
        for(Medic x: evMed){
            System.out.print(x + "\n");
        }
    }

    public void printEvCard(){
        for(Cardiolog x: evCard){
            System.out.print(x + "\n");
        }
    }

    public void printEvAdmin(){
        for(Administrator x: evAdmin){
            System.out.print(x + "\n");
        }
    }

    public void printEvOnc(){
        for(Oncolog x: evOnc){
            System.out.print(x + "\n");
        }
    }

    public void printEvApp(ArrayList<Appointment> a){
        for(Appointment x: a) {
            System.out.print(x + "\n");
        }
    }

    public void printEvAf(ArrayList<Afectiune> a){
        for(Afectiune x: a) {
            System.out.print(x + "\n");
        }
    }
}

