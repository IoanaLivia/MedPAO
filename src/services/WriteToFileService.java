package services;

import java.io.FileWriter;
import java.io.IOException;

import entities.*;
import entities.specialists.Cardiolog;
import entities.specialists.Oncolog;
import exceptions.ClientsFileWritingException;

public class WriteToFileService {
    public static WriteToFileService instance;

    public static WriteToFileService getInstance() {
        if (instance == null) {
            instance = new WriteToFileService();
        }
        return instance;
    }

    private WriteToFileService() {
    }

    public static void initializeClientEvidence() throws IOException{
        FileWriter fileWriter = new FileWriter("src/files/ClientEvidence.csv", true);
        fileWriter.append("Name");
        fileWriter.append(",");
        fileWriter.append("Surname");
        fileWriter.append(",");
        fileWriter.append("Age");
        fileWriter.append(",");
        fileWriter.append("Id");
        fileWriter.append("\n");
        fileWriter.flush();
    }

    public static void initializeMedicEvidence() throws IOException{
        FileWriter fileWriter = new FileWriter("src/files/MedicEvidence.csv", true);
        fileWriter.append("Name");
        fileWriter.append(",");
        fileWriter.append("Surname");
        fileWriter.append(",");
        fileWriter.append("Age");
        fileWriter.append(",");
        fileWriter.append("Id");
        fileWriter.append(",");
        fileWriter.append("Domain");
        fileWriter.append(",");
        fileWriter.append("Year");
        fileWriter.append(",");
        fileWriter.append("Month");
        fileWriter.append(",");
        fileWriter.append("Day");
        fileWriter.append("\n");
        fileWriter.flush();
    }

    public static void initializeCardEvidence() throws IOException{
        FileWriter fileWriter = new FileWriter("src/files/CardiologistEvidence.csv", true);
        fileWriter.append("Name");
        fileWriter.append(",");
        fileWriter.append("Surname");
        fileWriter.append(",");
        fileWriter.append("Age");
        fileWriter.append(",");
        fileWriter.append("Id");
        fileWriter.append(",");
        fileWriter.append("Domain");
        fileWriter.append(",");
        fileWriter.append("Year");
        fileWriter.append(",");
        fileWriter.append("Month");
        fileWriter.append(",");
        fileWriter.append("Day");
        fileWriter.append(",");
        fileWriter.append("Surgeries");
        fileWriter.append("\n");
        fileWriter.flush();
    }
    public static void initializeOncEvidence() throws IOException{
        FileWriter fileWriter = new FileWriter("src/files/OncologistsEvidence.csv", true);
        fileWriter.append("Name");
        fileWriter.append(",");
        fileWriter.append("Surname");
        fileWriter.append(",");
        fileWriter.append("Age");
        fileWriter.append(",");
        fileWriter.append("Id");
        fileWriter.append(",");
        fileWriter.append("Domain");
        fileWriter.append(",");
        fileWriter.append("Year");
        fileWriter.append(",");
        fileWriter.append("Month");
        fileWriter.append(",");
        fileWriter.append("Day");
        fileWriter.append(",");
        fileWriter.append("Surgeries");
        fileWriter.append("\n");
        fileWriter.flush();
    }

    public static void initializeCondEvidence() throws IOException{
        FileWriter fileWriter = new FileWriter("src/files/ConditionEvidence.csv", true);
        fileWriter.append("Name");
        fileWriter.append(",");
        fileWriter.append("GradeRisk");
        fileWriter.append("\n");
        fileWriter.flush();
    }

    public static void initializeAdminEvidence() throws IOException{
        FileWriter fileWriter = new FileWriter("src/files/AdminEvidence.csv", true);
        fileWriter.append("SecretCode");
        fileWriter.append(",");
        fileWriter.append("\n");
        fileWriter.flush();
    }
    public void writeClientToEvidenceFile(Client c) throws ClientsFileWritingException {
        try (FileWriter fileWriter = new FileWriter("src/files/ClientEvidence.csv", true)) {
            fileWriter.append("\n");
            fileWriter.append(c.getName());
            fileWriter.append(",");
            fileWriter.append(c.getSurname());
            fileWriter.append(",");
            fileWriter.append(Integer.toString(c.getAge()));
            fileWriter.append(",");
            fileWriter.append(c.getId());
            fileWriter.append("\n");
            fileWriter.flush();
        } catch (IOException e) {
            throw new ClientsFileWritingException("Something went wrong in writeClientToEvidenceFile", e);
        }
    }

