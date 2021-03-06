package de.jinx.trainplaner.controllers;

import de.jinx.trainplaner.obj.Exercise;
import de.jinx.trainplaner.obj.ExerciseEntry;
import de.jinx.trainplaner.obj.Model;
import de.jinx.trainplaner.obj.MuscleGroups;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class ExerciseWindowCon {

    private Exercise myExercise;
    
    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDelete;

    @FXML
    private TextArea areaInfos;

    @FXML
    private TableColumn<ExerciseEntry, LocalDate> clmnDate;

    @FXML
    private TableColumn<ExerciseEntry, Integer> clmnReps;

    @FXML
    private TableColumn<ExerciseEntry, Integer> clmnSets;

    @FXML
    private Label exerciseID;

    @FXML
    private Label exerciseName;

    @FXML
    private ListView<String> listTargetedMuscles;

    @FXML
    private TableView<ExerciseEntry> tblData;

    @FXML
    void addEntry(ActionEvent event) throws IOException {
        /* Add addEntry Window
        //Create Stage
        Stage entryStage = new Stage();
        entryStage.setTitle("Add Entry");
        //Create view from FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/de/jinx/trainplaner/createExercise.fxml"));
        //Set view in window
        entryStage.setScene(new Scene(loader.load()));
        entryStage.initModality(Modality.APPLICATION_MODAL);
        //Launch
        entryStage.show();
        */

    }

    @FXML
    void deleteEntry(ActionEvent event) {
        //TODO: Delete selected item
    }

    @FXML
    public void initialize() {

        clmnDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        clmnSets.setCellValueFactory(new PropertyValueFactory<>("sets"));
        clmnReps.setCellValueFactory(new PropertyValueFactory<>("reps"));

    }


    public void init(Exercise myExercise) {
        this.myExercise = myExercise;

        if(myExercise.getName() != null)
            exerciseName.setText(myExercise.getName());

        exerciseID.setText(String.valueOf(myExercise.getId()));

        if(myExercise.getInfo() != null)
            areaInfos.setText(myExercise.getInfo());

        if(myExercise.getTargetedMuscles() != null)
            for (MuscleGroups muscles : myExercise.getTargetedMuscles()) {
                listTargetedMuscles.getItems().add(Model.capitalize(muscles.name()));
            }

        try {
            //TODO: Date formating?
            ObservableList<ExerciseEntry> observableEntries = FXCollections.observableArrayList(myExercise.getEntries());
            tblData.setItems(observableEntries);
        } catch (Exception e) {
        }

    }
}
