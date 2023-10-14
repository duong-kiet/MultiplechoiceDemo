module com.example.gamemultiplechoice {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.gamemultiplechoice to javafx.fxml;
    exports com.example.gamemultiplechoice;
}