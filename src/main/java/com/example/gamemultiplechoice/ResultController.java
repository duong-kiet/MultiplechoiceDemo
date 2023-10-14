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
        marks.setText(QuizController.correct + "/2");

        double correct = (double) QuizController.correct/2;
        correctQuiz.setProgress(correct);

        double wrong = (double) QuizController.wrong/2;
        wrongQuiz.setProgress(wrong);

        marksText.setText("Loser");

    }
}
