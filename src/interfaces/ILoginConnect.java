package interfaces;
import java.util.Scanner;

public interface ILoginConnect {

    static void loginClient() {
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

    static void loginMedic() {
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

    static void loginCard() {
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

    static void loginOnc() {
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

    static void loginAdmin() {
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
}
