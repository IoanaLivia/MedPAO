package interfaces;
import entities.*;
import entities.specialists.Cardiolog;
import entities.specialists.Oncolog;

import java.io.IOException;


public interface IGeneral{

    //login
    void loginClient() throws IOException;

    void loginMedic() throws IOException;

    void loginCard() throws IOException;

    void loginOnc() throws IOException;

    void loginAdmin() throws IOException;

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

    void printMenuLogin() throws IOException;

    void printMenuGen() throws IOException;

    void printMenuReg() throws IOException;

    void printMenuClient() throws IOException;

    void printMenuMedic() throws IOException;

    void printMenuCardOnc() throws IOException;

    void printMenuAdmin() throws IOException;

    //others

    void printIntroduction();

    void printHelp() throws IOException;

    void printStory() throws IOException;

    void printToBe() throws IOException;

    void printLogErr();

    //functionality

    boolean boot() throws IOException ;

    void next() throws IOException;

    int getBeginOption();

    void parseMenGenInput(int option) throws IOException;

    void begin();

    //exists

    boolean existsCli(Client c);

    boolean existsMed(Medic m);

    boolean existsOnc(Oncolog o);

    boolean existsCard(Cardiolog c);

    boolean existsAdmin(Administrator a);

    boolean existsAf(Afectiune a);

    void newAppWAcc() throws IOException;

    //registration

    void regClient() throws IOException;

    void regMedic() throws IOException;

    void regCard() throws IOException;

    void regOnc() throws IOException;

    void regAf() throws IOException;

    void regAdmin() throws IOException;

    void showAllRecords() throws IOException;

    //getters

    int getClientOpt();

    int getMedOpt();

    int getAdminOpt();

    int getCardOncOpt();

    //parse input functions

    void parseOptCardOnc(int option) throws IOException;

    void parseOptClient(int option) throws IOException;

    void parseOptMed(int option) throws IOException;

    void parseOptAdmin(int option) throws IOException;

    //streams

    void PrintMedicsofCertainAge(int age);

    void ConditionsStream();

}
