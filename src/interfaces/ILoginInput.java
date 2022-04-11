package interfaces;
import entities.*;
import entities.specialists.*;

import java.util.Scanner;

public interface ILoginInput {

    //InputClient
    public static Client inputLogCli() {
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
    };

    //InputMedic
    public static Medic inputLogMed() {
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
    };

    //InputCardiologist
    public  static Cardiolog inputLogCard(){
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

    };

    //InputOncologist
    public  static Oncolog inputLogOnc(){
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

    };

    //InputAdmin
    public  static Administrator inputLogAdmin() {
        System.out.print("Please enter the following information:\n");
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Secret Code: ");
        String secretCode = scanner.nextLine();

        Administrator a = new Administrator(secretCode);
        return a;
    };

    //InputCondition (Afectiune)
    public static Afectiune inputAf() {
        System.out.println("Please enter the following information: ");
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Grade of Risk: ");
        int gRisk = scanner.nextInt();

        return new Afectiune(name, gRisk);
    };

    //InputReviews
    public static Review inputRev() {
        System.out.println("Enter review:");
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Give a number of stars in the range of 1-5.");
        int grade = scanner.nextInt();
        return new Review(grade);
    };


}
