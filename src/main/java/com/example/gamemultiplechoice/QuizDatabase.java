package com.example.gamemultiplechoice;
import java.sql.*;

public class QuizDatabase {
    static Connection connection = null;

    public static void main(String[] args){
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // make connection
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:MultipleQues.db");
            if(connection != null){
                System.out.println("Connected");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // take connection
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM Quiz");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next() == true ){
                int id = resultSet.getInt(1);
                String ques = resultSet.getString(3);

                System.out.println(id + " " + ques);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
