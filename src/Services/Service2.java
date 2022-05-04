package Services;
import evidences.Evidence;
import interfaces.*;
import entities.*;
import entities.specialists.*;
import struct.Adresa;
import utility.DisplayReviews;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Service2 implements IGeneral2{
    String ERROR_RANGE = "The number you entered is out of the given range.";
    Adresa clinicAddress = new Adresa("Romania", "Bucuresti", "Strada PAO", "38290", 10);
    Evidence e = new Evidence();

    //implementing logins
    @Override
     public void loginClient() {
        if(IGeneral.existsCli(ILoginInput.inputLogCli())){
            System.out.print("Your login has been validated. What would you like to do next?\n");
        }
        else
        {
            IPrintText.printLogErr();
            Scanner scanner;
            scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            System.out.println("\n");
            if(input == 1){
                loginClient();
            }
            else
            {
                IGeneral.begin();
            }
        }

    }

    @Override
    public void loginMedic() {
        Scanner scanner;
        scanner = new Scanner(System.in);

        if(IGeneral.existsMed(ILoginInput.inputLogMed())){
            System.out.print("Your login has been validated. What would you like to do next?\n");
            IPrintMenu.printMenuMedic();
        }
        else
        {
            IPrintText.printLogErr();

            int input = scanner.nextInt();
            System.out.println("\n");

            if(input == 1){
                loginMedic();
            }
            else
            {
                IGeneral.begin();
            }
        }

    }

    @Override
    public void loginCard() {
        Scanner scanner;
        scanner = new Scanner(System.in);

        if(IGeneral.existsCard(ILoginInput.inputLogCard())){
            System.out.print("Your login has been validated. What would you like to do next?\n");
            IPrintMenu.printMenuCardOnc();
        }
        else
        {
            IPrintText.printLogErr();

            int input = scanner.nextInt();
            System.out.println("\n");

            if(input == 1){
                loginCard();
            }
            else
            {
                IGeneral.begin();
            }
        }

    }

    @Override
    public void loginOnc() {
        Scanner scanner;
        scanner = new Scanner(System.in);

        if(IGeneral.existsOnc(ILoginInput.inputLogOnc())){
            System.out.print("Your login has been validated. What would you like to do next?\n");
            IPrintMenu.printMenuCardOnc();
        }
        else
        {
            IPrintText.printLogErr();

            int input = scanner.nextInt();
            System.out.println("\n");

            if(input == 1){
                loginOnc();
            }
            else
            {
                IGeneral.begin();
            }
        }

    }

    @Override
    public void loginAdmin() {
        Scanner scanner;
        scanner = new Scanner(System.in);

        if(IGeneral.existsAdmin(ILoginInput.inputLogAdmin())){
            System.out.print("Your login has been validated. What would you like to do next?\n");
            IPrintMenu.printMenuMedic();
        }
        else
        {
            IPrintText.printLogErr();

            int input = scanner.nextInt();
            System.out.println("\n");

            if(input == 1){
                loginAdmin();
            }
            else
            {
                IGeneral.begin();
            }
        }

    }

    //implementing input functions

    @Override
    public Client inputLogCli() {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("Please enter the following information: \n");
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Surname: ");
        String surname = scanner.nextLine();

        System.out.println("Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("CNP: ");
        String id = scanner.nextLine();

        return new Client(name, surname, age, id);
    }

    @Override
    public Medic inputLogMed() {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("Please enter the following information: \n");
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Surname: ");
        String surname = scanner.nextLine();

        System.out.println("Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("CNP: ");
        String id = scanner.nextLine();

        System.out.println("Domain: ");
        String domain = scanner.nextLine();

        System.out.println("Next, enter the date the medic was hired: ");

        System.out.println("Year: ");
        int year = scanner.nextInt();

        System.out.println("Month: ");
        int month = scanner.nextInt();

        System.out.println("Day: ");
        int day = scanner.nextInt();

        return new Medic(name, surname, age, id, domain, year, month, day);
    }

    //InputCardiologist
    @Override
    public Cardiolog inputLogCard(){
        System.out.println("Please enter the following information:");
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Surname: ");
        String surname = scanner.nextLine();

        System.out.println("Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("CNP: ");
        String id = scanner.nextLine();

        System.out.println("Domain: ");
        String domain = scanner.nextLine();

        System.out.println("Next, enter the date of hiring: ");

        System.out.println("Year: ");
        int year = scanner.nextInt();

        System.out.println("Month: ");
        int month = scanner.nextInt();

        System.out.println("Day: ");
        int day = scanner.nextInt();

        System.out.println("Number of surgeries performed: ");
        int nrSurgeries = scanner.nextInt();

        return new Cardiolog(name, surname, age, id, domain, year, month, day, nrSurgeries);

    }

    //InputOncologist
    @Override
    public Oncolog inputLogOnc(){
        System.out.println("Please enter the following information:");
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Surname: ");
        String surname = scanner.nextLine();

        System.out.println("Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("CNP: ");
        String id = scanner.nextLine();

        System.out.println("Domain: ");
        String domain = scanner.nextLine();

        System.out.println("Next, enter the date of hiring: ");

        System.out.println("Year: ");
        int year = scanner.nextInt();

        System.out.println("Month: ");
        int month = scanner.nextInt();

        System.out.println("Day: ");
        int day = scanner.nextInt();

        System.out.println("Number of surgeries performed: ");
        int nrSurgeries = scanner.nextInt();

        return new Oncolog(name, surname, age, id, domain, year, month, day, nrSurgeries);

    }

    //InputAdmin
    @Override
    public Administrator inputLogAdmin() {
        System.out.print("Please enter the following information:\n");
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Secret Code: ");
        String secretCode = scanner.nextLine();

        return new Administrator(secretCode);
    }

    //InputCondition (Afectiune)
    @Override
    public Afectiune inputAf() {
        System.out.println("Please enter the following information: ");
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Grade of Risk: ");
        int gRisk = scanner.nextInt();

        return new Afectiune(name, gRisk);
    }

    @Override
    public Review inputRev() {
        System.out.println("Enter review:");
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Give a number of stars in the range of 1-5.");
        int grade = scanner.nextInt();
        return new Review(grade);
    }

    //print
    //menu
    //General menu
    @Override
    public void printMenuGen(){
        System.out.print("Here's MedPAO's general menu. Choose an option and press the corresponding numeric key.\n");
        System.out.print("1: Register.\n");
        System.out.print("2: Login.\n");
        System.out.print("3: MedPAO's story.\n");
        System.out.print("4: Our team.\n");
        System.out.print("5: Register a new appointment without account.\n");
        System.out.print("6: Check the list of conditions we're treating.\n");
        System.out.print("7: Help.\n");
        System.out.print("8: Exit. \n");
        System.out.print("9: Reviews.\n");
        System.out.print("10: Leave a review. \n");
        System.out.print("11: To be implemented/changed in the app. \n");
    }

    //Registration menu
    @Override
    public void printMenuReg(){
        System.out.print("What would you want to register as? Pick an option and press the corresponding key.\n");
        System.out.print("1: Client.\n");
        System.out.print("2: Medic.\n");
        System.out.print("If you are specialised in one of those areas, you can also create a premium specialist account: \n");
        System.out.print("3: Cardiologist.\n");
        System.out.print("4: Oncologist.\n");
        System.out.print("For personnel: \n");
        System.out.print("5: Administrator\n");
    }

    //Login Menu
    @Override
    public void printMenuLogin(){
        System.out.print("What would you want to login as? Pick an option and press the corresponding key.\n");
        System.out.print("1: Client.\n");
        System.out.print("2: Medic.\n");
        System.out.print("3: Cardiologist.\n");
        System.out.print("4: Oncologist.\n");
        System.out.print("5: Administrator.\n");
    }

    //Client menu
    @Override
    public void printMenuClient(){
        System.out.print("\n");
        System.out.print("Press the corresponding key of your choice:\n");
        System.out.print("1: Create new appointment.\n");
        System.out.print("2: Cancel an appointment.\n");
        System.out.print("3: Logout.\n");
    }

    //Medic menu
    @Override
    public void printMenuMedic(){
        System.out.print("\n");
        System.out.print("Press the corresponding key of your choice:\n");
        System.out.print("1: Create new appointment.\n");
        System.out.print("2: Cancel an appointment.\n");
        System.out.print("3: View current Client records.\n");
        System.out.print("4: View current Appointment records.\n");
        System.out.print("5: Print CV.\n");
        System.out.print("6: Logout.\n");
    }

    //Cardiologist/Oncologist menu
    @Override
    public void printMenuCardOnc(){
        System.out.print("\n");
        System.out.print("Press the corresponding key of your choice:\n");
        System.out.print("1: View current Client records.\n");
        System.out.print("2: View current Appointment records.\n");
        System.out.print("3: Logout.\n");

    }

    //Admin menu
    @Override
    public void printMenuAdmin(){
        System.out.print("Currently admins benefit of the following. The menu will soon be updated.\n");
        System.out.print("1: Show all records.\n");
        System.out.print("2: Client records.\n");
        System.out.print("3: Medic records.\n");
        System.out.print("4: Cardiologist records.\n");
        System.out.print("5: Oncologist records.\n");
        System.out.print("6: Condition (Afectiune) records.\n");
        System.out.print("7: Appointment records.\n");
        System.out.print("8: Administrator records.\n");
        System.out.print("9: Delete Client.\n");
        System.out.print("10: Delete Medic.\n");
        System.out.print("11: Delete Cardiologist.\n");
        System.out.print("12: Delete Oncologist.\n");
        System.out.print("13: Delete Condition (Afectiune) .\n");
        System.out.print("14: Delete Administrator.\n");
        System.out.print("15: Add new Condition (afectiune).\n");
        System.out.print("16: Add new Client.\n");
        System.out.print("17: Add new Medic.\n");
        System.out.print("18: Add new Cardiologist.\n");
        System.out.print("19: Add new Oncologist.\n");
        System.out.print("20: Add new Administrator.\n");
        System.out.print("21: Sorts the record of Clients by id in ascending order and prints them.\n");
        System.out.print("22: Sorts the record of Clients by name in alphabetical order and if equal, sorts by surname and if equal, by id in ascending order and prints them.\n");
        System.out.print("23: Sorts the record of Medics by id in ascending order and prints them.\n");
        System.out.print("24: Sorts the record of Medics  by domain (specialitate) in alphabetical order and if equal, by id in ascending order and prints them.\n");
        System.out.print("25: Sorts the record of Cardiologists by id in ascending order and prints them.\n");
        System.out.print("26: Sorts the record of Cardiologists by number of surgeries performed in descending order and if equal, by id in ascending order and prints them.\n");
        System.out.print("27: Sorts the record of Oncologists by id in ascending order and prints them.\n");
        System.out.print("28: Sorts the record of Oncologists by number of surgeries performed in descending order and if equal, by id in ascending order and prints them.\n");
        System.out.print("29: Check if Client exists.\n");
        System.out.print("30: Check if Medic exists.\n");
        System.out.print("31: Check if Cardiologist exists.\n");
        System.out.print("32: Check if Oncologist exists.\n");
        System.out.print("33: Check if Condition (Afectiune) exists.\n");
        System.out.print("34: Check if Administrator exists.\n");
        System.out.print("35: Logout.\n");

    }

    //print others
    @Override
    public void printIntroduction(){
        System.out.print("Thank you for choosing MedPAO! Before you begin to test the app, we have an optional feature that consists in a demo database.\n");
        System.out.print("By opting for it, data from a predefined demo database will be inserted in the records of the current session.\n");
        System.out.print("Therefore, you will be able to test the functionalities on the predefined data. However, you will still be able to insert new data.\n");
        System.out.print("If you would like to start off with this feature, type 'Yes'. If not, type 'No'. Kind regards!\n");
        System.out.print("PLEASE: Check the Help section first. It gives info on all the current functionalities of the app.\n");
    }

    //Help
    @Override
    public void printHelp(){
        System.out.print("Welcome to the Help section. Here are the basics of MedPAO and how to use it.\n");
        System.out.print("\n");
        System.out.print("-----------------------------Functionalities---------------------------------\n");
        System.out.print("\n");
        System.out.print("MedPAO allows you to register as either a Client, Medic, Specialist(Cardiologist/Oncologist) or Administrator.\n");
        System.out.print("As a Client, you can create/cancel appointements.\n");
        System.out.print("As a Medic , you can create/cancel appointements, view Client/Appointment records.\n");
        System.out.print("As a Specialist (Cardiologist/Oncologist) , you can view Client/Appointment records. An update on the functionalities is in process.\n");
        System.out.print("As an Administrator, you can view/check/edit Client/Medic/Specialist/Appointments/Condition records.\n");
        System.out.print("However, without a registered account, you benefit of the general menu options that include: \n");
        System.out.print("Learning about MedPAO's story / Our team / Conditions we're treating / Reviews / Leave a Review / Make an Appointment without an account / Help section\n");
        System.out.print("\n");
        System.out.print("----------------------------Registration-------------------------------------\n");
        System.out.print("\n");
        System.out.print("General Menu -> press 1 for Registration -> Acces Registration Menu -> press coresponding key for desired role .\n");
        System.out.print("Next, follow the given instructions. E.g. 'Name: ' suggests to enter the requested name by typing it in the console.\n");
        System.out.print("!Warning! When asked if you would like to register as a specialist, our platform currently only supports Cardiologist and Oncologist.\n");
        System.out.print("          If you are specialized in a different domain, register as a Medic and your account will be modified later by our tech team.\n");
        System.out.print("\n");
        System.out.print("-------------------------------Roles----------------------------------------\n");
        System.out.print("\n");
        System.out.print("----------------------------Administrator------------------------------------\n");
        System.out.print("\n");
        System.out.print("As an administrator, you benefit of the most functionalities. Most of them operate over the records of the current session.\n");
        System.out.print("Therefore, you can view/ check if it exists/ add/ remove instances of Client/Medic/Cardiologist/Oncologist/Condition(Afectiune).\n");
        System.out.print("You can also choose to view the records filtered by extra criteria.\n");
        System.out.print("\n");
        System.out.print("General Menu -> Register/Login -> Type the corresponding key for Administrator -> Insert solicited info -> Pick option from menu\n");
        System.out.print("Currently asked: The secret code that identifies an Admin is a String. Enter whatever you want, but try to make it as unique as possible.\n");
        System.out.print("There aren't any input constraints implemented yet to assure uniqueness, so please, be careful.\n");
        System.out.print("\n");
        System.out.println("----------------------------Client----------------------------------------");
        System.out.print("\n");
        System.out.print("As a Client, you can create/delete appointments. Your data will be stored in the record corresponding to the current session.\n");
        System.out.print("After you register you will automatically be guided to the Client Menu. You can choose to logout and later login int the previously created Client account.\n");
        System.out.print("\n");
        System.out.print("General Menu -> Register/Login -> Type the corresponding key for Client -> Insert solicited info -> Pick option from menu\n");
        System.out.print("Currently asked: The client id must be your CNP (you will be asked for it).\n");
        System.out.print("There aren't any input constraints implemented yet to assure uniqueness by checking it, so please, be careful and enter your CNP.\n");
        System.out.print("\n");
        System.out.println("----------------------------Medic----------------------------------------");
        System.out.print("\n");
        System.out.print("As a Medic, you can create/delete appointments. Your data will be stored in the record corresponding to the current session.\n");
        System.out.print("After you register you will automatically be guided to the Client Menu. You can choose to logout and later login int the previously created Client account.\n");
        System.out.print("You are also able to view current Client/Appointment records.\n");
        System.out.print("\n");
        System.out.print("General Menu -> Register/Login -> Type the corresponding key for Medic -> Insert solicited info -> Pick option from menu\n");
        System.out.print("Currently asked: The medic id must be your CNP (you will be asked for it).\n");
        System.out.print("There aren't any input constraints implemented yet to assure uniqueness by checking it, so please, be careful and enter your CNP.\n");
        System.out.print("\n");
        System.out.println("----------------------------Specialist----------------------------------------");
        System.out.println("----------------------Cardiologist/Oncologist---------------------------------");
        System.out.print("\n");
        System.out.print("As a Specialist, you are able to view current Client/Appointment.\n");
        System.out.print("Our tech team is working on an update that will soon be launched. It will organize all medics based on their domain and offer special functionalities.\n");
        System.out.print("Keep in touch with our app!.\n");
        System.out.print("\n");
        System.out.print("General Menu -> Register/Login -> Type the corresponding key for Cardiologist/Oncologist -> Insert solicited info -> Pick option from menu\n");
        System.out.print("Currently asked: The specialist id must be your CNP (you will be asked for it).\n");
        System.out.print("There aren't any input constraints implemented yet to assure uniqueness by checking it, so please, be careful and enter your CNP.\n");
        System.out.print("\n");
        System.out.println("----------------------------ATTENTION----------------------------------------");
        System.out.print("\n");
        System.out.print("Constraints regarding the input on a deep level are yet to be implemented. Please enter the information you are asked carefully.\n");
        System.out.print("Type 'Yes' if you are asked to. 'yes', 'y', 'YES' will NOT work!\n");
        System.out.print("The same applies to names, ages and so on. You will not be logged in if you do not enter the exact information you did at register.\n");
        System.out.print("Please enter valid numbers for dates (year, month, day).\n");
        System.out.print("\n");

    }

    //Story
    @Override
    public void printStory(){
        System.out.print("Glad you showed intrest in MedPAO's story!.\n");
        System.out.print("\n");
        System.out.print("Our journey began a few years ago. We started off by involving in many start-up's regarding med. \n");
    }

    //ToBeImplemented
    @Override
    public void printToBe(){
        System.out.println("We are considering implementing: ");
        System.out.println("Implement methods to check all of the inputs.");
        System.out.println("Email adress for Client, Medic, Cardiologist, Oncologist.");
        System.out.println("Consultation, AppSurgery that inherit Appointment.");
        System.out.println("Reformating Date.");
        System.out.println("Nurse / Specialist classes.");

    }

    //ErrorLogin
    @Override
    public void printLogErr(){
        System.out.print("Your login has not been validated. Would you like to try again or go back to the main menu?\n");
        System.out.print("1: Try Again. \n");
        System.out.print("2: Go back to the main menu\n");
    }

    //exists
    @Override
    public boolean existsCli(Client c){
        for(Client x: e.getEvCli()){
            if(c.equals(x))
            {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean existsMed(Medic m){
        for(Medic x: e.getEvM()){
            if(m.equals(x))
            {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean existsOnc(Oncolog o){
        for(Oncolog x: e.getEvOnc()){
            if(o.equals(x))
            {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean existsCard(Cardiolog c){
        for(Cardiolog x: e.getEvCard()){
            if(c.equals(x))
            {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean existsAdmin(Administrator a){
        for(Administrator x: e.getEvAdmin()){
            if(a.equals(x))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean existsAf(Afectiune a){
        ArrayList<Afectiune> ar = new ArrayList<>(e.getEvAf());
        for(Afectiune x: ar) {
            if(x.getName().equals(a.getName()) && x.getGradeRisk() == a.getGradeRisk()) return true;
        }
        return false;
    }

    @Override
    public void newAppWAcc(){
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

    @Override
    public void regClient(){
        e.addNewCli(ILoginInput.inputLogCli());
    }

    @Override
    public void regMedic(){
        e.addNewMed(ILoginInput.inputLogMed());
    }

    @Override
    public void regCard(){
        e.addNewCard(ILoginInput.inputLogCard());
    }

    @Override
    public void regOnc(){
        e.addNewOnc(ILoginInput.inputLogOnc());
    }

    @Override
    public void regAf(){
        e.addNewAf(ILoginInput.inputAf());
    }

    @Override
    public void regAdmin(){
        e.addNewAdmin(ILoginInput.inputLogAdmin());
    }

    @Override
    public void showAllRecords(){
        e.printEvOnc();
        e.printEvCard();
        e.printEvCli();
        e.printEvMed();
        e.printEvAdmin();
    }

    @Override
    public int getClientOpt(){
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

    @Override
    public int getMedOpt(){
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

    @Override
    public int getAdminOpt(){
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

    @Override
    public int getCardOncOpt(){
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

    @Override
    public void parseOptCardOnc(int option) {
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

    @Override
    public void parseOptClient(int option){
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

    @Override
    public void parseOptMed(int option) {
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

    @Override
    public void parseOptAdmin(int option) {
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

    @Override
    public void begin(){
        int x = getBeginOption();
        if(x == -1) getBeginOption();
        else parseMenGenInput(x);
    }

    @Override
    public void next(){
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

    @Override
    public int getBeginOption(){
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

    @Override
    public void parseMenGenInput(int option){
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

    @Override
    public boolean boot(){
        IPrintText.printIntroduction();

        Scanner scanner;
        scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("\n");

        if(input.equals("Yes")){
            return true;
        }
        else
        {
            return false;
        }
    }

    public void demo(){
        //Clients
        Client c1 = new Client("Popescu", "Daniela", 30, "111");
        //
        e.addNewCli(new Client("Daniela", "Popescu", 30, "1"));
        e.addNewCli(new Client("Dan", "Ionescu", 45, "2"));
        e.addNewCli(new Client("Alina", "Popescu", 22, "4"));
        e.addNewCli(new Client("Rosalinda", "Moraru", 12, "3"));
        e.addNewCli(new Client("Alin", "Munteanu", 56, "5"));
        //Medics
        Medic m1 = new Medic("Tache", "Anna", 36, "90", "ORL", 2020, 1, 1);
        //
        e.addNewMed(new Medic("Camelia", "Marinache", 23, "10", "chirurgie", 2020, 7, 2));
        e.addNewMed(new Medic("Radu", "Luca", 42, "12", "ortopedie", 2018, 3, 5));
        e.addNewMed(new Medic("Mihai", "Popa", 35, "11", "chirurgie", 2022, 2, 15));
        e.addNewMed(new Medic("Ana", "Danila", 40, "13", "chirurgie", 2021, 5, 20));
        e.addNewMed(new Medic("Elena", "Georgescu", 28, "14", "ortopedie", 2008, 8, 10));
        e.addNewMed(new Medic("Teodora", "Tache", 31, "15", "ORL", 2020, 2, 12));
        e.addNewMed(new Medic("Mircea", "Radu", 41, "18", "dermatologie", 2017, 3, 15));
        e.addNewMed(new Medic("Cristina-Liliana", "Stan", 33, "17", "ORL", 2021, 3, 25));
        e.addNewMed(new Medic("Vlad", "Popa", 29, "16", "dermatologie", 2016, 5, 27));
        e.addNewMed(new Medic("Raluca", "Grigorescu", 29, "19", "ginecologie", 2010, 8, 12));
        //Cardiologists
        e.addNewCard(new Cardiolog("Ana", "Popa", 30, "100", "cardiologie", 2022, 7, 12, 9));
        e.addNewCard(new Cardiolog("Georgiana", "Tudor", 22, "1000", "cardiologie", 2022, 2, 12, 12));
        e.addNewCard(new Cardiolog("Gabriela", "Sandu", 54, "10000", "cardiologie", 2022, 7, 30, 12));
        e.addNewCard(new Cardiolog("Eric", "Nastase", 54, "100000", "cardiologie", 2022, 7, 12, 9));
        e.addNewCard(new Cardiolog("Matei", "Gemcea", 46, "100000", "cardiologie", 2022, 2, 16, 50));
        //Oncologists
        e.addNewOnc(new Oncolog("Ana", "Popa", 23, "1001", "oncologie", 2019, 7, 12, 9));
        e.addNewOnc(new Oncolog("Mihai", "Surdu", 40, "1002", "oncologie", 2022, 5, 2, 20));
        e.addNewOnc(new Oncolog("Vlad", "Anghel", 38, "1003", "oncologie", 2018, 7, 11, 20));
        e.addNewOnc(new Oncolog("Vlad", "Anghelache", 38, "1004", "oncologie", 2016, 3, 10, 50));
        //Appointments
        e.addNewApp(new Appointment(2022, 8, 2, c1, m1, "Romania", "Bucuresti", "Aleea 1", "098762", 3));
        e.addNewApp(new Appointment(2022, 5, 10, c1, m1, "Romania", "Bucuresti", "Aleea 1", "098762", 3));
        //Conditions
        e.addNewAf(new Afectiune("Auch", 1));
        e.addNewAf(new Afectiune("Auchh", 3));
        e.addNewAf(new Afectiune("Bau", 1));
        e.addNewAf(new Afectiune("Auu", 2));
        //Admins
        e.addNewAdmin(new Administrator("admin2022"));
        e.addNewAdmin(new Administrator("admin2021"));
        e.addNewAdmin(new Administrator("admin2020"));
    }

}
