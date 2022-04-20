package interfaces;
import entities.*;
import evidences.Evidence;
import entities.specialists.Cardiolog;
import entities.specialists.Oncolog;
import struct.Adresa;
import Services.MedicService;
import utility.DisplayReviews;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public interface IGeneral extends IPrintMenu, IPrintText, ILoginInput {
    String ERROR_RANGE = "The number you entered is out of the given range.";
    Adresa clinicAddress = new Adresa("Romania", "Bucuresti", "Strada PAO", "38290", 10);
    Evidence e = new Evidence();

    boolean boot();

//        IPrintText.printIntroduction();
//
//        Scanner scanner;
//        scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        System.out.println("\n");
//
//        if(input.equals("Yes")){
//            return true;
//        }
//        else
//        {
//            return false;
//        }

//    }

    static void next(){
        System.out.println("Would you like to go back to the main menu? If not, you'll be exit the session.");
        System.out.println("Press 1 for 'Yes' and 0 for 'No'.");

        Scanner scanner;
        scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        if(option == 1)
            parseMenGenInput(getBeginOption());
        else
            System.out.print("Thank you for using our platform. See you soon!");
    }

    static int getBeginOption(){
        IPrintMenu.printMenuGen();
        Scanner scanner;
        scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if(option < 1 || option > 11){
            System.out.println(ERROR_RANGE);
            return -1;
        }
        else
        {
            return option;
        }
    }


    static void parseMenGenInput(int option){
        if(option == 2){
            IPrintMenu.printMenuLogin();
            Scanner scanner;
            scanner = new Scanner(System.in);
            int logOpt = scanner.nextInt();
            if(logOpt > 5 || logOpt < 1)
            {
                System.out.println(ERROR_RANGE);
                System.out.println("Please try again");
                parseMenGenInput(option);
            }
            if(logOpt == 1){
                ILoginConnect.loginClient();
                IPrintMenu.printMenuClient();
                parseOptClient(getClientOpt());
            }
            else{
                if(logOpt == 2){
                    ILoginConnect.loginMedic();
                    parseOptMed(getMedOpt());
                }
                else{
                    if(logOpt == 3){
                        ILoginConnect.loginCard();
                        //IPrintMenu.printMenuCardOnc();
                        parseOptCardOnc(getCardOncOpt());

                    }
                    else{
                        if(logOpt == 4){
                            ILoginConnect.loginOnc();
                            //IPrintMenu.printMenuCardOnc();
                            parseOptCardOnc(getCardOncOpt());
                        }
                        else{
                            ILoginConnect.loginAdmin();
                            IPrintMenu.printMenuAdmin();
                            parseOptAdmin(getAdminOpt());
                        }

                    }
                }
            }
        }
        if(option == 6){
            e.printEvAf(e.sortedEvAf());
            next();
        }
        if(option == 4){
            System.out.println("Our team is composed on emphatic and well-prepared personnel.");
            System.out.println("Cardiologists:");
            e.printEvCard();
            System.out.println("Oncologists:");
            e.printEvOnc();
            System.out.println("Medics:");
            e.printEvMed();
            next();
        }
        if(option == 5){
            newAppWAcc();
            next();
        }
        if(option == 1) {
            IPrintMenu.printMenuReg();
            Scanner scanner;
            scanner = new Scanner(System.in);
            int regOpt = scanner.nextInt();
            if (regOpt > 5 || regOpt < 1) {
                System.out.println(ERROR_RANGE);
                System.out.println("Please try again");
                parseMenGenInput(option);
            }
            if (regOpt == 1) {
                regClient();
                IPrintMenu.printMenuClient();
                parseOptClient(getClientOpt());
            } else {
                if (regOpt == 2) {
                    regMedic();
                    IPrintMenu.printMenuMedic();
                    parseOptMed(getMedOpt());
                } else {
                    if (regOpt == 3) {
                        regCard();
                        IPrintMenu.printMenuCardOnc();
                        parseOptCardOnc(getCardOncOpt());

                    } else {
                        if (regOpt == 4) {
                            regOnc();
                            IPrintMenu.printMenuCardOnc();
                            parseOptCardOnc(getCardOncOpt());
                        } else {
                            regAdmin();
                            IPrintMenu.printMenuAdmin();
                            parseOptAdmin(getAdminOpt());
                        }

                    }
                }
            }
        }
        if(option == 3) {
            IPrintText.printStory();
            next();
        }
        if(option == 8){
            System.out.print("Thank you for using our platform. See you soon!");
        }
        if(option == 7){
            IPrintText.printHelp();
            next();
        }
        if(option == 9){
            DisplayReviews.display();
            next();
        }
        if(option == 10){
            DisplayReviews.insert(ILoginInput.inputRev());
            next();
        }
        if(option == 11){
            IPrintText.printToBe();
            next();
        }
    }

    static void begin(){
        int x = getBeginOption();
        if(x == -1) getBeginOption();
        else parseMenGenInput(x);
    }


    static boolean existsCli(Client c){
        for(Client x: e.getEvCli()){
            if(c.equals(x))
            {
                return true;
            }
        }
        return false;
    }

    static boolean existsMed(Medic m){
        for(Medic x: e.getEvM()){
            if(m.equals(x))
            {
                return true;
            }
        }
        return false;
    }

    static boolean existsOnc(Oncolog o){
        for(Oncolog x: e.getEvOnc()){
            if(o.equals(x))
            {
                return true;
            }
        }
        return false;
    }

    static boolean existsCard(Cardiolog c){
        for(Cardiolog x: e.getEvCard()){
            if(c.equals(x))
            {
                return true;
            }
        }
        return false;
    }

    static boolean existsAdmin(Administrator a){
        for(Administrator x: e.getEvAdmin()){
            if(a.equals(x))
            {
                return true;
            }
        }
        return false;
    }

    static boolean existsAf(Afectiune a){
        ArrayList<Afectiune> ar = new ArrayList<>(e.getEvAf());
        for(Afectiune x: ar) {
            if(x.getName().equals(a.getName()) && x.getGradeRisk() == a.getGradeRisk()) return true;
        }
        return false;
    }

//    public static boolean existsApp(Appointment a){
//        if(e.getEvApp().contains(a)) return true;
//        else return false;
//    };


    static void newAppWAcc(){
        System.out.println("You opted to make a new appointment. Please follow the next steps.");
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Enter the medic id:");
        String input4 = scanner.nextLine();

        Medic medicc = new Medic("fsdf", "fsfs", 12, "dsfs", "dsdf", 3, 3,2);
        for (int i = 0; i < (e.getEvM()).size(); i++)
        {
            if(Objects.equals(((e.getEvM()).get(i)).getId(), input4))
            {
                medicc.setAge(((e.getEvM()).get(i)).getAge());
                medicc.setName(((e.getEvM()).get(i)).getName());
                medicc.setSurname(((e.getEvM()).get(i)).getSurname());
                medicc.setId(((e.getEvM()).get(i)).getId());
                medicc.setSpecialitate(((e.getEvM()).get(i)).getSpecialitate());
                medicc.setDateHired(((e.getEvM()).get(i)).getDateHired());
            }
        }

        System.out.println("Enter the desired date for the appointment");
        System.out.println("Year: ");
        int year = scanner.nextInt();

        System.out.println("Month: ");
        int month = scanner.nextInt();

        System.out.println("Day: ");
        int day = scanner.nextInt();

        Appointment ap = new Appointment(year, month, day, ILoginInput.inputLogCli(), medicc, "Austria", "Constanta", "Strada Margelelor", "dd2", 2);
        System.out.println("Congratulations! You have created an appointment with the following information:");
        System.out.print(ap);
        e.addNewApp(ap);
        e.addNewCli(ap.getClient());

    }

    static void regClient(){
        e.addNewCli(ILoginInput.inputLogCli());
    }

    static void regMedic(){
        e.addNewMed(ILoginInput.inputLogMed());
    }

    static void regCard(){
        e.addNewCard(ILoginInput.inputLogCard());
    }

    static void regOnc(){
        e.addNewOnc(ILoginInput.inputLogOnc());
    }

    static void regAf(){
        e.addNewAf(ILoginInput.inputAf());
    }

    static void regAdmin(){
        e.addNewAdmin(ILoginInput.inputLogAdmin());
    }

    static void showAllRecords(){
        e.printEvOnc();
        e.printEvCard();
        e.printEvCli();
        e.printEvMed();
        e.printEvAdmin();
    }

    static int getClientOpt(){
        Scanner scanner;
        scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if(option < 1 || option > 3){
            System.out.println(ERROR_RANGE);
            return -1;
        }
        else
        {
            return option;
        }
    }

    static int getMedOpt(){
        Scanner scanner;
        scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if(option < 1 || option > 6){
            System.out.println(ERROR_RANGE);
            return -1;
        }
        else
        {
            return option;
        }
    }
    static int getAdminOpt(){
        Scanner scanner;
        scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if(option < 1 || option > 35){
            System.out.println(ERROR_RANGE);
            return -1;
        }
        else
        {
            return option;
        }
    }

    static int getCardOncOpt(){
        Scanner scanner;
        scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if(option < 1 || option > 3){
            System.out.println(ERROR_RANGE);
            return -1;
        }
        else
        {
            return option;
        }
    }

    static void parseOptCardOnc(int option) {
        if(option == 1){
            e.printEvCli();
            IPrintMenu.printMenuCardOnc();
            parseOptCardOnc(getCardOncOpt());
        }
        if(option == 2){
            e.printEvApp(e.sortedEvApp());
            IPrintMenu.printMenuCardOnc();
            parseOptCardOnc(getCardOncOpt());
        }
        if(option == 3){
            next();
        }
    }

    static void parseOptClient(int option){
        if(option == 1 || option == 2) {
            System.out.println("Please enter the appointment's info. ");
            Scanner scanner;
            scanner = new Scanner(System.in);

            System.out.println("Enter the client id:");
            String input0 = scanner.nextLine();

            Client clientt = new Client("", "", 0, "");

            for (int i = 0; i < (e.getEvCli()).size(); i++)
            {
                if((((e.getEvCli()).get(i)).getId()).compareTo(input0) == 0)
                {
                    clientt.setName(((e.getEvCli()).get(i)).getName());
                    clientt.setSurname(((e.getEvCli()).get(i)).getSurname());
                    clientt.setAge(((e.getEvCli()).get(i)).getAge());
                    clientt.setId(((e.getEvCli()).get(i)).getId());
                }
            }

            System.out.println("Enter the medic id:");
            String input = scanner.nextLine();

            Medic medicc = new Medic("", "", 0, "", "", 0, 0,0);
            System.out.println((e.getEvM()).size());
            for (int i = 0; i < (e.getEvM()).size(); i++)
            {
                if((((e.getEvM()).get(i)).getId()).compareTo(input) == 0)
                {
                    medicc.setAge(((e.getEvM()).get(i)).getAge());
                    medicc.setName(((e.getEvM()).get(i)).getName());
                    medicc.setSurname(((e.getEvM()).get(i)).getSurname());
                    medicc.setId(((e.getEvM()).get(i)).getId());
                    medicc.setSpecialitate(((e.getEvM()).get(i)).getSpecialitate());
                    medicc.setDateHired(((e.getEvM()).get(i)).getDateHired());
                }
            }

            System.out.println("Please enter the date:");
            System.out.println("Year: ");
            int year = scanner.nextInt();

            System.out.println("Month: ");
            int month = scanner.nextInt();

            System.out.println("Day: ");
            int day = scanner.nextInt();

            Appointment ap = new Appointment(year, month, day, clientt, medicc, clinicAddress);
            if(option == 1){
                if(e.getEvApp().contains(ap)){
                    System.out.println("The appointment has already been registered.");
                }
                else
                {
                    System.out.println("Congratulations! You have created an appointment with the following information:");
                    System.out.println(ap);
                    e.addNewApp(ap);
                }
                IPrintMenu.printMenuClient();
                parseOptClient(getClientOpt());
            }
            if(option == 2){
                if(e.getEvApp().contains(ap)) {
                    System.out.println("You chose to cancel this appointment:");
                    System.out.println(ap);
                    (e.getEvApp()).remove(ap);
                }
                else{
                    System.out.println("The appointment is not registered. We're taking you back to the menu to register it.");
                }
                IPrintMenu.printMenuClient();
                parseOptClient(getClientOpt());
            }
        }
        else{
            next();
        }


    }

    static void parseOptMed(int option) {
        if(option == 3){
            e.printEvCli();
            IPrintMenu.printMenuMedic();
            parseOptMed(getMedOpt());
        }
        if(option == 4){
            e.printEvApp(e.sortedEvApp());
            IPrintMenu.printMenuMedic();
            parseOptMed(getMedOpt());
        }
        if(option == 5){
            Scanner scanner;
            scanner = new Scanner(System.in);

            System.out.println("Enter the medic id:");
            String input = scanner.nextLine();

            Medic medicc = new Medic("", "", 0, "", "", 0, 0,0);
            System.out.println((e.getEvM()).size());

            for (int i = 0; i < (e.getEvM()).size(); i++)
            {
                if((((e.getEvM()).get(i)).getId()).compareTo(input) == 0)
                {
                    medicc.setAge(((e.getEvM()).get(i)).getAge());
                    medicc.setName(((e.getEvM()).get(i)).getName());
                    medicc.setSurname(((e.getEvM()).get(i)).getSurname());
                    medicc.setId(((e.getEvM()).get(i)).getId());
                    medicc.setSpecialitate(((e.getEvM()).get(i)).getSpecialitate());
                    medicc.setDateHired(((e.getEvM()).get(i)).getDateHired());
                }
            }

            MedicService m = new MedicService();
            System.out.println(m.generateCV(medicc));
            IPrintMenu.printMenuMedic();
            parseOptMed(getMedOpt());
        }
        if(option == 6){
            parseMenGenInput(getBeginOption());
        }
        if(option == 1 || option == 2) {
            System.out.println("Please enter the appointment's info. ");
            Scanner scanner;
            scanner = new Scanner(System.in);

            System.out.println("Enter the client id:");
            String input0 = scanner.nextLine();

            Client clientt = new Client("", "", 0, "");

            for (int i = 0; i < (e.getEvCli()).size(); i++)
            {
                if((((e.getEvCli()).get(i)).getId()).compareTo(input0) == 0)
                {
                    clientt.setName(((e.getEvCli()).get(i)).getName());
                    clientt.setSurname(((e.getEvCli()).get(i)).getSurname());
                    clientt.setAge(((e.getEvCli()).get(i)).getAge());
                    clientt.setId(((e.getEvCli()).get(i)).getId());
                }
            }

            System.out.println("Enter the medic id:");
            String input = scanner.nextLine();

            Medic medicc = new Medic("", "", 0, "", "", 0, 0,0);
            System.out.println((e.getEvM()).size());
            for (int i = 0; i < (e.getEvM()).size(); i++)
            {
                if((((e.getEvM()).get(i)).getId()).compareTo(input) == 0)
                {
                    medicc.setAge(((e.getEvM()).get(i)).getAge());
                    medicc.setName(((e.getEvM()).get(i)).getName());
                    medicc.setSurname(((e.getEvM()).get(i)).getSurname());
                    medicc.setId(((e.getEvM()).get(i)).getId());
                    medicc.setSpecialitate(((e.getEvM()).get(i)).getSpecialitate());
                    medicc.setDateHired(((e.getEvM()).get(i)).getDateHired());
                }
            }

            System.out.println("Please enter the date:");
            System.out.println("Year: ");
            int year = scanner.nextInt();

            System.out.println("Month: ");
            int month = scanner.nextInt();

            System.out.println("Day: ");
            int day = scanner.nextInt();

            Appointment ap = new Appointment(year, month, day, clientt, medicc, clinicAddress);
            if(option == 1){
                if(e.getEvApp().contains(ap)){
                    System.out.println("The appointment has already been registered.");
                }
                else
                {
                    System.out.println("Congratulations! You have created an appointment with the following information:");
                    System.out.println(ap);
                    e.addNewApp(ap);
                }
                IPrintMenu.printMenuMedic();
                parseOptMed(getMedOpt());
            }
            if(option == 2){
                if(e.getEvApp().contains(ap)) {
                    System.out.println("You chose to cancel this appointment:");
                    System.out.println(ap);
                    (e.getEvApp()).remove(ap);
                }
                else{
                    System.out.println("The appointment is not registered. We're taking you back to the menu to register it.");
                }
                IPrintMenu.printMenuMedic();
                parseOptMed(getMedOpt());
            }
        }

    }

    static void parseOptAdmin(int option) {
        if(option == 1) showAllRecords();
        if(option == 2) e.printEvCli();
        if(option == 3) e.printEvMed();
        if(option == 4) e.printEvCard();
        if(option == 5) e.printEvOnc();
        if(option == 6) e.printEvAf(e.sortedEvAf());
        if(option == 7) e.printEvApp(e.sortedEvApp());
        if(option == 8) e.printEvAdmin();
        if(option == 9) e.getEvCli().remove(ILoginInput.inputLogCli());
        if(option == 10) e.getEvM().remove(ILoginInput.inputLogMed());
        if(option == 11) e.getEvCard().remove(ILoginInput.inputLogCard());
        if(option == 12) e.getEvOnc().remove(ILoginInput.inputLogOnc());
        if(option == 13) e.getEvAf().remove(ILoginInput.inputAf());
        if(option == 14) e.getEvAdmin().remove(ILoginInput.inputLogAdmin());
        if(option == 15) e.getEvAf().add(ILoginInput.inputAf());
        if(option == 16) e.getEvCli().add(ILoginInput.inputLogCli());
        if(option == 17) e.getEvM().add(ILoginInput.inputLogMed());
        if(option == 18) e.getEvCard().add(ILoginInput.inputLogCard());
        if(option == 19) e.getEvOnc().add(ILoginInput.inputLogOnc());
        if(option == 20) e.getEvAdmin().add(ILoginInput.inputLogAdmin());
        if(option == 21){
            e.sortsEvCliById();
            e.printEvCli();
        }
        if(option == 22){
            e.sortsEvCliAlpha();
            e.printEvCli();
        }
        if(option == 23){
            e.sortsEvMedById();
            e.printEvMed();
        }
        if(option == 24){
            e.sortsEvMedBySpec();
            e.printEvMed();
        }
        if(option == 25){
            e.sortsEvCardById();
            e.printEvCard();
        }
        if(option == 26){
            e.sortsEvCardBySurg();
            e.printEvCard();
        }
        if(option == 27){
            e.sortsEvOncById();
            e.printEvOnc();
        }
        if(option == 28){
            e.sortsEvOncBySurg();
            e.printEvOnc();
        }
        if(option == 29)  System.out.print(existsCli(ILoginInput.inputLogCli()));
        if(option == 30)  System.out.print(existsMed(ILoginInput.inputLogMed()));
        if(option == 31)  System.out.print(existsCard(ILoginInput.inputLogCard()));
        if(option == 32)  System.out.print(existsOnc(ILoginInput.inputLogOnc()));
        if(option == 33)  System.out.print(existsAf(ILoginInput.inputAf()));
        if(option == 34)  System.out.print(existsAdmin(ILoginInput.inputLogAdmin()));
        if(option == 35)  parseMenGenInput(getBeginOption());
        if(option != 35)
        {
            System.out.println();
            IPrintMenu.printMenuAdmin();
            parseOptAdmin(getAdminOpt());
        }


    }

}
