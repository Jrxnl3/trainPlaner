package de.jinx.trainplaner.components;

import de.jinx.trainplaner.obj.Exercise;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ExerciseCompCon {

    @FXML
    private CheckBox boxSelected;

    @FXML
    private Button btnShowExercise;

    @FXML
    private Label lblName;

    private Exercise exercise;

    @FXML
    private ToggleButton tglBtnSelected;

    @FXML
    void showExercise(ActionEvent event) throws IOException {
        //Create Stage
        Stage exerciseWindow = new Stage();
        exerciseWindow.setTitle(exercise.getName());

        //Create view from FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/de/jinx/trainplaner/ExerciseWindow.fxml"));

        //Set view in window
        exerciseWindow.setScene(new Scene(loader.load()));

        ExerciseWindowCon exWinCon = loader.getController();
        exWinCon.init(exercise);

        exerciseWindow.initModality(Modality.APPLICATION_MODAL);


        //Launch
        exerciseWindow.show();
    }

    public void instantiate(Exercise exercise){
        this.exercise = exercise;
        lblName.setText("ID: | " + exercise.getName());
    }

}
