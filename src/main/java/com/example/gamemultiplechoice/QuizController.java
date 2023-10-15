package com.example.gamemultiplechoice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.sql.Connection;
import java.util.*;

public class QuizController {
   Set <Integer> list;
    @FXML
    public Label question;
    List<Question> questions;
    @FXML
    public Button opt1,opt2,opt3,opt4;
    public int cnt = 0;
    static int correct = 0;
    static int wrong = 0;
    @FXML
    private void initialize(){
        list = new HashSet<>();
        loadQuestions();
    }
    private void loadQuestions() {
        Connection connection = QuizDatabase.connectToDatabase();
        QuestionDao questionDAO = new QuestionDao(connection);
        questions = questionDAO.getAllQuestions();

        //cnt = (int)(Math.random()*10);
        cnt = random();
        Question currentQuestion = questions.get(cnt);
        question.setText(currentQuestion.getQuestionText());
        opt1.setText(currentQuestion.getOption1());
        opt2.setText(currentQuestion.getOption2());
        opt3.setText(currentQuestion.getOption3());
        opt4.setText(currentQuestion.getOption4());

    }

    @FXML
    public void opt1Clicked(ActionEvent event){
        if(checkAnswer(opt1.getText().toString())){
            correct +=1;
        }
        else{
            wrong +=1;
        }

        if(cnt == 5){
            try{
                Stage homeStage = (Stage)((Button) event.getSource()).getScene().getWindow();
                homeStage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                //stage.initStyle(StageStyle.TRANSPARENT);
                //scene.setFill(Color.TRANSPARENT);
                stage.show();

            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        else{
            cnt++;
            loadQuestions();
        }
    }

    @FXML
    public void opt2Clicked(ActionEvent event){
        if(checkAnswer(opt2.getText().toString())){
            correct +=1;
        }
        else{
            wrong +=1;
        }

        if(cnt == 5){
            try{
                Stage homeStage = (Stage)((Button) event.getSource()).getScene().getWindow();
                homeStage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                //stage.initStyle(StageStyle.TRANSPARENT);
                //scene.setFill(Color.TRANSPARENT);
                stage.show();

            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        else{
            cnt++;
            loadQuestions();
        }
    }
    @FXML
    public void opt3Clicked(ActionEvent event){
        if(checkAnswer(opt3.getText().toString())){
            correct +=1;
        }
        else{
            wrong +=1;
        }

        if(cnt == 5){
            try{
                Stage homeStage = (Stage)((Button) event.getSource()).getScene().getWindow();
                homeStage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                //stage.initStyle(StageStyle.TRANSPARENT);
                //scene.setFill(Color.TRANSPARENT);
                stage.show();

            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        else{
            cnt++;
            loadQuestions();
        }
    }
    @FXML
    public void opt4Clicked(ActionEvent event){
        if(checkAnswer(opt4.getText().toString())){
            correct +=1;
        }
        else{
            wrong +=1;
        }

        if(cnt == 5){
            try{
                Stage homeStage = (Stage)((Button) event.getSource()).getScene().getWindow();
                homeStage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                //stage.initStyle(StageStyle.TRANSPARENT);
                //scene.setFill(Color.TRANSPARENT);
                stage.show();

            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        else{
            cnt++;
            loadQuestions();
        }
    }

    boolean checkAnswer(String answer) {

        Question currentQuestion = questions.get(cnt);
        String correctAnswer = currentQuestion.getAnswer();

        return answer.equals(correctAnswer);
    }

    public int random() {
        Random random = new Random();
        int min = 0;
        int max = 9;
        int num;
        while(true){
            num = random.nextInt(max - min + 1) + min;
            if(!list.contains(num)){
                break;
            }
        }
        list.add(num);
        return num;
    }

}
