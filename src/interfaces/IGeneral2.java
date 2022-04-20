package interfaces;
import entities.*;
import entities.specialists.Cardiolog;
import entities.specialists.Oncolog;


public interface IGeneral2 {
    //login
    void loginClient();

    void loginMedic();

    void loginCard();

    void loginOnc();

    void loginAdmin();

    //input
    Client inputLogCli();

    Medic inputLogMed();

    Cardiolog inputLogCard();

    Oncolog inputLogOnc();

    Administrator inputLogAdmin();

    Afectiune inputAf();

    Review inputRev();

    //print functions

    //menus

    void printMenuLogin();

    void printMenuGen();

    void printMenuReg();

    void printMenuClient();

    void printMenuMedic();

    void printMenuCardOnc();

    void printMenuAdmin();

    //others

    void printIntroduction();

    void printHelp();

    void printStory();

    void printToBe();

    void printLogErr();

    //functionality

    boolean boot();

    void next();

    int getBeginOption();

    void parseMenGenInput(int option);

    void begin();

    //exists

    boolean existsCli(Client c);

    boolean existsMed(Medic m);

    boolean existsOnc(Oncolog o);

    boolean existsCard(Cardiolog c);

    boolean existsAdmin(Administrator a);

    boolean existsAf(Afectiune a);

    void newAppWAcc();

    //registration

    void regClient();

    void regMedic();

    void regCard();

    void regOnc();

    void regAf();

    void regAdmin();

    void showAllRecords();

    //getters

    int getClientOpt();

    int getMedOpt();

    int getAdminOpt();

    int getCardOncOpt();

    //parse input functions

    void parseOptCardOnc(int option);

    void parseOptClient(int option);

    void parseOptMed(int option);

    void parseOptAdmin(int option);

}
