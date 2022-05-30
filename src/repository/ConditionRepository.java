package repository;

import config.DatabaseConfiguration;

import entities.Afectiune;
import entities.Client;

import java.sql.*;

public class ConditionRepository {

    public void createConditionTable(){
        String createConditionTableSql = "CREATE TABLE IF NOT EXISTS conditions" + "(name varchar(30) PRIMARY KEY, grade_risk int)";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement stmt = connection.createStatement();
            stmt.execute(createConditionTableSql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteConditionTable(){

        String deleteConditionTableSql = "{call drop_table_conditions()}";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            CallableStatement cstmt = connection.prepareCall(deleteConditionTableSql);

            cstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deleteCondition(String name){
        String deleteCondSql = "{call delete_condition(?)}";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            CallableStatement cstmt = connection.prepareCall(deleteCondSql);
            cstmt.setString(1,name);
            cstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertCondSql(String name, int grad) {
        String insertCondSql = "INSERT INTO conditions(name,grade_risk) VALUES (?,?)";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insertCondSql);
            preparedStatement .setString(1,name);
            preparedStatement .setInt(2, grad);
            preparedStatement.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void insertCondProc(Afectiune c) {

        String insertAdminProcSql = "{call insertCondition(?,?)}";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            CallableStatement cstmt = connection.prepareCall(insertAdminProcSql);
            cstmt.setString(1, c.getName());
            cstmt.setInt(2, c.getGradeRisk());
            cstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void displayConditions(){
        String displayAdminsSql = "SELECT * FROM conditions";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(displayAdminsSql);
            ResultSet resultSet = preparedStatement.executeQuery(displayAdminsSql);
            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString(1));
                System.out.println("Risk: " + resultSet.getInt(2));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    public Afectiune getCondbyId(String name){
        String getCondSql= "SELECT * FROM conditions WHERE name=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getCondSql);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            return(mapToCond(resultSet));
        }catch(SQLException e){
            e.printStackTrace();
        }

        return null;
    }

    private Afectiune mapToCond(ResultSet resultSet) throws SQLException {
        if(resultSet.next())
        {
            return new Afectiune(resultSet.getString(1), resultSet.getInt(2));
        }

        return null;
    }

    public void updateCondName(String new_id, String id) {
        String updateCondSql = "UPDATE conditions SET name=? WHERE name=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateCondSql);
            preparedStatement.setString(2, id);
            preparedStatement.setString(1, new_id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCondRisk(int new_risk, String id) {
        String updateCondSql = "UPDATE conditions SET gradeRisk=? WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateCondSql);
            preparedStatement.setString(2, id);
            preparedStatement.setInt(1, new_risk);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void displayCond(String name){
        String selectSql = "SELECT * FROM conditions WHERE name =  '" + name + "' ;";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(selectSql);
            if (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString(1));
                System.out.println("Risk: " + resultSet.getInt(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



}
