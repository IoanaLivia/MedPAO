package repository;

import config.DatabaseConfiguration;
import entities.Administrator;
import entities.Client;
import entities.Medic;

import java.sql.*;

public class AdminRepository {

    public void createAdminTable(){
        String createAdminTableSql = "CREATE TABLE IF NOT EXISTS admins" + "(secretCode varchar(30) PRIMARY KEY)";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement stmt = connection.createStatement();
            stmt.execute(createAdminTableSql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteAdminTable(){

        String deleteAdminTableSql = "{call drop_table_admins()}";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            CallableStatement cstmt = connection.prepareCall(deleteAdminTableSql);

            cstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deleteAdmin(String cod){
        String deleteAdminSql = "{call delete_admin(?)}";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            CallableStatement cstmt = connection.prepareCall(deleteAdminSql);
            cstmt.setString(1,cod);
            cstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertAdminSql(String cod) {
        String insertAdminSql = "INSERT INTO admins(secretCode) VALUES (?)";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insertAdminSql);
            preparedStatement.setString(1, cod);
            preparedStatement.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void insertAdminProc(Administrator a) {

        String insertAdminProcSql = "{call insertAdmin(?)}";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            CallableStatement cstmt = connection.prepareCall(insertAdminProcSql);
            cstmt.setString(1, a.getCode());

            cstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void displayAdmins(){
        String displayAdminsSql = "SELECT * FROM admins";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(displayAdminsSql);
            ResultSet resultSet = preparedStatement.executeQuery(displayAdminsSql);
            while (resultSet.next()) {
                System.out.println("Secret code: " + resultSet.getString(1));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    public void displayAdmin(String id) {
        String selectSql = "SELECT * FROM admins WHERE secretCode = '" + id + "';";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(selectSql);
            if (resultSet.next()) {
                System.out.println("Secret cod: " + resultSet.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Administrator getAdminbyId(String id){
        String getAdminSql= "SELECT * FROM admins WHERE secretCode=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getAdminSql);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            return(mapToAdmin(resultSet));
        }catch(SQLException e){
            e.printStackTrace();
        }

        return null;
    }

    private Administrator mapToAdmin(ResultSet resultSet) throws SQLException {
        if(resultSet.next())
        {
            return new Administrator(resultSet.getString(1));
        }

        return null;
    }

    public void updateAdminCode(String new_id, String id) {
        String updateAdminSql = "UPDATE admins SET secretCode=? WHERE secretCode=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateAdminSql);
            preparedStatement.setString(2, id);
            preparedStatement.setString(1, new_id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
