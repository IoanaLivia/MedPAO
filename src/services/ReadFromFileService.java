package services;
import entities.Administrator;
import entities.Afectiune;
import entities.Client;
import entities.Medic;
import entities.specialists.Cardiolog;
import entities.specialists.Oncolog;
import exceptions.ClientsFileReadingException;

import java.io.IOException;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadFromFileService {
    public static ReadFromFileService instance;

    public static ReadFromFileService getInstance() {
        if (instance == null) { instance = new ReadFromFileService(); }
        return instance;
    }

    public List<Client> readClients() throws ClientsFileReadingException {
        List<Client> clients = new ArrayList<>();

        try {
            BufferedReader buffer = new BufferedReader(new FileReader("src/files/Clients.csv"));
            buffer.readLine();
            String linie = buffer.readLine();

            while (linie != null) {
                String[] v = linie.split(",");
                String name = v[0];
                String surname = v[1];
                int age = Integer.parseInt(v[2]);
                String id = v[3];
                clients.add(new Client(name, surname, age, id));
                linie = buffer.readLine();
            }

        } catch (IOException e) {
            throw new ClientsFileReadingException("Something went wrong in readClients method", e);
            //System.out.println(e.getMessage());
        }

        return clients;
    }

    public List<Medic> readMedics() {
        List<Medic> medics = new ArrayList<>();

        try {
            BufferedReader buffer = new BufferedReader(new FileReader("src/files/Medics.csv"));
            buffer.readLine();
            String linie = buffer.readLine();

            while (linie != null) {
                String[] v = linie.split(",");
                String name = v[0];
                String surname = v[1];
                int age = Integer.parseInt(v[2]);
                String id = v[3];
                String specialitate = v[4];
                int year = Integer.parseInt(v[5]);
                int month = Integer.parseInt(v[6]);
                int day = Integer.parseInt(v[7]);
                medics.add(new Medic(name, surname, age, id, specialitate, year, month, day));
                linie = buffer.readLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return medics;
    }

    public <T extends Medic> List<T> readSpecialist(Class<T> clasa){
        List<T> specialists = new ArrayList<>();

        if (clasa.toString().equalsIgnoreCase("class entities.specialists.Cardiolog")) {
            try {
                FileReader fileReader = new FileReader("src/files/Cardiologists.csv");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                bufferedReader.readLine();
                String linie = bufferedReader.readLine();

                while (linie != null) {
                    var v = linie.split(",");

                    String name = v[0];
                    String surname = v[1];
                    int age = Integer.parseInt(v[2]);
                    String id = v[3];
                    String specialitate = v[4];
                    int year = Integer.parseInt(v[5]);
                    int month = Integer.parseInt(v[6]);
                    int day = Integer.parseInt(v[7]);
                    int nrSurgeries = Integer.parseInt(v[8]);

                    specialists.add(clasa.cast(new Cardiolog(name, surname, age, id, specialitate, year, month, day, nrSurgeries)));

                    linie = bufferedReader.readLine();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (clasa.toString().equalsIgnoreCase("class entities.specialists.Oncolog")) {
            try {
                FileReader fileReader = new FileReader("src/files/Oncologists.csv");
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                bufferedReader.readLine();
                String linie = bufferedReader.readLine();

                while (linie != null) {
                    var v = linie.split(",");

                    String name = v[0];
                    String surname = v[1];
                    int age = Integer.parseInt(v[2]);
                    String id = v[3];
                    String specialitate = v[4];
                    int year = Integer.parseInt(v[5]);
                    int month = Integer.parseInt(v[6]);
                    int day = Integer.parseInt(v[7]);
                    int nrSurgeries = Integer.parseInt(v[8]);

                    specialists.add(clasa.cast(new Oncolog(name, surname, age, id, specialitate,year, month, day, nrSurgeries)));

                    linie = bufferedReader.readLine();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return specialists;
    }

    public List<Administrator> readAdmins() {
        List<Administrator> admins = new ArrayList<>();

        try {
            BufferedReader buffer = new BufferedReader(new FileReader("src/files/Admins.csv"));
            buffer.readLine();
            String linie = buffer.readLine();

            while (linie != null) {
                String[] v = linie.split(",");
                String secretCode = v[0];
                admins.add(new Administrator(secretCode));
                linie = buffer.readLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return admins;
    }

    public List<Afectiune> readConditions() {
        List<Afectiune> conditions = new ArrayList<>();

        try {
            BufferedReader buffer = new BufferedReader(new FileReader("src/files/Conditions.csv"));
            buffer.readLine();
            String linie = buffer.readLine();

            while (linie != null) {
                String[] v = linie.split(",");
                String name = v[0];
                int gradeRisk = Integer.parseInt(v[1]);
                conditions.add(new Afectiune(name, gradeRisk));
                linie = buffer.readLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return conditions;
    }


}
