package de.jinx.trainplaner.controllers;

import de.jinx.trainplaner.TP_Main;
import de.jinx.trainplaner.obj.Exercise;
import de.jinx.trainplaner.obj.Model;
import de.jinx.trainplaner.obj.MuscleGroups;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.controlsfx.control.PropertySheet;

public class CreateExerciseCon {
    @FXML
    private TextArea areaInfo;

    @FXML
    private Button btnAddMuscle;

    @FXML
    private Button btnFinish;

    @FXML
    private TextField fieldName;

    @FXML
    private ChoiceBox<MuscleGroups> muscles;

    @FXML
    private ListView<MuscleGroups> musclesList;

    @FXML
    public void initialize() {
        for (MuscleGroups ms: MuscleGroups.values()) {
            muscles.getItems().add(ms);
        }
    }

    @FXML
    void addMuscle(ActionEvent event) {
        musclesList.getItems().add(muscles.getSelectionModel().getSelectedItem());
    }

    @FXML
    void finish(ActionEvent event) {
        //TODO: Finish Button + saving
        Exercise exercise = new Exercise(Model.highestID(),
                fieldName.getText(),
                areaInfo.getText(),
                musclesList.getItems().sorted());
        TP_Main.getModel().addExercise(exercise);
        TP_Main.getModel().saveExercises();
    }

}