    public void writeMedicToEvidenceFile(Medic m) {
        try (FileWriter fileWriter = new FileWriter("src/files/MedicEvidence.csv", true)) {
            fileWriter.append(m.getName());
            fileWriter.append(",");
            fileWriter.append(m.getSurname());
            fileWriter.append(",");
            fileWriter.append(Integer.toString(m.getAge()));
            fileWriter.append(",");
            fileWriter.append(m.getId());
            fileWriter.append(",");
            fileWriter.append(Integer.toString(m.getDateHired().getYear()));
            fileWriter.append(",");
            fileWriter.append(Integer.toString(m.getDateHired().getMonth()));
            fileWriter.append(",");
            fileWriter.append(Integer.toString(m.getDateHired().getDay()));
            fileWriter.append("\n");
            fileWriter.flush();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    public void writeAdminToEvidenceFile(Administrator a) {
        try (FileWriter fileWriter = new FileWriter("src/files/AdminEvidence.csv", true)) {
            fileWriter.append(a.getCode());
            fileWriter.append(",");
            fileWriter.append("\n");
            fileWriter.flush();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    public void writeConditionToEvidenceFile(Afectiune a) {
        try (FileWriter fileWriter = new FileWriter("src/files/ConditionEvidence.csv", true)) {
            fileWriter.append(a.getName());
            fileWriter.append(",");
            fileWriter.append(Integer.toString(a.getGradeRisk()));
            fileWriter.append("\n");
            fileWriter.flush();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    public <T> void writeSpecialistToEvidenceFile(T obiect, Class<T> clasa) {
        if (clasa.toString().equalsIgnoreCase("class entities.specialists.Cardiolog")) {
            try (FileWriter fileWriter = new FileWriter("src/files/CardiologistEvidence.csv", true)) {
                obiect = clasa.cast(obiect);
                Cardiolog c = (Cardiolog) obiect;
                fileWriter.append(c.getName());
                fileWriter.append(",");
                fileWriter.append(c.getSurname());
                fileWriter.append(",");
                fileWriter.append(Integer.toString(c.getAge()));
                fileWriter.append(",");
                fileWriter.append(c.getId());
                fileWriter.append(",");
                fileWriter.append(Integer.toString(c.getDateHired().getYear()));
                fileWriter.append(",");
                fileWriter.append(Integer.toString(c.getDateHired().getMonth()));
                fileWriter.append(",");
                fileWriter.append(Integer.toString(c.getDateHired().getDay()));
                fileWriter.append(",");
                fileWriter.append(Integer.toString(c.getNoSurg()));
                fileWriter.append(",");
                fileWriter.append(Integer.toString(c.getComissionPercentage()));
                fileWriter.append("\n");
                fileWriter.flush();
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }

        } else if (clasa.toString().equalsIgnoreCase("class entities.specialists.Oncolog")) {
            try (FileWriter fileWriter = new FileWriter("src/files/OncologistsEvidence.csv", true)) {
                obiect = clasa.cast(obiect);
                Oncolog c = (Oncolog) obiect;
                fileWriter.append(c.getName());
                fileWriter.append(",");
                fileWriter.append(c.getSurname());
                fileWriter.append(",");
                fileWriter.append(Integer.toString(c.getAge()));
                fileWriter.append(",");
                fileWriter.append(c.getId());
                fileWriter.append(",");
                fileWriter.append(Integer.toString(c.getDateHired().getYear()));
                fileWriter.append(",");
                fileWriter.append(Integer.toString(c.getDateHired().getMonth()));
                fileWriter.append(",");
                fileWriter.append(Integer.toString(c.getDateHired().getDay()));
                fileWriter.append(",");
                fileWriter.append(Integer.toString(c.getNoSurg()));
                fileWriter.append(",");
                fileWriter.append(Integer.toString(c.getComissionPercentage()));
                fileWriter.append("\n");
                fileWriter.flush();
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }

        }

    }
}