package com.example.gamemultiplechoice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuestionDao {
    private Connection connection;

    public QuestionDao(Connection connection) {
        this.connection = connection;
    }

    public List<Question> getAllQuestions() {
        List<Question> questions = new ArrayList<>();
        String query = "SELECT * FROM Quiz";

        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Question question = new Question();
                question.setId(resultSet.getInt(1));  // Assuming the ID is in the first column
                question.setQuestionText(resultSet.getString(2)); // Assuming the question is in the third column
                question.setOption1(resultSet.getString(3));
                question.setOption2(resultSet.getString(4));
                question.setOption3(resultSet.getString(5));
                question.setOption4(resultSet.getString(6));
                question.setAnswer(resultSet.getString(7));
                questions.add(question);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return questions;
    }
}
