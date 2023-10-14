package com.example.gamemultiplechoice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class QuizController {
    @FXML
    public Label question;
    @FXML
    public Button opt1,opt2,opt3,opt4;
    int cnt =0;
    static int correct = 0;
    static int wrong = 0;
    @FXML
    private void initialize(){
        loadQuestions();
    }
    private void loadQuestions() {
        if(cnt == 0){
            question.setText("1.Do you love me");
            opt1.setText("Yes");
            opt2.setText("Absulutely");
            opt3.setText("Of course");
            opt4.setText("Definitely");
        }
        if(cnt == 1){
            question.setText("2.I love you");
            opt1.setText("Yes");
            opt2.setText("Absulutely");
            opt3.setText("Of course");
            opt4.setText("Definitely");
        }
    }

    @FXML
    public void opt1Clicked(ActionEvent event){
        if(checkAnswer(opt1.getText().toString())){
            correct +=1;
        }
        else{
            wrong +=1;
        }

        if(cnt == 2){
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
        if(cnt == 0){
            if(answer.equals("Yes")){
                return true;
            }
            else{
                return false;
            }
        }
        if(cnt == 1){
            if(answer.equals("Yes")){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    @FXML
    public void opt2Clicked(ActionEvent event){
        if(checkAnswer(opt2.getText().toString())){
            correct +=1;
        }
        else{
            wrong +=1;
        }

        if(cnt == 2){
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

        if(cnt == 2){
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

        if(cnt == 2){
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
}
