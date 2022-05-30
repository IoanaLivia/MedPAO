package repository;

import config.DatabaseConfiguration;
import entities.Client;
import entities.Medic;
import struct.Date;

import java.sql.*;

public class MedicRepository {

    //create: table
    public void createMedicTable(){
        String createMedicTableSql = "CREATE TABLE IF NOT EXISTS medics" + "(name varchar(30), surname varchar(30), age int, id varchar(30) PRIMARY KEY, specialitate varchar(30), year int , month int , day int)";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement stmt = connection.createStatement();
            stmt.execute(createMedicTableSql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    //table(Drop)
    public void deleteMedicTable(){

        String deleteMedicTableSql = "{call drop_table_medics()}";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            CallableStatement cstmt = connection.prepareCall(deleteMedicTableSql);

            cstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //delete instance
    public void deleteMedic(String id){
        String deleteMedicSql = "{call delete_medic(?)}";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            CallableStatement cstmt = connection.prepareCall(deleteMedicSql);
            cstmt.setString(1,id);
            cstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //insert

    public void insertMedicProc(Medic medic) {

        String insertMedicProcSql = "{call insertMedic(?,?,?,?,?,?,?,?)}";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            CallableStatement cstmt = connection.prepareCall(insertMedicProcSql);
            cstmt.setString(1, medic.getName());
            cstmt.setString(2,medic.getSurname() );
            cstmt.setInt(3, medic.getAge());
            cstmt.setString(4, medic.getId());
            cstmt.setString(5, medic.getSpecialitate());
            cstmt.setInt(6, medic.getDateHired().getYear());
            cstmt.setInt(7, medic.getDateHired().getMonth());
            cstmt.setInt(8, medic.getDateHired().getDay());


            cstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void insertMedicSql(String name, String surname, int age, String id, String specialitate, int year, int month, int day)
    {
        String insertMedicSql = "INSERT INTO medics(name, surname, age, id, specialitate, year, month, day) VALUES (?,?,?,?,?,?,?,?)";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insertMedicSql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setInt(3, age);
            preparedStatement.setString(4, id);
            preparedStatement.setString(5,specialitate);
            preparedStatement.setInt(6, year);
            preparedStatement.setInt(7, month);
            preparedStatement.setInt(8, day);
            preparedStatement.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }


    //display
    public void displayMedics(){
        String displayMedicsSql = "SELECT * FROM medics";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(displayMedicsSql);
            ResultSet resultSet = preparedStatement.executeQuery(displayMedicsSql);
            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString(1));
                System.out.println("Surname: " + resultSet.getString(2));
                System.out.println("Age: " + resultSet.getInt(3));
                System.out.println("Id: " + resultSet.getString(4));
                System.out.println("Specialitate: " + resultSet.getString(5));
                System.out.println("Year: " + resultSet.getInt(6));
                System.out.println("Month: " + resultSet.getInt(7));
                System.out.println("Day: " + resultSet.getInt(7));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    //display instance
    public void displayMedic(String id) {
        String selectSql = "SELECT * FROM medics WHERE id = " + id + ";";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(selectSql);
            if (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString(1));
                System.out.println("Surname: " + resultSet.getString(2));
                System.out.println("Age: " + resultSet.getInt(3));
                System.out.println("Id: " + resultSet.getString(4));
                System.out.println("Specialitate: " + resultSet.getString(5));
                System.out.println("Year: " + resultSet.getInt(6));
                System.out.println("Month: " + resultSet.getInt(7));
                System.out.println("Day: " + resultSet.getInt(7));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    //get
    public Medic getMedicbyId(String id){
        String getMedicSql = "SELECT * FROM medics WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getMedicSql);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            return(mapToMedic(resultSet));
        }catch(SQLException e){
            e.printStackTrace();
        }

        return null;
    }

    private Medic mapToMedic(ResultSet resultSet) throws SQLException {
        if(resultSet.next())
        {
            return new Medic(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6), resultSet.getInt(7), resultSet.getInt(8));
        }

        return null;
    }

    //updates

    public void updateMedicId(String new_id, String id) {
        String updateIdSql = "UPDATE medics SET id=? WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateIdSql);
            preparedStatement.setString(2, id);
            preparedStatement.setString(1, new_id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updateMedicAge(int age, String id) {
        String updateAgeSql = "UPDATE medics SET age=? WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateAgeSql);
            preparedStatement.setString(2, id);
            preparedStatement.setInt(1, age);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updateMedicName(String new_name, String id) {
        String updateNameSql = "UPDATE medics SET name=? WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateNameSql);
            preparedStatement.setString(2, id);
            preparedStatement.setString(1, new_name);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updateMedicSurname(String new_surname, String id) {
        String updateSurnameSql = "UPDATE medics SET surname=? WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateSurnameSql);
            preparedStatement.setString(2, id);
            preparedStatement.setString(1, new_surname);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updateMedicSpec(String new_spec, String id) {
        String updateSpecSql = "UPDATE medics SET specialitate=? WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateSpecSql);
            preparedStatement.setString(2, id);
            preparedStatement.setString(1, new_spec);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updateMedicYear(int year, String id) {
        String updateYearSql = "UPDATE medics SET year=? WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateYearSql);
            preparedStatement.setString(2, id);
            preparedStatement.setInt(1, year);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updateMedicMonth(int month, String id) {
        String updateMonthSql = "UPDATE medics SET year=? WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateMonthSql);
            preparedStatement.setString(2, id);
            preparedStatement.setInt(1, month);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updateMedicDay(int day, String id) {
        String updateDaySql = "UPDATE medics SET year=? WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateDaySql);
            preparedStatement.setString(2, id);
            preparedStatement.setInt(1, day);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
