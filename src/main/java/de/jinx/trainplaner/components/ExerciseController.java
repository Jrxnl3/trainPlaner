package de.jinx.trainplaner.components;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class ExerciseController {

    @FXML
    private AnchorPane exercise;

    @FXML
    private AnchorPane extraContainer;

    @FXML
    private AnchorPane repTimeContainer;

    @FXML
    private AnchorPane setContainer;

    @FXML
    private void initialize(){
        System.out.println("init");
        System.out.println(exercise.getScaleX());
    }

}
