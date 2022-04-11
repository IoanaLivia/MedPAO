package interfaces;

public interface IPrintText {

    //Introduction
    public static void printIntroduction(){
        System.out.print("Thank you for choosing MedPAO! Before you begin to test the app, we have an optional feature that consists in a demo database.\n");
        System.out.print("By opting for it, data from a predefined demo database will be inserted in the records of the current session.\n");
        System.out.print("Therefore, you will be able to test the functionalities on the predefined data. However, you will still be able to insert new data.\n");
        System.out.print("If you would like to start off with this feature, type 'Yes'. If not, type 'No'. Kind regards!\n");
        System.out.print("PLEASE: Check the Help section first. It gives info on all the current functionalities of the app.\n");
    };

    //Help
    public static void printHelp(){
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

    };

    //Story
    public static void printStory(){
        System.out.print("Glad you showed intrest in MedPAO's story!.\n");
        System.out.print("\n");
        System.out.print("Our journey began a few years ago. We started off by involving in many start-up's regarding med. \n");
    };

    //ToBeImplemented
    public static void printToBe(){
        System.out.println("We are considering implementing: ");
        System.out.println("Implement methods to check all of the inputs.");
        System.out.println("Email adress for Client, Medic, Cardiologist, Oncologist.");
        System.out.println("Consultation, AppSurgery that inherit Appointment.");
        System.out.println("Reformating Date.");
        System.out.println("Nurse / Specialist classes.");

    };

    //ErrorLogin
    public static void printLogErr(){
        System.out.print("Your login has not been validated. Would you like to try again or go back to the main menu?\n");
        System.out.print("1: Try Again. \n");
        System.out.print("2: Go back to the main menu\n");
    };

}
