package repository;
import config.DatabaseConfiguration;
import entities.Client;

import java.sql.*;

public class ClientRepository {

    public void createClientTable(){
        String createClientTableSql = "CREATE TABLE IF NOT EXISTS clients" + "(name varchar(30), surname varchar(30), age int, id varchar(30) PRIMARY KEY)";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement stmt = connection.createStatement();
            stmt.execute(createClientTableSql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void insertClientSql(String name, String surname, int age, String id) {
        String insertClientSql = "INSERT INTO clients(name, surname, age, id) VALUES (?,?,?,?)";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insertClientSql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setInt(3, age);
            preparedStatement.setString(4, id);
            preparedStatement.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void insertClientProc(Client client) {

        String preparedSql = "{call insertClient(?,?,?,?)}";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            CallableStatement cstmt = connection.prepareCall(preparedSql);
            cstmt.setString(1, client.getName());
            cstmt.setString(2,client.getSurname() );
            cstmt.setInt(3, client.getAge());
            cstmt.setString(4, client.getId());


            cstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Client getClientbyId(String id){
        String getClientSql = "SELECT * FROM clients WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getClientSql);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            return(mapToClient(resultSet));
        }catch(SQLException e){
            e.printStackTrace();
        }

        return null;
    }

    private Client mapToClient(ResultSet resultSet) throws SQLException {
        if(resultSet.next())
        {
            return new Client(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getString(4));
        }

        return null;
    }

    public void displayClients(){
        String displayClientsSql = "SELECT * FROM clients";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(displayClientsSql);
            ResultSet resultSet = preparedStatement.executeQuery(displayClientsSql);
            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString(1));
                System.out.println("Surname: " + resultSet.getString(2));
                System.out.println("Age: " + resultSet.getInt(3));
                System.out.println("Id: " + resultSet.getString(4));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

    }


    public void displayClient(String id) {
        String selectSql = "SELECT * FROM clients WHERE id = " + id + ";";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(selectSql);
            if (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString(1));
                System.out.println("Surname: " + resultSet.getString(2));
                System.out.println("Age: " + resultSet.getInt(3));
                System.out.println("Id: " + resultSet.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    //delete

    //table(Drop)
    public void deleteClientTable(){

        String preparedSql = "{call drop_table_clients()}";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            CallableStatement cstmt = connection.prepareCall(preparedSql);

            cstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //instance
    public void deleteClient(String id){
        String deleteClientSql = "{call delete_client(?)}";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            CallableStatement cstmt = connection.prepareCall(deleteClientSql );
            cstmt.setString(1,id);
            cstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //updates

    public void updateClientAge(int new_age, String id) {
        String updateAgeSql = "UPDATE clients SET age=? WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateAgeSql);
            preparedStatement.setString(2, id);
            preparedStatement.setInt(1, new_age);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updateClientName(String new_name, String id) {
        String updateNameSql = "UPDATE clients SET name=? WHERE id=?";

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

    public void updateClientSurname(String new_surname, String id) {
        String updateSurnameSql = "UPDATE clients SET surname=? WHERE id=?";

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

    public void updateClientId(String new_id, String id) {
        String updateIdSql = "UPDATE clients SET id=? WHERE id=?";

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
}
