package com.example.gamemultiplechoice;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;

public class ResultController {
    @FXML
    public Label marks,marksText;
    public ProgressIndicator correctQuiz,wrongQuiz;

    @FXML
    private void initialize(){
        marks.setText(QuizController.correct + "/5");

        double correct = (double) QuizController.correct/5;
        correctQuiz.setProgress(correct);

        double wrong = (double) QuizController.wrong/5;
        wrongQuiz.setProgress(wrong);

        if(wrong <= 4.0){
            marksText.setText("Loser");
        }
        else{
            marksText.setText("Good");
        }

    }
}
