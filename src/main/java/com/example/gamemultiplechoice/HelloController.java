package com.example.gamemultiplechoice;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HelloController {
    @FXML
    private Button playButtonQuiz;
    @FXML
    private void Initialize(){
        playButtonQuiz.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                try{
                Stage homeStage = (Stage)((Button) event.getSource()).getScene().getWindow();
                homeStage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("quiz.fxml"));
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
        });
    }

}