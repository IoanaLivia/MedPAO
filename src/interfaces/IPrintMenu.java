package interfaces;

public interface IPrintMenu {

    //General menu
    static void printMenuGen(){
        System.out.print("Here's MedPAO's general menu. Choose an option and press the corresponding numeric key.\n");
        System.out.print("1: Register.\n");
        System.out.print("2: Login.\n"); //partially
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
    static void printMenuReg(){
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
    static void printMenuLogin(){
        System.out.print("What would you want to login as? Pick an option and press the corresponding key.\n");
        System.out.print("1: Client.\n");
        System.out.print("2: Medic.\n");
        System.out.print("3: Cardiologist.\n");
        System.out.print("4: Oncologist.\n");
        System.out.print("5: Administrator.\n");
    }

    //Client menu
    static void printMenuClient(){
        System.out.print("\n");
        System.out.print("Press the corresponding key of your choice:\n");
        System.out.print("1: Create new appointment.\n");
        System.out.print("2: Cancel an appointment.\n");
        System.out.print("3: Logout.\n");
    }

    //Medic menu
    static void printMenuMedic(){
        System.out.print("\n");
        System.out.print("Press the corresponding key of your choice:\n");
        System.out.print("1: Create new appointment.\n");
        System.out.print("2: Cancel an appointment.\n");
        System.out.print("3: View current Client records.\n");
        System.out.print("4: View current Appointment records.\n");
        System.out.print("5: Logout.\n");
    }

    //Cardiologist/Oncologist menu
    static void printMenuCardOnc(){
        System.out.print("\n");
        System.out.print("Press the corresponding key of your choice:\n");
        System.out.print("1: View current Client records.\n");
        System.out.print("2: View current Appointment records.\n");
        System.out.print("3: Logout.\n");

    }

    //Admin menu
    static void printMenuAdmin(){
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

}
